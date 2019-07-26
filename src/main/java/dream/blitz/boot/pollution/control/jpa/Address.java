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
@Table(name = "T_DB_ADDRESS")
public class Address {

	@Id
	@Column
	UUID id;
	@Column
	String lineOne;
	@Column
	String lineTwo;
	@Column
	String district;
	@Column
	String state;
	@Column
	String conutry;
	@Column
	String pin;
}
