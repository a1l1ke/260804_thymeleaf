package org.example.thymeleaf.controller;

import lombok.RequiredArgsConstructor;
import org.example.thymeleaf.config.AppProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MainController {
    private final AppProperties appProperties;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("msg", appProperties.message());
        return "index";
    }
}
