How to get this to work
=======================

1.	change the sdk.dir and scala.dir properties in local.properties of the project to reflect your setup
2.	change the proguard.dir to point to your proguard binary
3.	set up the key.store, key.alias, key.store.password, and key.alias.password with your keystore info
4.	code Scala
5.	"ant debug install" to sign with debug keys and install to device, "ant release install" for signing with release keys and installing. 
