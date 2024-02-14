package com.example.KafkaTopic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KafkaApiController {
    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/send-message")
    public void sendMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
    }
    @GetMapping("/recieve")
    public List<String> recieveMessage(){
        return kafkaConsumerService.getReceivedMessages();
    }
}

