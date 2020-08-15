package project.selfefd.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seats")
public class Seats implements Serializable{
	
	
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Getter @Setter private Long id;
	 @Getter @Setter private String seatNo;
	 @Getter @Setter private String status;


	public Seats() {
		// TODO Auto-generated constructor stub
	}

}
