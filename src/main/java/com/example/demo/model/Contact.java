package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CONTACT_DETAIL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact{
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_NUB")
	private String contactNumber;
	
	@Column(name="CONTACT_MAIL")
	private String contactMail;
	
	@Column(name="ACTIVE_SWH")
	private Character activeSwitch;
	
	@Column(name="CREATED_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name="UPDATED_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;

		
	}

