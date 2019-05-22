package ua.models;

import java.util.HashMap;
import java.util.Map;

public class Check {

	private Map<Dish,Integer> map;
	public Check() 
	{
		map = new HashMap<>();
	}
	
	public void setMap(Map<Dish, Integer> map) {
		this.map = map;
	}

	public Map<Dish, Integer> getMap() {
		return map;
	}
	
	
	
}
