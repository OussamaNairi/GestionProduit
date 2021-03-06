package org.sid.catservice.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Produit implements Serializable {
	
	public Produit(Object object, String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private double price;
	private int quantite;

}
