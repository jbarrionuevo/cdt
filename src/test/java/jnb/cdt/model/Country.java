package jnb.cdt.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("country")
public abstract class Country {
	
	@Id
    private ObjectId id;
	public String name;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	public Country(String nameConstruction) {
		// TODO Auto-generated constructor stub
		this.name = nameConstruction;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
//	@Entity("employees")
//	@Indexes(
//	    @Index(value = "salary", fields = @Field("salary"))
//	)
//	class Employee {
//	    @Id
//	    private ObjectId id;
//	    private String name;
//	    @Reference
//	    private Employee manager;
//	    @Reference
//	    private List<Employee> directReports;
//	    @Property("wage")
//	    private Double salary;
//	}
}