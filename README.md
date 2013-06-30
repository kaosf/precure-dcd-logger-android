# Android App Template

Version 1.1.0

## Environment

* OS: Ubuntu 12.04 amd64
* JDK: Oracle JDK 1.6
* Eclipse: Eclipse IDE for Java EE Developers (4.2 (Juno))
* Apache Ant: 1.9.1
* Android SDK: r20.0.3-linux

## How was this created

1. Launch Eclipse
2. File > New > Other... > Android > Android Application Project
3. "New Android Application" wizard
    1. Create a new Android Application
        * Application Name: AndroidAppTemplate
        * Project Name: android-app-template
        * Package Name: net.kaosfield.app
        * Minimum Required SDK: API8: Android 2.2
        * Target SDK: API17: Android 4.2
        * Compile With: API17: Android 4.2
        * Theme: Holo Light
    2. Configure Project (all default)
        * Create custom launcher icon: checked
        * Create activity: checked
        * Mark this project as a library: unchecked
        * Create Project in Workspace: checked
        * Working sets > Add project working sets: unchecked
    3. Configure the attributes of the icon set (all default)
        * Foreground: Image
            * Image File: launcher_icon
            * Trim Surrounding Blank Space: checked
        * Foreground Scaling: Crop
        * Shape: None
        * Background Color: "white"
    4. Select whether to create an activity, and... (all default)
        * Create Activity: checked
        * select "Blank Activity"
    5. Create a new blank activity, with... (all default)
        * Activity Name: MainActivity
        * Layout Name: activity_main
        * Navigation Type: None

## Edit .gitignore

Ignore `.classpath`, `.project`, `.settings/`, `bin/`, `gen/` and `local.properties`.

```.gitignore
.classpath
.project
.settings
bin
gen
local.properties
```

## Manage "assets" directory

```sh
touch assets/.gitkeep
```

## Enable to build from command line

Execute `android update project -p ./`. `local.properties` file is generated by this command, and it should be ignored.

Now you can build with `ant debug` or `ant release`.

`android` command is `<android-sdk-path>/tools/android`.

`ant` command is [Apache Ant](http://ant.apache.org/).
