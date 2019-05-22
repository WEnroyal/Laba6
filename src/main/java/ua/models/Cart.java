package ua.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

	private Map<Dish,Integer> listDishes;
	private int size;
	public Cart () 
	{
		listDishes = new HashMap<>();
		size = 0;
	}
	public Map<Dish,Integer> getListDishes() {
		return listDishes;
	}
	public void setSize() 
	{
		this.size++;
	}
	public int getSize() 
	{
		return size;
	}
	
	
}
