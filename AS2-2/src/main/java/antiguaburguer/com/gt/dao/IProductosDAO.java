package antiguaburguer.com.gt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import antiguaburguer.com.gt.model.Productos;
public interface IProductosDAO extends JpaRepository<Productos, Integer> {

}
