package dream.blitz.boot.pollution.control.jpa;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "T_DB_VEHICLE")
public class Vehicle {

	@Id
	@Column
	UUID id;
	@Column
	UUID center;
	@Column
	String model;
	@Column
	String number;
	@Column
	String mobile;
	@Column
	String owner;

}
