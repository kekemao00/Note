:: ���ļ�����ģ���� Android ��Ļ

::   Back:4
::	 $adb shell input keyevent 26 # wakeup
::   $adb shell input keyevent 82 # unlock
echo off
color a 
:loope
cls
echo 1 - �����Ʒɨ��
echo 2 - �ֶ������Ʒ
echo 3 - ��һ
echo 4 - ��һ
echo 5 - ����
echo 6 - ���
echo 7 - ������ҳ
echo 0 - �˳�
echo ===================
set /p a=please change:
if %a% ==1 goto scanner_page
if %a% ==2 goto add_goods
if %a% ==3 goto add_
if %a% ==4 goto sub_
if %a% ==5 goto seet_
if %a% ==6 goto clear_
if %a% ==7 goto back_
if %a% ==0 goto exit_

else 
goto loope
:scanner_page
::adb shell input tap  540 283
adb shell input tap  74 159
goto loope 

:add_goods
adb shell input tap  527 1755
goto loope

:add_
adb shell input tap  835 185
goto loope

:sub_
adb shell input tap  900 185
goto loope

:clear_
adb shell input tap  870 1755
goto loope

:back_
adb shell input tap  527 1805
goto loope

:seet_
adb shell input tap  998 1625
goto loope

:exit_
cls
exit

pause>nul

