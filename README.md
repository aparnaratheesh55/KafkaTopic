# Kafka

Kafka act as a message broker with the help of various kafka topics

# How to start Zookeeper 
```
* cd kafka_2.11-2.3.1/
* bin/zookeeper-server-start.sh config/zookeeper.properties
```
# How to start kafka
```
* Move to next terminal and go the folder of kafka
* bin/kafka-server-start.sh config/server.properties
```

# How to create a topic
```
* Move to next terminal and go the folder of kafka
* bin/kafka-topics.sh --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1 
* here my-topic is the name of your topic
```


# How to create a producer to send message
```
* Move to next terminal and go the folder of kafka
* bin/kafka-console-producer.sh --topic my-topic --broker-list localhost:9092
```

# How to create a reciever to recieve message
```
* Move to next terminal and go the folder of kafka
* bin/kafka-console-consumer.sh --topic my-topic --bootstrap-server localhost:9092 --from-beginning
```


