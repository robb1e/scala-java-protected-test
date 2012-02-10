package com.github.robb1e;

import javax.servlet.http.*;

public class FooServlet extends HttpServlet {

  protected void doGet(HttpServletRequest req, HttpServletResponse res){
    System.out.println("In doGet");
  }

}
