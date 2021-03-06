package com.devproject.springboot.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "tb_pessoa", uniqueConstraints={@UniqueConstraint(columnNames={"cpf"})})
public class Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long Id;
	private String cpf;
	private String nomePessoa;
	
	@OneToMany
	@JoinColumn(name="ID_PESSOA")
	private List <Alimento> alimentos;
	
	public Pessoa() {
		
	}
	public Pessoa(Long id, String cpf, String nomePessoa) {
		super();
		Id = id;
		this.cpf = cpf;
		this.nomePessoa = nomePessoa;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public List <Alimento> getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(List <Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nomePessoa == null) ? 0 : nomePessoa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nomePessoa == null) {
			if (other.nomePessoa != null)
				return false;
		} else if (!nomePessoa.equals(other.nomePessoa))
			return false;
		return true;
	}
	
	
}
