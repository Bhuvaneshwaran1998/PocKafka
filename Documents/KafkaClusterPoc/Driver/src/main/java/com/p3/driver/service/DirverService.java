package com.p3.driver.service;

import com.p3.driver.appConstant.ConstantStrings;
import com.p3.driver.controller.DirverController;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DirverService {

  private final KafkaTemplate<String, Object> kafkaTemplate;

  public DirverService(KafkaTemplate<String, Object> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public boolean updateStatus(String location) {
    kafkaTemplate.send(ConstantStrings.TestDiverlocation, location);
    return true;
  }

  public boolean randomMessage(String message){
    kafkaTemplate.send(ConstantStrings.NewTopic,message);
    return true;
  }
}
