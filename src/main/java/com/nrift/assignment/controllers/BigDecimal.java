package com.nrift.assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nrift.assignment.logic.BigDecimalLogic;

@RestController
@RequestMapping("/assignment")
public class BigDecimal {
  @Autowired
  BigDecimalLogic bigDecimalLogic;

  @GetMapping("/bigdecimal/{input}")
  public String function(@PathVariable String input) {
    String ans=bigDecimalLogic.function(input);
    return ans;
  }

  
}
