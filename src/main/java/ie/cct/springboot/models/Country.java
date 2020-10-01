package ie.cct.springboot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // getters and setters
//@NoArgsConstructor
//@AllArgsConstructor
//@JsonIdentifyInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") // this line needed only when using @OneToMany relationship
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String code;
	private String capital;
	private String description;
	private String nationality;
	private String continent;
	
	//@OneToMany(mappedBy = "country") //mappedBy is telling Hibernate the relationship is already handled by the states
		//private List<State> states; // optional... but if used then you need to include @JSonIdentityInfo
	
	public Country() {
		//super();
	}
	
	public Country(Integer id, String code, String capital, String description, String nationality, String continent) {
		//super();
		this.id = id;
		this.code = code;
		this.capital = capital;
		this.description = description;
		this.nationality = nationality;
		this.continent = continent;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
	
	
	
	
	

}

