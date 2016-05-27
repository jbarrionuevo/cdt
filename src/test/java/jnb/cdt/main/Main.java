package jnb.cdt.main;

import java.util.Iterator;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;

import jnb.cdt.model.Country;
import jnb.cdt.model.CountryImpl;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		final Morphia morphia = new Morphia();

		// tell Morphia where to find your classes
		// can be called multiple times with different packages or classes
		morphia.mapPackage("jnb.cdt.model");

		// create the Datastore connecting to the default port on the local host
		final Datastore datastore = morphia.createDatastore(new MongoClient(), "cdt");
		datastore.ensureIndexes();
		
		final Country argentina = new CountryImpl("Argentina");
		datastore.save(argentina);
		
		final Query<Country> queryCountries = datastore.createQuery(Country.class);		
		System.out.println(queryCountries);
		
		List<CountryImpl> paises = datastore.find(CountryImpl.class).asList();
		
		Iterator<CountryImpl> it = paises.iterator();
		
		while (it.hasNext()) {
			CountryImpl countryImplTemp = (CountryImpl) it.next();
			System.out.println("-ID: " + countryImplTemp.getName());
		}				
	}
}
