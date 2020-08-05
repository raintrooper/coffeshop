package antiguaburguer.com.gt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antiguaburguer.com.gt.model.Menu;
import antiguaburguer.com.gt.service.IMenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private IMenuService service;

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Menu>> listar(){
		return new ResponseEntity<List<Menu>>(service.listar(), HttpStatus.OK);
	}
	
}
