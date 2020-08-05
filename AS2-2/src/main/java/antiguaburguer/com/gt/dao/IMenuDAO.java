package antiguaburguer.com.gt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import antiguaburguer.com.gt.model.Menu;

public interface IMenuDAO extends JpaRepository<Menu, Integer>  {

}
