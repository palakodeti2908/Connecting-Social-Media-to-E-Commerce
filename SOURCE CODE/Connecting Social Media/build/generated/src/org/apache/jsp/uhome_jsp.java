package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import network.FileUploadDBSer;
import java.sql.*;
import Dbcon.DbConnection;

public final class uhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String name = null, smail = null, id = null, pname = null;

    try {

        Connection con;
        con = DbConnection.getConnection();
        Statement st = con.createStatement();

        smail = (String) session.getAttribute("email");

        String s = "select id,uname,email from reg where mail='kaviarasanjpinfotech@gmail.com'";

        ResultSet rs = st.executeQuery(s);

        if (rs.next()) {
            id = rs.getString(1);
            name = rs.getString(2);

            smail = rs.getString(3);

            session.setAttribute("id", id);

        } else {
            out.print("Please check your login credentials");
        }



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <title>Connecting Social Media to E-Commerce</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\n");
      out.write("    <meta content=\"\" name=\"description\" />\n");
      out.write("    <meta content=\"\" name=\"author\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/theme.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/MoneAdmin.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/Font-Awesome/css/font-awesome.css\" />\n");
      out.write("    <link href=\"assets/css/layout2.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/plugins/flot/examples/examples.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/timeline/timeline.css\" />\n");
      out.write("</head>\n");
      out.write("<body class=\"padTop53 \" >\n");
      out.write("    <div id=\"wrap\" >\n");
      out.write("        <div id=\"top\">\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top \" style=\"padding-top: 10px;\">\n");
      out.write("                <a data-original-title=\"Show/Hide Menu\" data-placement=\"bottom\" data-tooltip=\"tooltip\" class=\"accordion-toggle btn btn-primary btn-sm visible-xs\" data-toggle=\"collapse\" href=\"#menu\" id=\"menu-toggle\">\n");
      out.write("                    <i class=\"icon-align-justify\"></i>\n");
      out.write("                </a>\n");
      out.write("                <header class=\"navbar-header\">\n");
      out.write("                    <H4><font style=\"font-family: fantasy; font-size: 20px \">Connecting Social Media to E-Commerce: Cold-Start Product Recommendation Using Microblogging Information</font></H4>\n");
      out.write("                </header>\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <span class=\"label label-success\">2</span>    <i class=\"icon-envelope-alt\"></i>&nbsp; <i class=\"icon-chevron-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-messages\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>John Smith</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Today</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing.\n");
      out.write("                                        <br />\n");
      out.write("                                        <span class=\"label label-primary\">Important</span> \n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>Raphel Jonson</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Yesterday</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing.\n");
      out.write("                                        <br />\n");
      out.write("                                        <span class=\"label label-success\"> Moderate </span> \n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>Chi Ley Suk</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>26 Jan 2014</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing.\n");
      out.write("                                        <br />\n");
      out.write("                                        <span class=\"label label-danger\"> Low </span> \n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>Read All Messages</strong>\n");
      out.write("                                    <i class=\"icon-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"icon-user \"></i>&nbsp; <i class=\"icon-chevron-down \"></i>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"icon-user\"></i> User Profile </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"icon-gear\"></i> Settings </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"index.jsp\"><i class=\"icon-signout\"></i> Logout </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"left\" >\n");
      out.write("            <div class=\"media user-media well-small\">\n");
      out.write("                <a class=\"user-link\" href=\"#\">\n");
      out.write("                    <img class=\"media-object img-thumbnail user-img\" alt=\"User Picture\" src=\"assets/img/user.gif\" />\n");
      out.write("                </a>\n");
      out.write("                <br />\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                    <h5 class=\"media-heading\"> Joe Romlin</h5>\n");
      out.write("                    <ul class=\"list-unstyled user-info\">\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"btn btn-success btn-xs btn-circle\" style=\"width: 10px;height: 12px;\"></a> Online\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <br />\n");
      out.write("            </div>\n");
      out.write("             ");


                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    
      out.write("\n");
      out.write("            <!--START MENU SECTION -->\n");
      out.write("            <ul id=\"menu\" class=\"collapse\">\n");
      out.write("                <li><a href=\"#\" > View Profile</a></li>\n");
      out.write("                <li><a href=\"#\"> Find Friends </a></li>\n");
      out.write("                <li><a href=\"#\"> Edit Profile </a></li>\n");
      out.write("                <li><a href=\"#\"> Share Photo on Timeline </a></li>\n");
      out.write("                <li><a href=\"#\"> View Request </a></li>\n");
      out.write("                <li><a href=\"#\"> View Message </a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content\">\n");
      out.write("\n");
      out.write("            <div class=\"inner\" style=\"min-height: 700px;\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <br><h4> Admin Dashboard </h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr />\n");
      out.write("                <!--BLOCK SECTION -->\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"right\">\n");
      out.write("            <br><div class=\"well well-small\">\n");
      out.write("               <img width=\"180\" height=\"150\" src=\"img\\osn3.png\"/>\n");
      out.write("            </div><br>\n");
      out.write("            <div class=\"well well-small\">\n");
      out.write("               <img width=\"180\" height=\"150\" src=\"img\\osn2.jpg\"/>\n");
      out.write("            </div><br>\n");
      out.write("            <div class=\"well well-small\">\n");
      out.write("                <img width=\"180\" height=\"150\" src=\"img\\osn1.jpg\"/>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("        <p>&copy;  binarytheme &nbsp;2014 &nbsp;</p>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"assets/plugins/jquery-2.0.3.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/flot/jquery.flot.time.js\"></script>\n");
      out.write("    <script  src=\"assets/plugins/flot/jquery.flot.stack.js\"></script>\n");
      out.write("    <script src=\"assets/js/for_index.js\"></script>\n");
      out.write("\n");
      out.write("</body>");
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
