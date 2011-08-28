# Application with externalized configuration

This recipes demonstrates how to wrap up your application as an uber JAR, and create an assembly of the application along with externalized configuration in the form of properties. The final assembly when unpacked looks like the following:

```
app-0.0.1-SNAPSHOT
├── app-0.0.1-SNAPSHOT.jar
└── config
    ├── server.properties
    └── sql.properties
```

For details on how this setup is created with Maven, please refer to the [POM][1] for this recipe.

[1]: https://github.com/jvanzyl/maven-recipes/blob/master/simple-binary-with-configuration/pom.xml