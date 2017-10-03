package com.theleakmark.book.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  @RequestMapping(value = "/available")
  public String available() {
    return "Book is available";
  }

  @RequestMapping(value = "/checked-out")
  public String checkedOut() {
    return "Book is in Action";
  }

  @RequestMapping(value = "/recommended")
  public String readingList(){
    return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
  }

}
