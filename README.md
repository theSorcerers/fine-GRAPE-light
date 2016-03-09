# fine-GRAPE-light
This is just a sample script to run certain parts of the [fine-GRAPE API usage collection technique](http://flosshub.org/sites/flosshub.org/files/msr2015data.pdf). In this sample we provide 2 runner files one that collects method invocations from a java file and another that collects the API methods and annotations from the API JAR file. The sample we provide uses the JBoss-Logging api as an example. 

## Setup Instructions
To run the fine-grape-light scripts, you will need Java 8 or higher to be installed. The project can be imported into either Eclipse or IntelliJ as a Maven project. Finally, all the JAR files in the `libs` folder have to be added to the build path. For instructions on how to do this eclipse please refer [here](https://wiki.eclipse.org/FAQ_How_do_I_add_an_extra_library_to_my_project's_classpath%3F) and for IntelliJ please refer [here](https://www.jetbrains.com/idea/help/configuring-module-dependencies-and-libraries.html#add_existing_lib). 

## Java Invocation Collection
The `JavaInvocationRunner` class in the package `org.sorcerers.runner` can be used as a sample to parse a single file. The runner parses two files that are present in the `javaFiles` folder and writes the collected type-checked method invocations that are retrieved to an object file.

## API Information Collection
The `APIParsingRunner` class in the package `org.sorcerers.runner` is a sample file that parses the features exposed by the API. The first step in parsing is the unpacking of the API JAR file. The class files that are extracted are then parsed using ASM and a model of each API class is returned. 
