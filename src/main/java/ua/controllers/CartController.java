package ua.controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;


import ua.models.Cart;
import ua.models.Dish;

public class CartController {

	private Cart cart;
	
	public CartController(Cart cart) 
	{
		this.cart = cart;
	}
	
	public void addDish(Dish dish) 
	{
		Set<Dish> set = cart.getListDishes().keySet();
		Integer qnt = 1;
		if(set.contains(dish)) 
		{
			qnt = cart.getListDishes().get(dish)+1;
		}
		cart.getListDishes().put(dish, qnt);
		cart.setSize();
	}
	
	public Set<Map.Entry<Dish, Integer>> showCart()
	{
		return cart.getListDishes().entrySet();
	}
	public Cart getCart() 
	{
		return cart;
	}
}
