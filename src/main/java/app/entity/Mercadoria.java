package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela MERCADORIA
 * @generated
 */
@Entity
@Table(name = "\"MERCADORIA\"")
@XmlRootElement
public class Mercadoria implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;
  
  /**
  * @generated
  */
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer quantidade;
  
  /**
  * @generated
  */
  @Column(name = "preco", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double preco;
  
  /**
  * @generated
  */
  @Column(name = "negocio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String negocio;
  
  /**
   * Construtor
   * @generated
   */
  public Mercadoria(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.Integer getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Mercadoria setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  public java.lang.String getTipo(){
    return this.tipo;
  }
  
  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public Mercadoria setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }
  
  /**
   * Obtém nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Mercadoria setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém quantidade
   * return quantidade
   * @generated
   */
  public java.lang.Integer getQuantidade(){
    return this.quantidade;
  }
  
  /**
   * Define quantidade
   * @param quantidade quantidade
   * @generated
   */
  public Mercadoria setQuantidade(java.lang.Integer quantidade){
    this.quantidade = quantidade;
    return this;
  }
  
  /**
   * Obtém preco
   * return preco
   * @generated
   */
  public java.lang.Double getPreco(){
    return this.preco;
  }
  
  /**
   * Define preco
   * @param preco preco
   * @generated
   */
  public Mercadoria setPreco(java.lang.Double preco){
    this.preco = preco;
    return this;
  }
  
  /**
   * Obtém negocio
   * return negocio
   * @generated
   */
  public java.lang.String getNegocio(){
    return this.negocio;
  }
  
  /**
   * Define negocio
   * @param negocio negocio
   * @generated
   */
  public Mercadoria setNegocio(java.lang.String negocio){
    this.negocio = negocio;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Mercadoria object = (Mercadoria)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}