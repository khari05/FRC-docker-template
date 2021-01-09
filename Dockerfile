FROM wpilib/roborio-cross-ubuntu:2021-18.04

WORKDIR /workspace

COPY . .

CMD ["/bin/sh", "-c", "while sleep 1000; do :; done"]