package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" <html lang=\"en\"> \n");
      out.write("<head>\n");
      out.write("     <meta charset=\"UTF-8\" />\n");
      out.write("    <title>BCORE Admin Dashboard Template | Login Page</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\n");
      out.write("\t<meta content=\"\" name=\"description\" />\n");
      out.write("\t<meta content=\"\" name=\"author\" />\n");
      out.write("   \n");
      out.write("     <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/login.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/magic/magic.css\" />\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"text-center\">\n");
      out.write("        <H4><font style=\"font-family: fantasy; font-size: 20px \">Connecting Social Media to E-Commerce: Cold-Start Product Recommendation Using Microblogging Information</font></H4>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"tab-content\">\n");
      out.write("        <div id=\"login\" class=\"tab-pane active\">\n");
      out.write("            <form action=\"index.html\" class=\"form-signin\">\n");
      out.write("                <p class=\"text-muted text-center btn-block btn btn-primary btn-rect\">\n");
      out.write("                    Enter your username and password\n");
      out.write("                </p>\n");
      out.write("                <input type=\"text\" placeholder=\"Username\" class=\"form-control\" />\n");
      out.write("                <input type=\"password\" placeholder=\"Password\" class=\"form-control\" />\n");
      out.write("                <button class=\"btn text-muted text-center btn-danger\" type=\"submit\">Sign in</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"forgot\" class=\"tab-pane\">\n");
      out.write("            <form action=\"index.html\" class=\"form-signin\">\n");
      out.write("                <p class=\"text-muted text-center btn-block btn btn-primary btn-rect\">Enter your valid e-mail</p>\n");
      out.write("                <input type=\"email\"  required=\"required\" placeholder=\"Your E-mail\"  class=\"form-control\" />\n");
      out.write("                <br />\n");
      out.write("                <button class=\"btn text-muted text-center btn-success\" type=\"submit\">Recover Password</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"signup\" class=\"tab-pane\">\n");
      out.write("            <form action=\"index.html\" class=\"form-signin\">\n");
      out.write("                <p class=\"text-muted text-center btn-block btn btn-primary btn-rect\">Please Fill Details To Register</p>\n");
      out.write("                 <input type=\"text\" placeholder=\"First Name\" class=\"form-control\" />\n");
      out.write("                 <input type=\"text\" placeholder=\"Last Name\" class=\"form-control\" />\n");
      out.write("                <input type=\"text\" placeholder=\"Username\" class=\"form-control\" />\n");
      out.write("                <input type=\"email\" placeholder=\"Your E-mail\" class=\"form-control\" />\n");
      out.write("                <input type=\"password\" placeholder=\"password\" class=\"form-control\" />\n");
      out.write("                <input type=\"password\" placeholder=\"Re type password\" class=\"form-control\" />\n");
      out.write("                <button class=\"btn text-muted text-center btn-success\" type=\"submit\">Register</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"text-center\">\n");
      out.write("        <ul class=\"list-inline\">\n");
      out.write("            <li><a class=\"text-muted\" href=\"#login\" data-toggle=\"tab\">Login</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#forgot\" data-toggle=\"tab\">Forgot Password</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#signup\" data-toggle=\"tab\">Signup</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("      <script src=\"assets/plugins/jquery-2.0.3.min.js\"></script>\n");
      out.write("      <script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("   <script src=\"assets/js/login.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("    <!-- END BODY -->\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
