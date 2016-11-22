# Stubbr

## Introduction

Stubbr is an Eclipse plugin for defining business models and generating a JEE project stub. This should reduce the time used for setting up a JEE project significantly.

## Getting started

* Use Eclipse with following plug-ins/features
  * Xtext: http://www.eclipse.org/Xtext/
  * Xtend: http://www.eclipse.org/xtend/
  * Xpect: http://www.xpect-tests.org/
  * JBoss Tools (recommended): http://tools.jboss.org/
* Check out this project from git repository.
* Run Maven command 'mvn clean p2:site' in project com.laegler.stubbr.lang.p2 or just run the Eclipse launcher jar2osgi.launch
* Open com.laegler.stubbr.lang.target/com.laegler.stubbr.lang.target.target and set as target platform
* Run project com.laegler.stubbr.lang as Eclipse Application

## Usage

* Import the example project com.laegler.stubbr.example and modify the src/example.stubb