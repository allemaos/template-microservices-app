package com.theleakmark.client.controllers;

import com.theleakmark.client.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class ClientController {

  @Autowired
  BookService bookService;

  @RequestMapping(value = "/available")
  public String available() {
    return "Client is available";
  }

  @RequestMapping(value = "/checked-out")
  public String checkedOut() {
    return "Client is Checked Out";
  }

  @RequestMapping("/to-read")
  public String readingList() {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = URI.create("http://localhost:8080/recommended");

    return restTemplate.getForObject(uri, String.class);
  }

  @RequestMapping("/to-read-via-getway")
  public String readingListFromGetway() {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = URI.create("http://localhost:7070/books/recommended");

    return restTemplate.getForObject(uri, String.class);
  }

  @RequestMapping("/circuit-breaker/to-read")
  public String readingListUsingCircuitBreaker() {
    return bookService.readingList();
  }

  @RequestMapping("/circuit-breaker/to-read-via-getway")
  public String readingListFromGetwayUsingCircuitBreaker() {
    return bookService.readingListFromGateway();
  }

}
