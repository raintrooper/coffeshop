package antiguaburguer.com.gt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import antiguaburguer.com.gt.model.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado,Integer> {
	
}
 