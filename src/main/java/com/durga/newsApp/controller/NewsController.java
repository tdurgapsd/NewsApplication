package com.durga.newsApp.controller;

import com.durga.newsApp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService service;

    @GetMapping
    public String fetchNews(){
        return service.getNews();
    }
}
