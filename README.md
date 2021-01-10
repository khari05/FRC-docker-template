## FRC Docker Template
This is an FRC base project that allows the user to develop inside of a docker container. This means that having any dependencies installed locally is no longer required.

## Compiling on ARM machines
There is currently a [bug in WPILib](https://github.com/wpilibsuite/allwpilib/issues/3070) where it detects the arm64 OpenJDK Docker image as 32bit linux and ends up failing to find a specific file on the WPI Maven repository. The simplest solution to this issue is to make a temporary change that's listed in [Dockerfile](./Dockerfile) to let it compile. This will *mostly* fix compiling. The sacrifice is that it will make the Intelisense from the Java Extension Pack no longer work.

## Prerequisites to install
- Docker Desktop
- Visual Studio Code

#### Extensions to have installed in VS Code
- amirha.better-comments-2
- coenraads.bracket-pair-colorizer
- oderwat.indent-rainbow
- donjayamanne.githistory
- codezombiech.gitignore
- eamodio.gitlens
- ziyasal.vscode-open-in-github
- vscjava.vscode-java-pack
- wpilibsuite.vscode-wpilib
- ms-vscode-remote.remote-containers

## Running in the container
1. Clone this repo
2. Open VS Code in this folder
3. Click "Repoen in Container" in the notification that the extension `Remote - Containers` shows

![notification inside of VS Code that has a button saying "Reopen in Container"](./open.png)
