package io.jvz.maven;

import java.io.InputStream;
import java.util.Properties;

public class App {
  
  public static void main(String[] args) throws Exception {
    
    String propertiesFile = "sql.properties";
    if (args.length == 1) {
      propertiesFile = args[0];
    }
    
    Properties p = new Properties();
    InputStream is = App.class.getClassLoader().getResourceAsStream(propertiesFile);
    p.load(is);
    
    String name = p.getProperty("name");
    System.out.println(name);
  }
}