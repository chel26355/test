package kr.co.jjw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jjw.dto.UserVO;
import kr.co.jjw.mapper.BoardMapper;

@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;

	public UserVO getTestDb() {
		return boardMapper.getTestDb();
		
	}

}
