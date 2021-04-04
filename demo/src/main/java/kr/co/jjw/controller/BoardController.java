package kr.co.jjw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.jjw.dto.UserVO;
import kr.co.jjw.service.BoardService;

@RestController
@RequestMapping("/jjw")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping(value = "/main")
	public UserVO main() {
		
		return boardService.getTestDb();
	
		
	}
	
	
	@GetMapping(value = "/detail/{bbscttNo}")
	public ResponseEntity<String> getBoardDetail(@PathVariable(name = "bbscttNo", required = true) int bbscttNo)
			throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String postJson = mapper.writeValueAsString(boardService.getTestDb())+bbscttNo;

		return ResponseEntity.ok().body(postJson);

	}


	
	

}
