package com.fc.springbootpractice.controller;

import com.fc.springbootpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * fileName : MainController
 * author :  KimSangHoon
 * date : 2022/04/22
 */
@RestController
public class MainController {
    private final SortService sortService;

    public MainController(SortService sortService) {
        this.sortService = sortService;
    }


    @GetMapping("/")
    public String hello(@RequestParam List<String> list) {
        return sortService.doSort(list).toString();
    }
}
