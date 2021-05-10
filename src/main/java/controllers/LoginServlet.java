package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.User;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		User u = new User();
		
		u.setUsername(req.getParameter("userId"));
		u.setPassword(req.getParameter("password"));
		System.out.println("Username " + u.getUsername() + " and password " + u.getPassword() + " have been accepted.");
	}
}
