package com.example.Week3ThymeleafApp.controllers;

import com.example.Week3ThymeleafApp.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurant")
//localhost:8080/restaurant/home とかmenuにアクセスすることができる
public class DishController {

    @Autowired
    private DishService dishService;

    @Value("${restaurant.name}")
    private String restaurantName;

    //endpoint for home page
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("rName", restaurantName);
        return "home";
    }

    //endpoint for main page
    @GetMapping("/menu")
    public String menu(Model model) {
        model.addAttribute("dishes", dishService.getAllDishes());
        return "menu";
    }

    @GetMapping("/add")
    public String addDish() {
        return "add-dish";
    }

}
