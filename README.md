# slimboot-archetype 

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/fortytwobinary/labdocs/blob/main/LICENSE)

[![VirtualYou][vy-image]](https://virtualyou.info)

This Maven archetype creates a lightweight Spring Boot API project. It is part 
of the FortyTwoBinary Beast Kubernetes platform.

### Configuration

Clone the main branch of this repo. To build the archetype, run Apache Maven in the root
or parent directory of the project.

```bash
mvn clean install
```
The archetype will be installed in your local Maven repository cache.

### Run

To run the archetype:
```bash
mvn -V --batch-mode archetype:generate \
-DarchetypeGroupId=com.fortytwobinary \
-DarchetypeArtifactId=slimboot-archetype \
-DarchetypeVersion=0.1.1-SNAPSHOT \
-DgroupId=com.fortytwobinary \
-Dversion=0.1.0-SNAPSHOT \
-DartifactId=xyz-api
```
The new project archetype will be created in the directory where you ran the command.

### Contact

Contact:

* David L Whitehurst, dlwhitehurst@gmail.com

[vy-image]: https://wordpress.fortytwobinary.com/wp-content/uploads/2021/12/vy.png

