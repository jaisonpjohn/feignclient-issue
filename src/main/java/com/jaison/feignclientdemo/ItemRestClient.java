package com.jaison.feignclientdemo;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="http://localhost:8080",name="ItemService")
public interface ItemRestClient {
  @RequestMapping(value = "/items/{id}", method = RequestMethod.PUT)
  String updateItem(@PathVariable("id") final String id, @RequestBody String request);
}