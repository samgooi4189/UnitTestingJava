

wget 'http://central.maven.org/maven2/org/mockito/mockito-all/1.10.19/mockito-all-1.10.19.jar'
sudo mkdir /usr/local/mockito
sudo cp ./mockito-all-1.10.19.jar /usr/local/mockito
rm ./mockito-all-1.10.19.jar


echo 'MOCKITO_HOME="/usr/local/mockito"' >> ~/.profile
echo 'CLASSPATH="$CLASSPATH:$MOCKITO_HOME/mockito-all-1.10.19.jar"' >> ~/.profile
source ~/.profile
