package ua.models;

import java.util.List;

public class Menu {

	private int id;
	private int dayOfWeak;
	private List<Integer> listDishes;
	
	public Menu(int id, int dayOfWeak) {
		this.id = id;
		this.dayOfWeak = dayOfWeak;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDayOfWeak() {
		return dayOfWeak;
	}
	public void setDayOfWeak(int dayOfWeak) {
		this.dayOfWeak = dayOfWeak;
	}
	public List<Integer> getListDishes() {
		return listDishes;
	}
	public void setListDishes(List<Integer> listDishes) {
		this.listDishes = listDishes;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", dayOfWeak=" + dayOfWeak + ", listDishes=" + listDishes + "]";
	}
	
	
	
}
