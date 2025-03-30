package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/info")
public class InfoController {

    @GetMapping
    public Map<String, Object> getExternalInfo() {
        RestTemplate restTemplate = new RestTemplate();

        // API que retorna imagens aleatórias de cachorros
        String url = "https://dog.ceo/api/breeds/image/random";

        return restTemplate.getForObject(url, Map.class);
    }
}
