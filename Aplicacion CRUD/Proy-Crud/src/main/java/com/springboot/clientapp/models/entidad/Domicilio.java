package com.springboot.clientapp.models.entidad;
import java.io.Serializable;	

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.GenerateType;

@Entity
@Table(name="domicilio")
public class Domicilio implements Serializable{

	@Id
	@GenerateValue(Strategy=GenerationType.IDENTITY)
	private Long id_domicilio;
	private String ciudad;
	private String calle;
	private int numero;
	
	public Long getId() {
		return id_domicilio;
	}
	public void setId(Long id) {
		this.id_domicilio = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Domicilio [id_domicilio=" + id_domicilio + ", ciudad=" + ciudad + ", calle=" + calle + ", numero=" + numero + "]";
	}
	
	
}
	