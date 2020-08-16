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
@Table(name = "userinfo")

public class CustomerInfo implements Serializable{

	private static final long serialVersionUID = 9037059103772839862L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private String pk_user_id;
	@Getter @Setter private String user_name;
 	 @Getter @Setter private String password;
	 @Getter @Setter private String email_id;
	 @Getter @Setter private String current_designation;
	 @Getter @Setter private String current_role;
	 @Getter @Setter private String created_by;
	 @Getter @Setter private String modified_by;

	
}
