package antiguaburguer.com.gt.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antiguaburguer.com.gt.dao.IClienteDAO;
import antiguaburguer.com.gt.model.Cliente;
import antiguaburguer.com.gt.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDAO dao;
	
	
	@Override
	public Cliente registrar(Cliente t) {
		return dao.save(t);
	}

	@Override
	public Cliente modificar(Cliente t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Cliente listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Cliente> listar() {
		return dao.findAll();
	}


}
