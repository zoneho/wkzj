#!/bin/sh
ARGS='-Dcom.sun.management.jmxremote.port=1099 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false'
java -server -jar -Xmx8g -Xms8g -Xmn3g -XX:ParallelGCThreads=8 -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:+PrintGCDetails $ARGS lib/ztt-world-server.jar