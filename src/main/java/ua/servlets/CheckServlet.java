package ua.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ua.controllers.CheckController;
import ua.models.Cart;
import ua.models.Check;
import ua.models.Dish;


public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/view2.jsp");
		if(session.getAttribute("cart")==null) 
		{
			PrintWriter out = response.getWriter();
			out.write("Sorry, your cart is Empty");
			return;
		}
		Check check = new Check();
		CheckController cc = new CheckController(check);
		Cart cart = (Cart) session.getAttribute("cart");
		cc.setMap(cart.getListDishes());
		Set<Dish> list1= cc.getMap().keySet();
		Collection<Integer>arr = cc.getMap().values();
		request.setAttribute("checkList", list1);
		try 
		{
			rd.forward(request, response);
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
