package jnb.cdt.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import com.mongodb.MongoClient;
import jnb.cdt.model.Country;

public class CountryDAO extends BasicDAO<Country, ObjectId> implements DAO{

	public CountryDAO(Morphia morphia, MongoClient mongoClient) {
        super(mongoClient, morphia, "cdt");
	}

	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object> findById() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object> findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insert(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmployee(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmployee(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
