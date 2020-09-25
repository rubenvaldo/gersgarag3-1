package ie.cct.springboot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // getters and setters
@NoArgsConstructor
@AllArgsConstructor
//@JsonIdentifyInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") // this line needed only when using @OneToMany relationship
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String capital;
	private String code;
	
	@ManyToOne
	@JoinColumn(name= "countryid", insertable = false, updatable = false)
	private Country country;
	
	private Integer countryid;
	
	private String details;

}
