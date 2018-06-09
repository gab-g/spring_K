package org.comstudy21.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public ModelAndView requestMap(HttpServletRequest req, HttpServletResponse resp);
}