package com.github.estorsk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello world!");

        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> user = mapper.readValue("{\"name\": \"John\"}", Map.class);
        user = user;
    }
}
