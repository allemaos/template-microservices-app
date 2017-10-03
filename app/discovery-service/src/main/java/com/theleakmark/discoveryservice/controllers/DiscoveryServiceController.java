package com.theleakmark.discoveryservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class DiscoveryServiceController {

  @RequestMapping(value = "/available")
  public String available() {
    return "Discovery Service is available";
  }

}
