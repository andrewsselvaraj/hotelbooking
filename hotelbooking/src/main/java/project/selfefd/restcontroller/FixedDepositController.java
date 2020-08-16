package project.selfefd.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import project.selfefd.service.FixedDepositService;

public class FixedDepositController {
	@Autowired
	//@Qualifier("fixedDepositService")
	FixedDepositService fixedDepositService;
}
