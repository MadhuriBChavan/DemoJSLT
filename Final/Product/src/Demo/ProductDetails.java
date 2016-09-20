package Demo;
import Demo.Product;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Product> products=new ArrayList<Product> ();
		Product p=new Product();
		Product p1=new Product();
		
		p.setPID(111); p.setPName("Lakme Kajal"); p.setPPice(555);
		p1.setPID(112); p1.setPName("Lakme Foundation"); p1.setPPice(555);
		
		products.add(p);
		products.add(p1);
		
		request.setAttribute("Product List", products);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/ProductDisplay.jsp");
		rd.forward(request, response);
	}
	

}
