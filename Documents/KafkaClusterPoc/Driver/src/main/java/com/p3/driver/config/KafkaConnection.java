package com.p3.driver.config;

import com.p3.driver.appConstant.ConstantStrings;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConnection {

  public NewTopic topic() {
    return TopicBuilder.name(ConstantStrings.TestDiverlocation).build();
  }

  public NewTopic topic1(){
    return TopicBuilder.name(ConstantStrings.NewTopic).build();
  }
}
