package ua.controllers;

import java.util.Map;

import ua.models.Check;
import ua.models.Dish;

public class CheckController {

	private Check check;
	
	public CheckController(Check check) 
	{
		this.check = check;
	}
	
	public void setMap(Map<Dish, Integer> map) {
		check.setMap(map);
	}
	public Map<Dish, Integer> getMap() {
		return check.getMap();
	}
}
