# Android VIPER templates
Templates for creating VIPER Kotlin files on Android Studio

## What is VIPER and how can I use it on Android?
[Here's an Article](https://cheesecakelabs.com/blog/using-viper-architecture-android/) that I've wrote about this subject, feel free to drop some comments!

## Template
To add the template to your Android studio you can clone this reposetory and run:
`$ ./moveToAndroidStudio.sh`
on your terminal.2e

<br>Then you can just create your files using the `New` menu:<br>
![New Files](https://i.imgur.com/9e1H9oX.png)

<br><br>This will open a configuration screen in which you can choose if you want an Activity, Fragment or Custom View, and if you want to generate the Presenter, Router, Interactor and Contracts file.
![Configure Module](http://i.imgur.com/fjdg2QS.png)

## Base Module
There's also a basic Base VIPER Module that your files can extend. This files add some common functionalities that can be used on your project
<br>This files are on the `Base` folder.
