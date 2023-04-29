**nashtech-sonar-pmd-checkstyle-spotbugs-integration**

added plugins in POM.xml for 

1.PMD

```
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-pmd-plugin</artifactId>
            <version>${pmdVersion}</version>
        </plugin>
        
```

2.checkstyle - modified configuration consoleOutput, failsOnError, failOnViolation for passing the build if there are checkstyle issues.

```
       <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-checkstyle-plugin</artifactId>
            <version>${checkStyleVersion}</version>
            <configuration>
                <consoleOutput>false</consoleOutput>
                <failsOnError>false</failsOnError>
                <failOnViolation>false</failOnViolation>
            </configuration>
       </plugin>
       
```

3.spotbugs

```
        <plugin>
            <groupId>com.github.spotbugs</groupId>
            <artifactId>spotbugs-maven-plugin</artifactId>
            <version>${spotbugsVersion}</version>
        </plugin>

```