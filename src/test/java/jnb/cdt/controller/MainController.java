package jnb.cdt.controller;

import java.util.Iterator;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;

import jnb.cdt.dao.CountryDAO;
import jnb.cdt.model.Country;
import jnb.cdt.model.CountryImpl;

public class MainController {

	public MainController() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		final Morphia morphia = new Morphia();
		morphia.mapPackage("jnb.cdt.model");				
		
		CountryDAO countryDAO = new CountryDAO(morphia, new MongoClient());

		ObjectId id = new ObjectId("574883cbd15c296d7022f1f5");
		//ObjectId  countryEntryId = countryEntryDAO.get(id);
		Country CountryEntry = countryDAO.get(id);

		System.out.println("Using DAO " + CountryEntry.getName());
		
		// update it
		//myBlogEntry.setTitle("My Blog Entry");
		//blogEntryDAO.save(myBlogEntry);

		// or just delete it
		//blogEntryDAO.deleteById(myBlogEntry.getId());
	}
}
