Maybe if I find the need of other archetypes others will show up or get better. I made the first one just out of curisity and to safe time doing generating projects for school.

Here is the command you need to run the first one after an install of the artefact to local depository.
To use it first you need to install to by running

```
mvn install
```
This archetype generates simple maven project with lombok, executable jar junit and library for primitive collections included.

```
mvn archetype:generate -DarchetypeArtifactId=java8-executable-jar-archetype -DarchetypeGroupId=cz.nitramek -DarchetypeVersion=0.0.1 -DgroupId=cz.nitramek -DartifactId=myProject -DinteractiveMode=false
```


If you want to use IntellJ idea to generate the project you need to specify repository `local`. Then when you are creating the project you let Maven to create the project folder.
