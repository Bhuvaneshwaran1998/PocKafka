package com.p3.user.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "TestDiver-location", groupId = "user-group")
    public void cabLocation(String location){
        System.out.println(location);
    }

    @KafkaListener(topics = "newTopic", groupId = "user-group")
    public void testNewTopic(String message){
        System.out.println(message);
    }
}
