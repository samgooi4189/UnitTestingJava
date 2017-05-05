#!/bin/bash

# download junit and put into a folder that you wanted
wget 'https://github.com/downloads/junit-team/junit/junit-4.10.jar'
sudo cp ./junit-4.10.jar /usr/bin/
rm ./junit-4.10.jar

# set environment variables for junit
export JUNIT_HOME="/usr/local"
export CLASSPATH="$CLASSPATH:$JUNIT_HOME/junit-4.10.jar"
