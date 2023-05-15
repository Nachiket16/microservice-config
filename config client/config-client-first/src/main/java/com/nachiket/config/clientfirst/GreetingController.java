package com.nachiket.config.clientfirst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class GreetingController {
  @Value("${docs.uri}")
  private String url;
  @GetMapping("/")
  public String hello() {
    System.out.println("url = " + url);
    return url;
  }

}
