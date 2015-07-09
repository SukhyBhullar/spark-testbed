(cd /vagrant/scripts/DemoTrades/; sbt package)
if [ "$?" = "0" ]; then
sudo /usr/spark/spark-1.4.0/bin/spark-submit --class "abide.examples.DemoTrades" --master local[4] /vagrant/scripts/DemoTrades/target/scala-2.10/demotrades_2.10-1.0.jar
fi