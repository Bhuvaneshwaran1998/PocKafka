package com.p3.driver.controller;

import com.p3.driver.service.DirverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/DirverLocation")
public class DirverController {

  private final DirverService dirverService;

  public DirverController(DirverService dirverService) {
    this.dirverService = dirverService;
  }

  @PutMapping
  public ResponseEntity updateStatus() throws InterruptedException {
    for (int i = 50; i > 0; i--) {
      //            System.out.println(Math.random() + " , " + Math.random());
      dirverService.updateStatus(Math.random() + " , " + Math.random());
      Thread.sleep(10);
    }
    return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
  }

  @PutMapping(value = "/oneMore")
  public String randomMessage(){
    for (int i=20; i>0; i--){
      dirverService.randomMessage(String.valueOf(Math.random()));
    }
    return "working Fine";
  }





}
