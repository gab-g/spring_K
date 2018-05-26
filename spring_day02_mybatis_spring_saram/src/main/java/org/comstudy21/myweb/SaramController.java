package org.comstudy21.myweb;

import java.util.List;

import org.comstudy21.myweb.dao.SaramDao;
import org.comstudy21.myweb.dto.Saram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaramController {

	@Autowired
	private SaramDao saramDao;
	
	@RequestMapping(value="/saram/saram.do", method=RequestMethod.GET)
	public ModelAndView list(Model md){
		String viewName = "saram/saramList";
		ModelAndView mv = new ModelAndView(viewName);
		
		//saramDao에서 사람 list를 받아 mv에 담는다.
		List<Saram> list = saramDao.selectList();
		mv.addObject("list", list);
		
		return mv;
	}
}
