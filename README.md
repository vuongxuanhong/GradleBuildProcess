# Build Process

Application Module
	- source code
	- resouce files 
	- aidl file

Dependencies
	- libray modules
	- aar libs
	- jar libs


Application Module + Dependencies = X


X + Compliers = Dex files contain bytecodes to run on any android devices


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

