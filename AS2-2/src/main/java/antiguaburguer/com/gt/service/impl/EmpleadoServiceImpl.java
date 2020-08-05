package antiguaburguer.com.gt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antiguaburguer.com.gt.dao.IEmpleadoDAO;
import antiguaburguer.com.gt.model.Empleado;
import antiguaburguer.com.gt.service.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoDAO dao;
	
	
	@Override
	public Empleado registrar(Empleado t) {
		return dao.save(t);
	}

	@Override
	public Empleado modificar(Empleado t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Empleado listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Empleado> listar() {
		return dao.findAll();
	}

}
