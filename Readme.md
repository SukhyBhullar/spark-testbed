#Spark Vagrant Test Bed

This repo contains a vagrant box for a running a standalone spark instance which builds itself. The process of building the box takes a while but after running once gives an installed Spark VM. This was created for my enjoyment and pleasure.

_Note: this is still a work in progress so if anyone has issues ping me_

## Installation

To install this box there are two prerequisites

**Install Virtualbox** - Virtualbox can be downloaded [here](https://www.virtualbox.org/wiki/Downloads)

**Install Vagrant** - Vagrant can be downloaded [here](https://www.vagrantup.com/downloads.html)

Once these are done clone this repository to a directory of your choice then in command prompt `cd` to said directory and run the command

`vagrant up`

This will take a super long time as it will download some stuff and build spark from source. You should have a virtualbox window with some kind of prompt in there running through lots of things, or at the very least command prompt will be outputting lots of lines. Once this is all complete we are done.

## Usage

To open the box again you can run

`vagrant up`

This will reload the box. The default login is
- username : vagrant
- password : vagrant

Spark is located in /usr/spark/spark-1.3.0/ and the shell can be run using:

`/usr/spark/spark-1.3.0/bin/spark-shell`

I have also put a couple of examples in there, you can run the first two questions of the coding challenge by running

`sh /vagrant/scripts/runcodingchallenge.sh`

Or run an example from the spark site

`sh /vagrant/scripts/scratchpad.sh`

My current workflow has been to change scripts\scratchpad.scala in the git repository, then run the shell script to execute it, this file is shared between our local file system and the virtual machine, so all changes will be immediately up to date.

## Customisation

Changing the box is easy using vagrant.

### Use my own ssh

I tend to use putty instead the virtualbox gui (using the gui in the base reop to make it easy for people to get this running). To stop running the gui edit the file "Vagrantfile" and comment out the line:

`vb.gui = true`

Once this is done the virtual box gui will not load and the only way to access the box is to ssh to 127.0.0.1, port 2222. If you have ssh installed you can run:

`vagrant ssh`

Which may pick up your command line ssh.

### Run something different on up

When provisioning this box we run a set of commands after it has been created. This is defined in the bounds of:

```ruby
config.vm.provision "shell", inline: <<-SHELL

...linux commands here

SHELL
```

Feel free to change anything within here. Once this is done run:

`vagrant destroy`

then

`vagrant up`

This will delete the box and start again, this takes time.

### MOAR RAM

Easy change to get more RAM on the box is to modify the line:

`vb.memory = "4096"`

To how much ram you want.

## Todo

Heres a list of stuff I want to try:

- Pull the files for coding challenge into Spark SQL and do the challenge as a SQL command

- Change the vagrant stuff to run slave boxes and see what, if any, impact they have on performance, a couple of repos online claim to do this but I haven't got them working.

- Do stuff properly and not just execute spark shell all the time

- Change vagrant from running shell commands to a proper chef/puppet deployment.

- Maybe pull a C# project, connect via ODBC, then use sparks creamy goodness.

- Maybe finish the coding challenge in the current script/ optimise it a bit, but thats boring.
