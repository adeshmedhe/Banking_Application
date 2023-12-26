package com.bank.debitcredit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class DebitCredit {
	
	@Id
	private int transactionId;
	
	private double amount;
	
	private String type;
	
	@CreationTimestamp
	private LocalDateTime transactedAt;

}
