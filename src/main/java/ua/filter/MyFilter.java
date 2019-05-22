package ua.filter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.models.Dish;


public class MyFilter implements Filter {

    private String param1;
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsreq = (HttpServletRequest) request;
		HttpServletResponse hsres = (HttpServletResponse) response;
		RequestDispatcher rd = null;
		PrintWriter out = new PrintWriter(new File("mylog.txt"));
		out.write("Filter is working" + request.getRemoteAddr() + new Date().toString());
		System.out.println("Filter is working" + request.getRemoteAddr() + new Date().toString());
		out.close();
		List<Dish> listDishes = (List<Dish>) hsreq.getAttribute("dishes");
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		param1 = fConfig.getInitParameter("param1");
	}

}
