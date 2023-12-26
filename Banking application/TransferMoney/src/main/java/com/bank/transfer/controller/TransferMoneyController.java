package com.bank.transfer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfermoney")
public class TransferMoneyController {
	
	@GetMapping("")
	public String test() {
		return "Transfer service working";
	}

}
