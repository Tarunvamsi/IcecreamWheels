package com.food.app;


import com.food.app.data_class.ItemData;
import com.food.app.data_class.RestaurantData;
import com.food.app.db_package.DatabaseManager;

import java.util.ArrayList;
import java.util.Arrays;


public class ContentPreload {

    private static final ArrayList<RestaurantData> preloadedRestaurants = new ArrayList<>( Arrays.asList(
            new RestaurantData("00001", "Gelato Gourmet Elegance", "1.3 km  |  30 – 40 min", "r1"),
            new RestaurantData("00002", "The Creamery Couture", "7.9 km  |  55 – 65 min", "r2"),
            new RestaurantData("00003", "Scoop & Savour Palace", "9.5 km  |  60 – 75 min", "r3"),
            new RestaurantData("00004", "Frosty Delights Emporium", "0.7 km  |  25 – 30 min", "r4"),
            new RestaurantData("00005", "Velvet Churn Artisanal Parlor", "6.9 km  |  55 – 65 min", "r5"),
            new RestaurantData("00006", "Ice cream BBQ", "10.9 km  |  70 – 80 min", "r6")
    ));

    private static final ArrayList<ItemData> preloadedItems = new ArrayList<>( Arrays.asList(
            new ItemData("00011", "00001", "Vanilla Bean", "Classic", 4.5, "vanilla_bean"),
            new ItemData("00012", "00001", "Chocolate Fudge Brownie", "Rich", 3.5, "chocolate_fudge_brownie"),
            new ItemData("00013", "00001", "Strawberry Swirl", "Fruity", 2, "strawberry_swirl"),
            new ItemData("00014", "00001", "Mint Chocolate Chip", "Refreshing", 5.5, "mint_chocolate_chip"),
            new ItemData("00015", "00001", "Cookies 'n Cream", "Crunchy", 4.5, "cookies_n_cream"),
            new ItemData("00016", "00001", "Rocky Road", "Nutty", 3, "rocky_road"),
            new ItemData("00017", "00001", "Butter Pecan", "Buttery", 6.5, "butter_pecan"),
            new ItemData("00018", "00001", "Pistachio Almond", "Nutty", 5.5, "pistachio_almond"),
            new ItemData("00019", "00001", "Cherry Garcia", "Cherry-Chocolate", 4, "cherry_garcia"),
            new ItemData("00021", "00002", "Coffee Toffee Crunch", "Caffeinated", 30.6, "coffee_toffee_crunch"),
            new ItemData("00022", "00002", "Raspberry Ripple", "Tangy", 27.6, "raspberry_ripple"),
            new ItemData("00023", "00002", "Mango Tango", "Tropical", 25.6, "mango_tango"),
            new ItemData("00024", "00002", "Dulce de Leche", "Caramel", 22.9, "dulce_de_leche"),
            new ItemData("00025", "00002", "Blueberry Blast", "Berry", 19.9, "blueberry_blast"),
            new ItemData("00026", "00002", "Caramel Macchiato", "Coffee-Caramel", 13.9, "caramel_macchiato"),
            new ItemData("00027", "00002", "Lemon Sorbet", "Zesty", 10.9, "lemon_sorbet"),
            new ItemData("00028", "00002", "Orange Creamsicle", "Citrusy", 15.9, "orange_creamsicle"),
            new ItemData("00029", "00002", "Maple Walnut", "Nutty", 14.5, "maple_walnut"),
            new ItemData("00030", "00002", "Hazelnut Heaven", "Nutty", 18.5, "hazelnut_heaven"),
            new ItemData("00031", "00002", "Red Velvet Bliss", "Velvetty", 22.9, "red_velvet_bliss"),
            new ItemData("00032", "00002", "Black Forest Delight", "Chocolate-Cherry", 26.5, "black_forest_delight"),
            new ItemData("00033", "00002", "Cinnamon Roll", "Spiced", 21.9, "cinnamon_roll"),
            new ItemData("00034", "00002", "Salted Caramel Pretzel", "Sweet-Salty", 24.5, "salted_caramel_pretzel"),
            new ItemData("00035", "00002", "Coconut Pineapple Paradise", "Tropical", 19.9, "coconut_pineapple_paradise"),
            new ItemData("00036", "00002", "Key Lime Pie", "Zesty", 17.5, "key_lime_pie"),
            new ItemData("00037", "00002", "Pomegranate Passion", "Exotic", 23.5, "pomegranate_passion"),
            new ItemData("00038", "00002", "Peanut Butter Cup", "Nutty-Chocolate", 20.9, "peanut_butter_cup"),
            new ItemData("00039", "00002", "Cotton Candy Carnival", "Sweet", 16.5, "cotton_candy_carnival"),
            new ItemData("00040", "00002", "Almond Joyful", "Nutty-Chocolate", 18.9, "almond_joyful"),
            new ItemData("00041", "00002", "S'mores Sensation", "Campfire", 13.9, "s'mores_sensation"),
            new ItemData("00042", "00002", "Honey Lavender", "Floral", 15.9, "honey_lavender"),
            new ItemData("00043", "00002", "Bubblegum Burst", "Sweet", 12.5, "bubblegum_burst"),
            new ItemData("00044", "00002", "Tiramisu Temptation", "Italian", 26.9, "tiramisu_temptation"),
            new ItemData("00045", "00002", "Chai Tea Delight", "Spiced", 19.5, "chai_tea_delight"),
            new ItemData("00046", "00002", "Banana Nut Crunch", "Nutty", 17.9, "banana_nut_crunch"),
            new ItemData("00047", "00002", "Blue Moon Mystery", "Mysterious", 14.5, "blue_moon_mystery"),
            new ItemData("00048", "00002", "Watermelon Whirl", "Refreshing", 11.9, "watermelon_whirl"),
            new ItemData("00049", "00002", "Irish Cream Dream", "Creamy", 15.9, "irish_cream_dream"),
            new ItemData("00050", "00002", "Fig and Honey Gelato", "Fruity", 20.5, "fig_and_honey_gelato"),
            new ItemData("00051", "00002", "Raspberry Cheesecake", "Creamy-Berry", 24.9, "raspberry_cheesecake"),
            new ItemData("00052", "00002", "Green Tea Matcha", "Earthy", 18.5, "green_tea_matcha"),
            new ItemData("00053", "00002", "White Chocolate Raspberry Truffle", "Luxurious", 27.5, "white_chocolate_raspberry_truffle"),
            new ItemData("00054", "00002", "Orange Sherbet", "Citrusy", 12.9, "orange_sherbet"),
            new ItemData("00055", "00002", "Mocha Madness", "Coffee-Chocolate", 21.5, "mocha_madness"),
            new ItemData("00056", "00002", "Bourbon Praline Pecan", "Boozy", 28.5, "bourbon_praline_pecan"),
            new ItemData("00057", "00002", "Lavender Lemonade", "Floral-Citrus", 16.9, "lavender_lemonade"),



            new ItemData("00058", "00005", "Shrimp Pasta", "Shrimp Aglio e Olio", 23, "r1"),
            new ItemData("00059", "00005", "Vegetarian Delight", "Vegetarian pizza with a variety of veggies", 21.5, "r2"),
            new ItemData("00060", "00005", "Pesto Paradise", "Pesto sauce pasta with sun-dried tomatoes", 18.5, "r3"),
            new ItemData("00061", "00006", "Bimbibap", "Rice with meat, egg and vegetables", 16, "r4"),
            new ItemData("00062", "00006", "Jajangmyeon", "Black bean Chinese noodles", 15.9, "r5"),
            new ItemData("00063", "00006", "Grilled Beef", "Grilled Wagyu beef", 30, "r6"),
            new ItemData("00064", "00006", "Bulgolgi Pork", "Spicy Bulgolgi pork slice", 35, "banana_nut_crunch"),
            new ItemData("00065", "00006", "Marinated Beef", "Beef marinated in a special sauce", 44, "watermelon_whirl"),
            new ItemData("00066", "00006", "Tofu Stir-Fry", "Tofu and vegetable stir-fry with special sauce", 19.5, "green_tea_matcha")

    ));



    public static void getPreloadContent(DatabaseManager databaseManager) {

        for ( RestaurantData restaurantData : preloadedRestaurants ) {
            databaseManager.add_Restaurant(restaurantData);
        }

        for ( ItemData itemData : preloadedItems ) {
            databaseManager.add_Item(itemData);
        }
    }

}