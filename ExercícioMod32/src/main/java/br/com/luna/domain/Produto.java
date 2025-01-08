/**
 * 
 */
package br.com.luna.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
/**
 * @author user
 */
@Entity
@Table(name = "TB_PRODUTODOIS")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produtodois_seq")
	@SequenceGenerator(name="produtodois_seq", sequenceName="sq_produtodois", initialValue = 1, allocationSize = 1)
	 private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	 private String codigo;
	
	@Column(name = "VALOR")
	 private Double valor;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
