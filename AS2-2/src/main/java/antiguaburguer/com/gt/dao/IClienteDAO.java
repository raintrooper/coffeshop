package antiguaburguer.com.gt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import antiguaburguer.com.gt.model.Cliente;
public interface IClienteDAO extends JpaRepository<Cliente, Integer> {

}
