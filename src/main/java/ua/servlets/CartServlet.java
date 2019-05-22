package ua.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.controllers.CartController;
import ua.factory.DishFactory;
import ua.models.Cart;
import ua.models.Dish;
import ua.models.dao.DishDao;


public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		DishDao dd =  (DishDao) new DishFactory().getDao();
		if(cart == null) 
		{
			cart = new Cart();
		}
		CartController cc = new CartController(cart);
		Dish dish = dd.getDishById(Integer.parseInt(request.getParameter("dishID")));
		cc.addDish(dish);
		session.setAttribute("cart", cc.getCart());
		response.sendRedirect(request.getContextPath() + "/DishServlet");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
