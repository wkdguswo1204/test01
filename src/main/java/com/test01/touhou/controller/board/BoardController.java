package com.test01.touhou.controller.board;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.servlet.*;

import com.test01.touhou.dao.*;
import com.test01.touhou.vo.*;

public class BoardController {
	@Autowired
	BoardDAO bDAO;
	
	//보드리스트 뷰
	public ModelAndView boardList(ModelAndView mv) {
		String view = "/board/boardList";
		mv.setViewName(view);
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		List blist = bDAO.getList();
		mv.addObject("DATA", blist);
		return mv;
	}
}
