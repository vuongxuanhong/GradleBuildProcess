This simple application demo how to build some variants with gradle config. We can have some different apk file for different build variants.

Example:

- freeDebug

- freeRelease <---- free version for app contains ads

- proDebug

- proRelease <----- pro version for app contains full features and no ads

- freeVietnamDebug <------- specific for each region

- proVietnamDebug <------- specific for each region

Let's take a look to build process first!

# Build Process

Application Module
- source code

- resouce files

- aidl file

Dependencies
- libray modules

- aar libs

- jar libs

Application Module + Dependencies  + Compliers = Dex files contain bytecodes to run on any android devices.


Dex file + complied resource files  + keystore(debug/release) = APK file (debug/release)


# Some principles

### Build types 

Build types define properties that Gradle uses when building and packaging your app.

Each build type can have some options inside.

example: debug or release type

- debug type have option `enable_test=true`

- release type have opton `enable_test=false`

### Product Flavors

Product flavors represent for different versions of your app. You may release a free version and a premium version. They are flavors.

example:

- free

- pro

### Build variants

Build variant is a composite of Build Types and ProductFlavor. 

example:

- debugfree

- releasefree

- debugpro

- releasepro

# Manifest entries

Manifest can also be overriden by each build variant. So you can manually specify permissions, feature enable, .... for each version

