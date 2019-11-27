/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-27 06:03:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
  //获取静态资源的绝对路径
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" 
							+ request.getServerPort() + path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" class=\"bg-dark\">\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<title>登录</title>\r\n");
      out.write("\t\t<meta name=\"description\" content=\"app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print( basePath );
      out.write("css/app.v2.css\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<section id=\"content\" class=\"m-t-lg wrapper-md animated fadeInUp\">\r\n");
      out.write("\t\t\t<div class=\"container aside-xxl\"> \r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand block\" href=\"#\">公文流转系统</a>\r\n");
      out.write("\t\t\t\t\t<section class=\"panel panel-default bg-white m-t-lg\">\r\n");
      out.write("\t\t\t\t\t\t<header class=\"panel-heading text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>登录</strong>\r\n");
      out.write("\t\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 增删改结果提示 -->\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<form action=\"");
      out.print( basePath );
      out.write("login\" method=\"post\" \r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"panel-body wrapper-lg\" data-validate=\"parsley\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\">用户名/工号</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"loginName\" type=\"text\" placeholder=\"请输入用户名\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control input-lg\" data-required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-rangelength=\"[4,30]\" data-notblank=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\">密码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"password\" type=\"password\" id=\"inputPassword\" data-required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-rangelength=\"[6,15]\" data-notblank=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入密码\" class=\"form-control input-lg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\">验证码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"code\" type=\"text\" id=\"code\" data-required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-maxlength=\"4\" data-notblank=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入验证码\" class=\"form-control input-lg\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img id=\"captchaImage\" src=\"");
      out.print( basePath );
      out.write("captcha\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">登录</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print( basePath );
      out.write("js/app.v2.js\"></script>\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"");
      out.print( basePath );
      out.write("js/parsley/parsley.min.js\"></script>\r\n");
      out.write("\t    <script type=\"text/javascript\">\r\n");
      out.write("\t\t \t// 更换验证码\r\n");
      out.write("\t        $('#captchaImage').click(function(){\r\n");
      out.write("\t            $('#captchaImage').attr(\"src\", \"");
      out.print( basePath );
      out.write("captcha?timestamp=\" + (new Date()).valueOf());\r\n");
      out.write("\t        }); \r\n");
      out.write("\t    </script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
