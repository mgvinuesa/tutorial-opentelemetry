# Multiple Exporter Example

This example demonstrates how to use the OpenTelemetry AutoInstrumentation to instrument a
simple application using Prometheus as the metric exporter and  Jaeger as the traces exporter 



# How to run

## Prerequisites

* Java 17
* Docker 
* Docker compose

## 1 - Compile

The docker build compile the artifact. If not, use mvn clean install.

## 2 - Run

Start the application, jaeger and prometheus via docker compose

```shell
docker-compose up
```

## 3 - View metrics

To view metrics in prometheus, navigate to:

http://localhost:9090/graph?g0.range_input=15m&g0.expr=incoming_messages&g0.tab=0

To view application metrics in prometheus format, navigate to:

http://localhost:19090/metrics

To view Jaeger traces

