package com.example.apiRestBaoziStore.model;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomeProduto;
	private BigDecimal preco;
	private Boolean estoque;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Boolean getEstoque() {
		return estoque;
	}
	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", preco=" + preco + ", estoque=" + estoque + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(estoque, id, nomeProduto, preco);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(estoque, other.estoque) && Objects.equals(id, other.id)
				&& Objects.equals(nomeProduto, other.nomeProduto) && Objects.equals(preco, other.preco);
	}
}
