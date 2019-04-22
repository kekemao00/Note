@echo off
:: 获取当前文件夹的文件大小
@for /f "tokens=3,4*" %%i in ('dir /a-d^|find ":"') do @echo %%i %%j >> bat.txt
pause