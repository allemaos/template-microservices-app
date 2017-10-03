package com.theleakmark.discoveryservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class AvailabilityController {

  @RequestMapping(value = "/available")
  public String available() {
    return "Client is available";
  }

  @RequestMapping(value = "/checked-out")
  public String checkedOut() {
    return "Client is Checked Out";
  }

}
