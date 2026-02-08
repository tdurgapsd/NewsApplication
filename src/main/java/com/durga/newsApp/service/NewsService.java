package com.durga.newsApp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Value("${news.api.key}")
    private String apiKey;

    @Value("${news.api.url}")
    private String apiUrl;

    public String getNews() {
        RestTemplate rt = new RestTemplate();
        return rt.getForObject(apiUrl + "&apikey=" + apiKey, String.class);
    }
}
