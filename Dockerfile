# * The first base image allows Java extension pack to load the dependencies for intelisense correctly.
# This won't allow it to compile due to a bug in WPILib detecting OpenJDK for arm64 as a 32bit linux image
# and WPILib not publishing 32 bit images. https://github.com/wpilibsuite/allwpilib/issues/3070
# * The second one allows the image to compile correctly (mostly) but Java extension pack doesn't like it.
# ! To switch between them, comment out one and uncomment the other. (CMD + /)
# ! Then rebuild the docker container using the command pallette (CMD + Shift + P)
# ! and selecting "Remote Containers: Rebuild Container"
FROM openjdk:11
# FROM wpilib/roborio-cross-ubuntu:2021-18.04

WORKDIR /workspace

COPY . .

CMD ["/bin/sh", "-c", "while sleep 1000; do :; done"]
