package org.gradle.examples.web;

import java.io.IOException;
import java.io.PrintWriter;
import org.gradle.examples.utils.MyConcatenator;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      PrintWriter pw = response.getWriter();
      String concatestring = MyConcatenator.concatenate("hello", "world");
      pw.println(concatestring);
      pw.close();
   }
}