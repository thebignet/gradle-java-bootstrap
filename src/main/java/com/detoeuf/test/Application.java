package com.detoeuf.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

  public static void main(String[] args) {
    log.info(new Chou().bonjour("Jean"));
  }
}
