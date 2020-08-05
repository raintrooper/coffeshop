package antiguaburguer.com.gt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antiguaburguer.com.gt.model.Empleado;
import antiguaburguer.com.gt.service.IEmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService service;
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Empleado>> listar(){
		return new ResponseEntity<List<Empleado>>(service.listar(), HttpStatus.OK);
	}
	
}
