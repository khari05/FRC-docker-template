## FRC Docker Template
An FRC base project allowing the user to develop inside of a docker container. Taking the need out of local dependencies.

## Compiling on ARM machines
There is currently a [bug in WPILib](https://github.com/wpilibsuite/allwpilib/issues/3070) where it detects the arm64 OpenJDK Docker image as 32bit linux and ends up failing to find a specific file on the WPI Maven repository. The simplest solution to this issue is to make a temporary change that's listed in [Dockerfile](./Dockerfile) to let it compile. This will *mostly* fix compiling. The sacrifice is that it will make the Intelisense from the Java Extension Pack no longer work.

## Prerequisites to install
- [Docker Desktop](https://www.docker.com/products/docker-desktop)
- [Visual Studio Code](https://code.visualstudio.com/) (Or an IDE or TextEditor of your choice)

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

## Running VS Code in the container
1 Clone this repository
  * You may do this using the Github Desktop App or CLI.
    * `git clone https://github.com/khari05/FRC-docker-template.git your-project-name`
2. Open VS Code in this folder.
3. Click "Repoen in Container" in the notification that the extension `Remote - Containers` shows.

![notification inside of VS Code that has a button saying "Reopen in Container"](./open.png)
