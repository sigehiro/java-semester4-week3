package com.example.Week3ThymeleafApp.services;

import com.example.Week3ThymeleafApp.models.Dish;
import com.example.Week3ThymeleafApp.repositories.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    //get all dishes from the repository

    public List<Dish> getAllDishes() {
        //business logic should have been here
        return DishRepository.getAllDishes();
    }
}
