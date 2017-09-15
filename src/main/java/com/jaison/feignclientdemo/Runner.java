package com.jaison.feignclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

  @Autowired ItemRestClient itemRestClient;
  @Override
  public void run(final String... args) throws Exception {

    System.out.println("Sending the update request");
    itemRestClient.updateItem(null,"updated description");
    System.out.println("Finished update request");
  }
}
