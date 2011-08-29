#!/bin/sh

# This script creates an extension classpath that Maven can pick using the
# maven.ext.class.path property. So we create the extension classpath with
# the required JARs and hand it to Maven so it can find the scp wagon.

for jar in `ls ssh/*.jar`
do
  extClasspath="${jar}:${extClasspath}"
done

mvn deploy:deploy-file -B \
                       -Durl=scp://localhost/tmp/repository \
                       -DrepositoryId=releases \
                       -Dfile=upload-1.0.jar \
                       -DgroupId=com.mycompany \
                       -DartifactId=upload \
                       -Dversion=1.0 \
                       -Dpackaging=jar \
                       -Dmaven.ext.class.path="${extClasspath}"
