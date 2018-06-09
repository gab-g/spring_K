package org.comstudy21.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController implements Controller {
	public ModelAndView requestMap(HttpServletRequest req, HttpServletResponse resp){
		String path = (String)req.getAttribute("path");
		ModelAndView mv = null;
		if("/board/list".equals(path)){
			mv =  new ModelAndView(false, "/WEB-INF/views/board/board_list.jsp");
		}else if("/board/insert".equals(path)){
			mv =  new ModelAndView(false, "/WEB-INF/views/board/board_insert.jsp");
		}else if("/board/detail".equals(path)){
			mv =  new ModelAndView(false, "/WEB-INF/views/board/board_detail.jsp");
		}
		return mv;
	}
}
