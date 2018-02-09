# REFUCTORED Spring PetClinic Sample Application 
see https://github.com/buschmais/spring-petclinic for the forked version of the original

[![Build Status](https://travis-ci.org/JavaOnAutobahn/spring-petclinic.svg?branch=master)](https://travis-ci.org/JavaOnAutobahn/spring-petclinic)


# Prerequisites

## Minimum requirements
* Oracle Java Development Kit with Version >=8 ([download](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html))
* Git ([download](https://git-scm.com/downloads))

## Optional
* To produce nicely looking diagrams, install GraphViz ([download](https://www.graphviz.org/download/))

# Installing and getting to know the sample application
Hint: Preferable, you use the Git bash command line or any Unix-like shell for these tasks.

For our use case, we take an sample application of the Spring Framework. Basica

## Understanding the Spring Petclinic application with a few diagrams
<a href="https://speakerdeck.com/michaelisvy/spring-petclinic-sample-application">See the presentation here on SpeakerDeck</a>

## Downloading and running the `petclinic` web application
First, we want to download the source code of the application with Git, build it with Maven (using `mvnw`) and running the embedded web application server `tomcat7`:
```
	git clone https://github.com/JavaOnAutobahn/spring-petclinic.git
	cd spring-petclinic
	./mvnw tomcat7:run
```
You can then access the `petclinic` web application with your browser here: http://localhost:9966/petclinic/

This is what it looks like:

![](docs/screenshots/petclinic_start.png)

To shutdown the server, press `Ctrl` + `X` on the command line.


## Running jQAssistant / Neo4J locally

After shuting down the web application server, you can start jQAssistant with this Maven:
```
	./mvnw jqassistant:server
```
You should see the following on the command line:

![](docs/screenshots/mvn_jqassistant_start.png)

You can then access the Neo4J browser frontend with the scanned data here: http://localhost:7474

This is what it should look like after clicking the button in the upper left corner (symbol may differ):

![](docs/screenshots/neo4j_start.png)


Next, you can click on the various labels in the drawer and have fun with jQAssistant/Neo4j!
