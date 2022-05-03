@ECHO OFF
IF "%1"=="start" (
    ECHO simplefan
    start "simple-fan" java -jar simplefan-1.0.jar
) ELSE IF "%1"=="stop" (
    ECHO simplefan
    TASKKILL /FI "WINDOWTITLE eq simple-fan"
) ELSE (
    ECHO please, use "run.bat start" or "run.bat stop"
)
pause