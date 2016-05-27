package jnb.cdt.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import com.mongodb.MongoClient;
import jnb.cdt.model.Country;

public class CountryDAO extends BasicDAO<Country, ObjectId>{
	public CountryDAO(Morphia morphia, MongoClient mongoClient) {
        super(mongoClient, morphia, "cdt");
	}
}
