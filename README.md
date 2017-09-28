# State Check Adapter

This project is an adapter between a local python server ,which keeps data about banning state for a list of domain adresses, and any java application .

Python server responses in JSON to requests and this api converts JSON to a cunstom built object.

## How to have this project?

You can have this project by downloading it via download button that exists in right above the project files.

You can choose the download type that is suitable for you.

Now you're ready to import it.

or

If you are using git bash. Use the following command to clone this project into your

local directory:

```
git clone http://codelab.esbintra/zehra.yilmaz/State-Check-Adapter.git
```

### Prerequisites

If you are using mvn(2+), you only need to have java installed in your system to build and run this project.
 
 or
 
There are several jar files that are need to be in your system to run this project if you are not using maven.

If you don't have following jar files you can download by clicking on them.


* [org.json.jar](http://www.mygrid.org.uk/maven/repository/org/json/json/NO-VERSION/json-NO-VERSION.jar)
* [httpclient-4.2.3.jar](http://central.maven.org/maven2/org/apache/httpcomponents/httpclient/4.2.3/httpclient-4.2.3.jar)
* [commons-logging-1.2.jar](http://central.maven.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar)
* [httpcore-4.2.3.jar](http://central.maven.org/maven2/org/apache/httpcomponents/httpcore/4.2.3/httpcore-4.2.3.jar)

You need to have java installed in your system, if you dont't you can download from [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

You can use one of the following IDEs to compile this api.

* [Eclipse](https://eclipse.org/ide/)
* [NetBeans](https://netbeans.org/)
* [IntelliJ IDEA](https://www.jetbrains.com/idea)

### Installing

Use [How to have this project?](#Anchors-in-markdown) to download this project.

If you are not using mvn, just open the a-project with your IDE and you can run it.

or

To create the files in this git repo we've already run

mvn archetype:generate from http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

And...

To compile project use following commands in command prompt:

```
cd path-to-StateCheckAdapter

mvn clean install

```

After building project, you can run it with following command:

```
mvn exec:java -Dexec.mainClass=tr.org.esb.StateCheckAdapter.TestClient
```

Running mvn clean will get us back to only the source Java and the pom.xml

while running mvn compile produces a class file.

Running mvn clean compile exec:java requires http://mojo.codehaus.org/exec-maven-plugin/

Running java -jar target/my-app-1.0-SNAPSHOT.jar requires http://maven.apache.org/plugins/maven-shade-plugin/

Also, you can run tests with mvn test.


### How to create javadoc?

[What is javadoc?](https://en.wikipedia.org/wiki/Javadoc)

To use javadoc command, open a terminal or command prompt.

Change your directory to where tour source is using 'cd' command.

```
cd C:/YOUR/SOURCE/DIRECTORY
```

Following command shows how to use javadoc command.

```
javadoc -sourcepath code-path -d destination package-names
```

Suppose you want to use javadoc for creating the API of your class which is called example.java

```
javadoc -d doc example.java
```
This command will create a new folder called doc and put the API files in this new folder.


## Authors

* **Zehra Yılmaz** - *Initial work* - [ZehraYılmaz](https://github.com/ZehraYilmaz)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

