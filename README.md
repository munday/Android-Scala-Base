How to get this to work
=======================

1. change the sdk.dir and scala.dir properties in local.properties of the project to reflect your setup
2. change the ant.android.scala.dir property in local properties of the project to the location that you copied the ant-android-scala directory
3. change the proguard.dir to point to your proguard binary
4. set up the key.store, key.alias, key.store.password, and key.alias.password with your keystore info
5. ... 
7. code Scala
8. "ant debug install" to sign with debug keys and install to device, 
 
