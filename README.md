# Spanning-Tree-Simulation

[![Build Status](https://travis-ci.com/lucastanger/Spanning-Tree-Simulation.svg?branch=master)](https://travis-ci.com/lucastanger/Spanning-Tree-Simulation)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/lucastanger/Spanning-Tree-Simulation)
![GitHub issues](https://img.shields.io/github/issues/lucastanger/Spanning-Tree-Simulation)
![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/lucastanger/Spanning-Tree-Simulation?include_prereleases)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5a913f28fbf54894b6ba0b872816f0d5)](https://app.codacy.com/manual/lucastanger/Spanning-Tree-Simulation?utm_source=github.com&utm_medium=referral&utm_content=lucastanger/Spanning-Tree-Simulation&utm_campaign=Badge_Grade_Dashboard)

Study project for the lecture laboratory network engineering in the 4th semester.
# Prerequisites
To run the project, you need to have Kotlin v1.3 installed.
## Kotlin
### SDKMAN!
An easier way to install Kotlin on UNIX based systems such as OS X, Linux, Cygwin, FreeBSD and Solaris is by using SDKMAN!. Simply run the following in a terminal and follow any instructions:
```
$ curl -s https://get.sdkman.io | bash
```
Next open a terminal and install Kotlin with:
```
$ sdk install kotlin
```
### Homebrew
Alternatively, on OS X you can install the compiler via Homebrew.
```
$ brew update
$ brew install kotlin
```
## Maven
To have all external project packages installed, use the following maven steps:
```
$ mvn install
$ mvn compile
```
or without .class files:
```
$ mvn install
$ mvn package
```

# Built With
..* [Maven](https://maven.apache.org/) - Dependency Management

# Versioning
The project uses [SemVer](https://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/lucastanger/Spanning-Tree-Simulation/tags).

# Authors
..* **Luca Stanger** - Initial work - [Student @ DHBW Stuttgart](https://www.dhbw-stuttgart.de/home/)

# License
This project is licensed under the **Apache License 2.0** - see the [LICENSE.MD](https://github.com/lucastanger/Spanning-Tree-Simulation/blob/master/LICENSE) file for details

# Ensuring the functionality
To ensure the algorithm is working properly, the project is covered using coveralls. [![Coverage Status](https://coveralls.io/repos/github/lucastanger/Spanning-Tree-Simulation/badge.svg?branch=master)](https://coveralls.io/github/lucastanger/Spanning-Tree-Simulation?branch=master)
