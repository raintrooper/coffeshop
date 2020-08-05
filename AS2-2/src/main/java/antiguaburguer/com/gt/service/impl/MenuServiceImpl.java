package antiguaburguer.com.gt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antiguaburguer.com.gt.dao.IMenuDAO;
import antiguaburguer.com.gt.model.Menu;
import antiguaburguer.com.gt.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService {
	@Autowired
	private IMenuDAO dao;
	
	
	@Override
	public Menu registrar(Menu t) {
		return dao.save(t);
	}

	@Override
	public Menu modificar(Menu t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Menu listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Menu> listar() {
		return dao.findAll();
	}
}
