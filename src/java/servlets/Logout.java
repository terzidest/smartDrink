    package servlets;

    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.ServletConfig;
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    import javax.servlet.http.HttpSession; 
    
    @WebServlet(name = "Logout", urlPatterns = {"/Logout"})
    public class Logout extends HttpServlet {
        
        @Override
        public void init(ServletConfig config) throws ServletException
        {
        super.init(config);
        }
        
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException
        {  
              
            PrintWriter out=response.getWriter();              

            HttpSession session=request.getSession();  
            session.invalidate();  

            out.println("<script type=\"text/javascript\">");
            out.println("alert('Logged out succesfully');");
            out.println("location='index.html';");
            out.println("</script>");  

            out.close();  
        }  
    }  