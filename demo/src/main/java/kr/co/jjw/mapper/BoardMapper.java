package kr.co.jjw.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.jjw.dto.UserVO;

@Mapper
public interface BoardMapper {
	
	UserVO getTestDb();

}
