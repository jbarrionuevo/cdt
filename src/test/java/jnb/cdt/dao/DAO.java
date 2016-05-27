package jnb.cdt.dao;

import java.util.List;

public interface DAO {
	List<Object> findAll();
	List<Object> findById();
	List<Object> findByName();
	boolean insert(Object entity);
	boolean updateEmployee(Object entity);
	boolean deleteEmployee(Object entity);	
}
