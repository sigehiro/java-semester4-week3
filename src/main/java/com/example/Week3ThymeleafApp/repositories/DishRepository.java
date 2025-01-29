package com.example.Week3ThymeleafApp.repositories;

import com.example.Week3ThymeleafApp.models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DishRepository {
    private static List<Dish> dishes = new ArrayList<>();

    public static List<Dish> getAllDishes() {
        //以下のように書くこともできるが、以下のように書くと、Dishクラスのインスタンスを作成するたびに、newを使ってインスタンスを作成する必要がある
        //そのため、以下のように書くと、コードが冗長になる
//        Dish d1 = Dish.builder().id(1).name("Pizza").category("Main Course").price(10.0).build();
//        Dish d2 = Dish.builder().id(2).name("Pasta").category("Main Course").price(8.0).build();
//        Dish d3 = Dish.builder().id(3).name("Salad").category("Appetizer").price(5.0).build();//        Dish d4 = Dish.builder().id(4).name("Ice Cream").category("Dessert").price(3.0).build();


        //同じものだけど、書き方をが２種類あるので、その例を示している
        //その１
//        dishes.add(new Dish(1, "Pizza", "Main Course", 10.0));
        //その２
        dishes.add(
                Dish.builder().id(1).name("Pizza").category("Main Course").price(10.0).build()
        );
        dishes.add(
                Dish.builder().id(2).name("Pasta").category("Main Course").price(8.0).build()
        );
        dishes.add(
                Dish.builder().id(3).name("Salad").category("Appetizer").price(5.0).build()
        );

        return dishes;
    }

}
