# java-docker-signal-handling-example
Simple example showing signal handling using Java in a Docker container.

## Building
```bash
  docker build -t signal-demo .
```

## Example usage
Sending SIGINT through the terminal:
```bash
  docker run signal-demo
  # Press Ctrl-C
  Shutting down due to SIGINT...
```

Stopping a Docker container:
```bash
  $ docker run -d --name signal-demo
  $ docker stop signal-demo
  $ docker logs signal-demo
  Shutting down due to SIGTERM...
```
