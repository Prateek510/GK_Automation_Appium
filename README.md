# GK_Automation_Appium
In this project, I have automated the Android mobile application using Appium server, setting the desired capabilities like device name, platform name, appPackage, appActivity.
First the apk file of the application is being downloaded and save to the local drive.
since, this is not the good practice to use the apk file in the source code, so I have used the destination URL of my local repository for the apk file.
Then connected the mobile device with the laptop using Veysor software which is free in the market and quite useful in order to generate the mobile emulator on the laptop screen. The device is being connected using the USB cable.
Then in order to check the available devices, the command 'adb devices' is being executed on the command prompt. so, it will show the relevant device which is being connected with the laptop.
Now that we know our mobile device is being connected to the laptop and emulator is working, we can install the application on the mobile device using the command adb install "path of the apk file". The app gets installed on the mobile device.
In order to automate this application, the tools used are, Selenium, Maven.
Language-> Java
Framework-> TestNG
Firstly, we have to set the desired capabilities such as device name, platform name, appPackage, appActivity,etc.
Appium server has to be started up and running. The host url for the appium server has to be captured and set in our java class.
The scenario is selecting the Genres button on the App-> Navigating to the particular genre(in this case cinematic)->Playing a particular song in that genre.
Locators-> In this project, mostly the locators used are xpaths since, the element IDs were not in the working conditions.
The locators have been identified using the Appium server itself.
Separate class file as 'Object repository' has been created for storing the element properties.
Execution-> since the framework is testNG, I have configured the testNG.xml file in POM.xml of Maven. The project can simply be run using the command mvn clean install.
Separate class named as 'Baseclass' has been created in order to set all the desired capabilities.
