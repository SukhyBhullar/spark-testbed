[ -f /usr/data/practice.csv ] && echo "Practice File exists, skipping download" || (sudo mkdir /usr/data/ && sudo wget http://datagov.ic.nhs.uk/T201202ADD%20REXT.CSV -O /usr/data/practice.csv)
[ -f /usr/data/prescription.csv ] && echo "Prescription File exists, skipping download" || sudo wget http://datagov.ic.nhs.uk/T201109PDP%20IEXT.CSV -O /usr/data/prescription.csv
/usr/spark/spark-1.3.1/bin/spark-submit --class "abide.examples.CodingChallenge" --master local[4] /vagrant/scripts/CodingChallengeScala/target/scala-2.10/coding-challenge_2.10-1.0.jar
