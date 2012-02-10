package com.github.robb1e

import org.scalatest.FunSuite
import org.mockito.Mockito._
import javax.servlet.http._

class FooServletTest extends FunSuite {

  test("hit doGet protected method"){
    val servlet = new FooServlet();
    val request = mock(classOf[HttpServletRequest])
    val response = mock(classOf[HttpServletResponse])
    servlet.doGet(request, response)
    
  }

}
