package actions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionsController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping(value = "/api/actions")
	public String actionsTest() {
		return "app-with-actions version:0.0.4";
	}
	
	@GetMapping("/db-test")
	public String dbTest() {
	    String result = jdbcTemplate.queryForObject("SELECT NOW()", String.class);
	    return "DB 연결 성공! 현재 시간: " + result;
	}

}
