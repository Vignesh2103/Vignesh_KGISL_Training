import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;




public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config=getServletConfig();
		Enumeration<String> e=config.getInitParameterNames();
			
		String str="";
		while(e.hasMoreElements()){
			str=e.nextElement();
			out.print("<br>Name: "+str);
			out.print(" value: "+config.getInitParameter(str));
		}
		
		out.close();
	}

}
