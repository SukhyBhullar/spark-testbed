sudo apt-get update
sudo apt-get -y install openjdk-7-jdk

sudo apt-get install git -y
#sudo update-java-alternatives -s java-7-oracle
#java -version

sudo mkdir /usr/spark
sudo wget http://www.mirrorservice.org/sites/ftp.apache.org/spark/spark-1.5.1/spark-1.5.1.tgz -O /usr/spark/spark-1.5.1.tgz


cd /usr/spark/spark-1.5.1/
sudo sbt/sbt assembly
	
	