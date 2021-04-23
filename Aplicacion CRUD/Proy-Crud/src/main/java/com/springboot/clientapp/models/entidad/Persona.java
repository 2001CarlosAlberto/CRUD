package com.springboot.clientapp.models.entidad;
import java.io.Serializable;	

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerateType;

import javax.persistence.MayToOne;

@Entity
@Table(name="persona")
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GenerateValue(Strategy=GenerationType.IDENTITY)
	private Long dni;
	private String nombre;
	private Long Id_domicilio;
	
	@MayToOne
	@JoinColumn(name="Id_domicilio")
	private Domicilio domicilio;

	public Long getDNI() {
		return dni;
	}

	public void setDNI(Long dNI) {
		dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId_domicilio() {
		return Id_domicilio;
	}

	public void setId_domicilio(Long id_domicilio) {
		Id_domicilio = id_domicilio;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", Id_domicilio=" + Id_domicilio + ", domicilio="
				+ domicilio + "]";
	} 
	
	

}
