[ -f /usr/data/practice.csv ] && echo "Practice File exists, skipping download" || (sudo mkdir /usr/data/ && sudo wget http://datagov.ic.nhs.uk/T201202ADD%20REXT.CSV -O /usr/data/practice.csv)
[ -f /usr/data/prescription.csv ] && echo "Prescription File exists, skipping download" || sudo wget http://datagov.ic.nhs.uk/T201109PDP%20IEXT.CSV -O /usr/data/prescription.csv
/usr/spark/spark-1.3.0/bin/spark-shell -i /vagrant/scripts/runcodechallenge.scala