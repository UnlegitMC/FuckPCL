# FuckPCL
A library to detect PCL(Plain Craft Launcher)

# Why trying to block it
It just a launcher and it EVEN needs to pay to unload full features!  
But they called "sponsor" but we think this NOT simple sponsor it JUST pay.  
This the reason of we're creating this lib

# Use
If your project are on kotlin
~~~kotlin
import com.guimc.fuckpcl.PCLChecker

PCLChecker.fullCheck(Minecraft.getMinecraft().mcDataDir/*, true*/) // boolean
~~~
If your project are on java
~~~java
import com.guimc.fuckpcl.PCLChecker;

PCLChecker.INSTANCE.fullCheck(Minecraft.getMinecraft().mcDataDir/*, true*/);
~~~