@echo off

echo ^---------------------------
echo ^| Welcome to Install apk!
echo ^---------------------------

:inputPath 

set /p path1=Input apk path: 

if "%path1%"=="" goto inputPath 

echo Installing...

adb install -r %path1%

goto inputPath