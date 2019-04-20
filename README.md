Release Notes version Outbreak Costing App 1.0
NEW FEATURES
Android App
  Added MySQL database integration for sign up functionality
  Added categories for data input
  Added outbreak choice option
  Added closeout functionality
  Added login functionality to home screen
iOS App
  Added sign-up functionality to home screen for new users
  Added categories for data input
  Added login functionality to home screen
BUG FIXES
Android App
  Fixed layout problems on prospective and retrospective hours screens
iOS App
  Fixed login issues and frozen pages
KNOWN BUGS/LACKING FUNCTIONALITY
Android App
  Must reverse through all screens to reach main screen
  Calendar does not show further data information
iOS App
  Once a certain section is selected from the sidebar, the user can not go back to a previous page within that section (due to lack of   native iOS back button)

Install Guide Outbreak Costing App 1.0
ANDROID APP
Pre-requisites 
  You must have JDK 1.8 installed and configured 
  You must have access to a MySQL database
Dependent libraries that must be installed
  You must have the latest version of Android Studio installed and configured (version 3.0.1 or higher). See https://developer.android.com/studio/
Download instructions
  Clone repository from https://github.com/niazpour/JD8348spring.git
Build instructions
  Open up Android Studio and open an existing Android Studio project using the downloaded repository
  Build the project by pressing the hammer icon in the bar on the top right
  Configure the suggested Android SDK
Installation of application
  If installing on an Android mobile device:
  Enable USB debugging in the Settings menu under “Developer Options”
  Connect Android device to computer using USB cable
  If prompted, allow USB debugging on the mobile device
  In Android Studio, click the triangle “play” button in the bar on the top right 
  Select the mobile device from the “connected devices” list and press “OK”
Run instructions
  If running on the Android Studio emulator:
  In Android Studio, click the triangle “play” button in the bar on the top right 
  Click “Create New Virtual Device”
  Select the device of choice under the “Phone” tab and click “Next”
  Download API 27 and click “Next”
  Click “Finish”
  Once the device is configured, select the device in the “Available Virtual Devices” list and click “OK”
  If running on an Android Mobile Device:
  Make sure the application is already downloaded on the device (if not, see Installation of Application)
  Run the application (called Cost Outbreak Tool) on the mobile device
Troubleshooting
  If initial build fails: build the project again
  If “ERROR: No toolchains found in the NDK toolchains folder for ABI” then upgrade plugin to version 3.3.0 and sync project
  Android Studio Troubleshooting Website: https://developer.android.com/studio/troubleshoot 
IOS APP
Pre-requisites 
	You must have a Mac running macOS 10.13.6 (Mojave) or later
Dependent libraries that must be installed
  You must have the latest version of Xcode installed and configured (version 10.1 or higher). See https://developer.apple.com/xcode/
Download instructions
  Clone repository from https://github.com/niazpour/JD8348spring.git
Build instructions
Installation of application
Run instructions
Troubleshooting 
