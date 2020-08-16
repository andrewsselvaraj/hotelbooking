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
@Table(name = "accounts")
public class FixedDeposit {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Getter @Setter private Long id;
	 @Getter @Setter private String productCode;
	 @Getter @Setter private Double amount;
	 @Getter @Setter private int tenure;
}
