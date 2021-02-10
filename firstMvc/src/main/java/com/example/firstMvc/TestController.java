package com.example.firstMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("title", "Title from backend");

        List<String> items = new ArrayList<>(Arrays.asList("Sandra", "Igors", "Lilija"));

        model.addAttribute("items", items);
        return "test";
    }
}
