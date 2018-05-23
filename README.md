# Sample java containers for 9, 10, 11

## Run

1. Make sure you have docker installed.

2. Clone this repo.

3. Navigate to the java source folder:

```
$ cd java-src/
```

4. build the local image for the target java version you want:

```bash
$ docker build -t java-img-9 -f ../docker-java9/Dockerfile .
```

5. run the container for the previously created image

```bash
$ docker container run -it --rm --name java-ctnr-9 java-img-9
```

6. run the container in interactive mode and play with jshell

```bash
$ docker container run -it --rm --name java-ctnr-9 java-img-9 /bin/sh

# jshell
May 22, 2018 9:51:20 AM java.util.prefs.FileSystemPreferences$1 run
INFO: Created user preferences directory.
|  Welcome to JShell -- Version 9.0.4
|  For an introduction type: /help intro

jshell>
```

## Play with the specific features of each java version

Along with the image, different files with version specific features are shipped.

Load an interactive shell of a container, for example the java version 10:

```bash
$ docker container run -it --rm --name java-ctnr-10 java-img-10 /bin/sh
```

list the files:

```
# ls
Hello.class  Hello.java  Hello_java10.java  Hello_java11.java  Hello_java9.java
```

notice the following different files for each version, assuming you are in the container for version 10, try to compile the file for java11:

```
# javac Hello_java11.java
```

you should receive an error, but if you do the same in the java 11 container you should see the code compile and you can then run it.
