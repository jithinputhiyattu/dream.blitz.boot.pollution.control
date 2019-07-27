package dream.blitz.boot.pollution.control.jpa;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "T_DB_CENTER")
public class Center {
	
	@Id
	@Column
	UUID id;
	@Column
	String name;
	@OneToOne
	@JoinColumn(name = "id")
	Address address;
}
