# Sample java containers for 9, 10, 11

Make sure you have docker installed.

Clone this repo.

Navigate to the folder you want, for example:

```bash
$ cd java9
```

* build the local image:

```bash
$ docker build -t java-app .
```

* run the container

```bash
$ docker container run -it --rm --name java9 java-app
```

* run the container in interactive mode and play with jshell

```bash
$ docker container run -it --rm --name java9 java-app /bin/sh

# jshell
May 22, 2018 9:51:20 AM java.util.prefs.FileSystemPreferences$1 run
INFO: Created user preferences directory.
|  Welcome to JShell -- Version 9.0.4
|  For an introduction type: /help intro

jshell> 
```