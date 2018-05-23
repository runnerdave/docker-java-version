# Sample java containers for 9, 10, 11

Make sure you have docker installed.

Clone this repo.

Navigate to the java source folder:

```
$ cd java-src/
```

* build the local image for the target java version you want:

```bash
$ docker build -t java-img-9 -f ../docker-java9/Dockerfile .
```

* run the container

```bash
$ docker container run -it --rm --name java-ctnr-9 java-img-9
```

* run the container in interactive mode and play with jshell

```bash
$ docker container run -it --rm --name java-ctnr-9 java-img-9 /bin/sh

# jshell
May 22, 2018 9:51:20 AM java.util.prefs.FileSystemPreferences$1 run
INFO: Created user preferences directory.
|  Welcome to JShell -- Version 9.0.4
|  For an introduction type: /help intro

jshell>
```