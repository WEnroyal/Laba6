package ua.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.factory.AbstractFactory;
import ua.factory.DishFactory;
import ua.models.Dish;
import ua.models.dao.Dao;
import ua.models.dao.DishDao;


public class DishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DishServlet() {

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/view1.jsp");
		DishDao dd =  (DishDao) new DishFactory().getDao();
		List<Dish> listDishes = dd.getAllDishes();
		request.setAttribute("dishes", listDishes);
		try {
			rd.forward(request, response);
		} catch (IllegalStateException ex) {
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
