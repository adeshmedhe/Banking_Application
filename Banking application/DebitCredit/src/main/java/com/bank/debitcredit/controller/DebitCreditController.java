package com.bank.debitcredit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debitcredit")
public class DebitCreditController {
	
	@GetMapping()
	public String test() {
		return "DebitCredit working";
	}

}
