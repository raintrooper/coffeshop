package antiguaburguer.com.gt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antiguaburguer.com.gt.dao.IProductosDAO;
import antiguaburguer.com.gt.model.Productos;
import antiguaburguer.com.gt.service.IProductosService;

@Service
public class IProductosServiceImpl implements IProductosService{
	@Autowired
	private IProductosDAO dao;
	
	
	@Override
	public Productos registrar(Productos t) {
		return dao.save(t);
	}

	@Override
	public Productos modificar(Productos t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Productos listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Productos> listar() {
		return dao.findAll();
	}
}
