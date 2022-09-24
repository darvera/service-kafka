package com.example.demo.infraestructure;


import com.example.demo.model.ClientWallet;
import com.example.demo.producer.KafkaStringProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final KafkaStringProducer kafkaStringProducer;

    @Autowired
    KafkaController(KafkaStringProducer kafkaStringProducer) {
        this.kafkaStringProducer = kafkaStringProducer;
    }

    @PostMapping(value = "/send")
    public void sendMessageToKafkaTopic(@RequestBody ClientWallet message) {
        this.kafkaStringProducer.sendMessage(message);
    }

    /*
    @Autowired
    KafkaTemplate<String, Book> kafkaTemplate;

    private static final String TOPIC = "testTopic";

    // Annotation
    @PostMapping("/publish")
    public String publishMessage(@RequestBody Book book)
    {
        // Sending the message
        kafkaTemplate.send(TOPIC, book);

        return "Published Successfully";
    }
     */
}
