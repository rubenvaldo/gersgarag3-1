package ie.cct.springboot.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// SuperClass
@MappedSuperclass // tells Spring this object is not an entity. It's an abstract class, therefore you can't have a table called CommonObject
//@JsonIdentifyInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") // this line needed only when using @OneToMany relationship
public class CommonObject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private String details;
	
	public CommonObject(Integer id, String description, String details) {
		//super();
		this.id = id;
		this.description = description;
		this.details = details;
	}

	public CommonObject() {
		//super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "CommonObject [id=" + id + ", description=" + description + ", details=" + details + "]";
	}
	
	
	
	
	
	

}
