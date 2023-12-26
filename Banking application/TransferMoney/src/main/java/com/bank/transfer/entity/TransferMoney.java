package com.bank.transfer.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class TransferMoney {
	
	@Id
	private int transactionId;
	
	private String fromAccount;
	
	private String toAccount;
	
	private double amount;
	
	@CreationTimestamp
	private LocalDateTime time;

}
