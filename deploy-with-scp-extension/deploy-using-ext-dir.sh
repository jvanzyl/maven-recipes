#!/bin/sh

# This script assumes you have copied the contents of the
# ssh directory to ${M2_HOME}/lib/ext where the extensions will loaded

mvn deploy:deploy-file -B \
                       -Durl=scp://localhost/tmp/repository \
                       -DrepositoryId=releases \
                       -Dfile=upload-1.0.jar \
                       -DgroupId=com.mycompany \
                       -DartifactId=upload \
                       -Dversion=1.0 \
                       -Dpackaging=jar
