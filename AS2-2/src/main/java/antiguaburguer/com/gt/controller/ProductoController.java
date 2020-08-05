package antiguaburguer.com.gt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antiguaburguer.com.gt.model.Productos;
import antiguaburguer.com.gt.service.IProductosService;
@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private IProductosService service;

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Productos>> listar(){
		return new ResponseEntity<List<Productos>>(service.listar(), HttpStatus.OK);
	}
}
