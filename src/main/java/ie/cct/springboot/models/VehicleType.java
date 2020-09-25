package ie.cct.springboot.models;

import javax.persistence.Entity;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data // getters and setters
@EqualsAndHashCode(callSuper = false) // optional but necessary
//@JsonIdentifyInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehicleType extends CommonObject {

}
