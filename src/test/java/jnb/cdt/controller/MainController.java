package jnb.cdt.controller;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;
import jnb.cdt.dao.CountryDAO;
import jnb.cdt.model.Country;

public class MainController {

	public MainController() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		final Morphia morphia = new Morphia();
		morphia.mapPackage("jnb.cdt.model");				
		CountryDAO countryDAO = new CountryDAO(morphia, new MongoClient());

		ObjectId id = new ObjectId("574883cbd15c296d7022f1f5");


		//get
		Country countryEntry = countryDAO.get(id);
		System.out.println("Using DAO " + countryEntry.getName());

		//update
		countryEntry.setDescription("40 million inhabitants.");
		countryDAO.save(countryEntry);

		//delete
		ObjectId id1 = new ObjectId("57487f3cd15c29a738edde68");
		String deleteResult = countryDAO.deleteById(id1).toString();
		
		System.out.println(deleteResult);
	}
}
