package com.test01.touhou.controller.member;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.view.RedirectView;

import com.test01.touhou.vo.*;
import com.test01.touhou.dao.*;

@Controller
@RequestMapping("/member")

public class MemberController {
	
	@Autowired
	MemberDAO mDAO;
	
	// 로그인 화면
	@RequestMapping("/login.touhou")
	public ModelAndView login(ModelAndView mv) {
		String view = "member/login";
		mv.setViewName(view);
		return mv;
	}
	
	// 로그인 처리함수
	@RequestMapping(value="/loginProc.touhou", method=RequestMethod.POST, params= {"id", "pw"})
	public ModelAndView loginProc(ModelAndView mv, MemberVO mVO, String id, String pw, HttpSession session) {
		mVO.setId(id);
		mVO.setPw(pw);
		int cnt = mDAO.login(mVO);
		String view = "board/boardList";
		if(cnt == 1) {
			session.setAttribute("SID", mVO.getId());
			mv.setViewName(view);			
		} else {
			view = "member/login";
			mv.setViewName(view);			
		}
		
		return mv;
	}
}
