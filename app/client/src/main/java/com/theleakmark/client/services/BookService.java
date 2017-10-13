package com.theleakmark.client.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by gandreou on 02/10/2017.
 */
@Service
public class BookService {

    private final RestTemplate restTemplate = new RestTemplate();

    @HystrixCommand(fallbackMethod = "reliable")
    public String readingList() {
        URI uri = URI.create("http://localhost:7073/recommended");

        return this.restTemplate.getForObject(uri, String.class);
    }

    public String reliable() {
        return "reliable fallbackMethod for readingList";
    }

    @HystrixCommand(fallbackMethod = "reliableFromGateway")
    public String readingListFromGateway() {
        URI uri = URI.create("http://localhost:7170/books/recommended");

        return this.restTemplate.getForObject(uri, String.class);
    }

    public String reliableFromGateway() {
        return "reliable fallbackMethod for readingList";
    }

}
