package com.theleakmark.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class BookApplication {

  public static void main(String[] args) {
    SpringApplication.run(BookApplication.class, args);
  }
}
