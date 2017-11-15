package com.detoeuf.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger("com.detoeuf.test.Application");

    public static void main(String[] args) {
        logger.info(new Chou().bonjour("Jean"));
    }
}
