package com.test01.touhou.dao;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import com.test01.touhou.vo.*;
public class MemberDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	// 로그인 처리 함수
	public int login(MemberVO mVO) {
		return sqlSession.selectOne("mSQL.login", mVO);
	}
}
