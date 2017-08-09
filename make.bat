rem: @echo off
REM : This is a homebrew Java Makefile! Should be adjustable to fit
REM : any program with a DRIVER with main() and COMPONENTS with
REM : the rest of the objects/logic.
REM : To reuse:
REM : 1) Choose a new directory head for the package and move this file there.
REM : 2) Create variables for any non-driving source files under Components.
REM : 3) Substitute new test and prod drivers into the TEST and PLAY variables.
REM : 4) See what happens!



IF [%1]==[] echo Missing parameter! Enter either 'test' or 'play' after make.
REM : IF [%2]==[] echo Enter either 'build' or 'run' to compile or run the program.

REM : Components
set GGRID=GameGrid.java Test_GameGrid.java
set PLAYERS=Player.java TestPlayer.java
set COMPONENTS=%GGRID% %PLAYERS%

REM : Drivers (main function)
set TEST=TestMain.java
set PLAY=tictactoe.java

REM : Fully qualified class name for driver (based on package)
set TESTCLASS=tictactoe.game.TestMain
set PLAYCLASS=tictactoe.game.tictactoe

REM : Source file options
if %1==test set DRIVER=%TEST% && set DRIVERCLASS=%TESTCLASS%
if %1==play set DRIVER=%PLAY% && set DRIVERCLASS=%PLAYCLASS%

REM : Run options
if %2==build call javac -g -d . %COMPONENTS% %DRIVER%
if %2==run call java -esa %DRIVERCLASS%
if %2==both call make %1 build && call make %1 run
if [%2]==[] echo You forgot to specify build or run


REM : javac -g -d . TestMain.java Test_GameSquare.java GameSquare.java
REM : java tictactoe.game.TestMain
