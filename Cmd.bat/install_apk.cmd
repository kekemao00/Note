@echo off

cls

echo ^---------------------------
echo ^| Welcome to Install apk!
echo ^---------------------------

:change 

color a

set /p select=1 to install, 2 to uninstall:

if "%select%"=="1" goto install

if "%select%"=="2" goto uninstall

goto change

:install 

cls

set /p path1=Input apk path to install: 

if "%path1%"=="" goto install 

echo Installing...

adb install -r %path1%

goto change

:uninstall

cls

color c

set /p package=Input apk packageName to uninstall: 

if "%package%"=="" goto uninstall 

echo Uninstalling...

adb uninstall %package%

goto change
