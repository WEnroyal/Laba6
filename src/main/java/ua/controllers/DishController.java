package ua.controllers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ua.models.Dish;
import ua.models.dao.DishDao;

public class DishController implements DishDao {

	private Connection conn;
	private java.sql.PreparedStatement ps;
	private static String GET_DISH_BY_ID = "SELECT * FROM dishes WHERE id=?";
	private static String GET_ALL_DISHES = "SELECT * FROM dishes";
	public DishController(Connection conn) 
	{
		this.conn = conn;
	}

	@Override
	public Dish getDishById(int id) {
		Dish dish = null;
		if(ps == null)
			try {
				ps = conn.prepareStatement(GET_DISH_BY_ID);
				ps.setString(1, Integer.toString(id));
				ResultSet rs = ps.executeQuery();
				dish = new Dish(rs.getString("name"),rs.getInt("price"),rs.getDouble("weight"));
				dish.setId(rs.getInt("id"));
				rs.close();
				ps = null;
				return dish;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return null;
	}

	@Override
	public List<Dish> getAllDishes() {
		List<Dish> listDishes= new ArrayList<>();
		Dish dish = null;
		Statement st = null;
			try {
				st = conn.createStatement();
				ResultSet rs = st.executeQuery(GET_ALL_DISHES);
				while(rs.next()) 
				{
					dish = new Dish(rs.getString("name"),rs.getInt("price"),rs.getDouble("weight"));
					dish.setId(rs.getInt("id"));
					listDishes.add(dish);
				}
				rs.close();
				return listDishes;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return null;
		
	}
	
}
