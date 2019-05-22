package ua.models.dao;

import java.util.List;

import ua.models.Dish;

public interface DishDao extends Dao {
	
	Dish getDishById(int id);
	List<Dish> getAllDishes();
}
