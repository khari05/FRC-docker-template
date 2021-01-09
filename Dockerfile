FROM openjdk:11

WORKDIR /workspace

COPY . .

CMD ["/bin/sh", "-c", "while sleep 1000; do :; done"]