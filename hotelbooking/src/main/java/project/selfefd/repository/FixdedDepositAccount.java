package project.selfefd.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.selfefd.bean.*;
@Repository
public interface FixdedDepositAccount extends JpaRepository<CustomerInfo,Long>{}
