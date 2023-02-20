package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Example")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Eid;
	private String Name;
	private String UserId;
	private String Lab;
	private String Designation;
	private String Password;
	private String CPassword;
}

