package org.comstudy21.myapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myapp.controller.BoardController;
import org.comstudy21.myapp.controller.Controller;
import org.comstudy21.myapp.controller.HandlerMapping;
import org.comstudy21.myapp.controller.ModelAndView;

public class DispatcherServlet extends HttpServlet{
	private HandlerMapping handlerMapping = new HandlerMapping();
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>> doProcess() 호출");
		
		String reqUri = req.getRequestURI();
		String ctxPath = req.getContextPath();
		System.out.println("reqUri : "+reqUri+" , ctxPath : "+ctxPath);
//		String path = "/board/list";

		String viewName = "/WEB-INF/views/home.jsp";
		ModelAndView mv;
		if(reqUri.equals(ctxPath+"/")) {
			mv = new ModelAndView(false, viewName);
		} else {
			int begIdx = ctxPath.length();
			int endIdx = reqUri.lastIndexOf(".");
			String path = reqUri.substring(begIdx, endIdx);
//			System.out.println("path=> "+path);
//			System.out.println("begIdx=> "+begIdx);
//			System.out.println("endIdx=> "+endIdx);
			Controller boardController = handlerMapping.getController(path);
			req.setAttribute("path", path);
			mv = boardController.requestMap(req, resp);
		}

		mv.forward(req, resp);
		
//		RequestDispatcher view = req.getRequestDispatcher(viewName);
//		view.forward(req, resp);
//		BoardController boardController = new BoardController();
//		ModelAndView mv = boardController.requestMap(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

}
