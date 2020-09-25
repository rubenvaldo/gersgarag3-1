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
@NoArgsConstructor
@AllArgsConstructor
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

}
