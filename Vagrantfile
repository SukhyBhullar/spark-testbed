# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|

  config.vm.box = "ubuntu/trusty64"

  # Create a private network, which allows host-only access to the machine
  # using a specific IP.
  #config.vm.network "private_network", ip: "10.10.10.2"

  # Create a public network, which generally matched to bridged network.
  # Bridged networks make the machine appear as another physical device on
  # your network.
  # config.vm.network "public_network"

  config.vm.provider "virtualbox" do |vb|
    # Display the VirtualBox GUI when booting the machine
    vb.gui = true
  
    # Customize the amount of memory on the VM:
    vb.memory = "4096"
	vb.name = "solospark"
  end

  config.vm.provision "shell", inline: <<-SHELL
	
	sudo apt-get update
	sudo apt-get -y install openjdk-7-jdk
	sudo apt-get install git -y
	sudo mkdir /usr/spark
	sudo wget http://www.mirrorservice.org/sites/ftp.apache.org/spark/spark-1.3.0/spark-1.3.0.tgz -O /usr/spark/spark-1.3.0.tgz	
	sudo tar xf /usr/spark/spark-1.3.0.tgz -C /usr/spark
	cd /usr/spark/spark-1.3.0/
	sudo sbt/sbt assembly
	
  SHELL
end
