package app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "\"MERCADORIA\"")
@XmlRootElement
public class Mercadoria implements Serializable {

  private static final long serialVersionUID = 1L;
  
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;
  
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo;
  
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer quantidade;
  
  @Column(name = "preco", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double preco;
  
  @Column(name = "negocio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String negocio;
  
  public Mercadoria(){
  }

  public java.lang.Integer getId(){
    return this.id;
  }
  
  public Mercadoria setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  public java.lang.String getTipo(){
    return this.tipo;
  }
  
  public Mercadoria setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }
  
  public java.lang.String getNome(){
    return this.nome;
  }
  
  public Mercadoria setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  public java.lang.Integer getQuantidade(){
    return this.quantidade;
  }
  
  public Mercadoria setQuantidade(java.lang.Integer quantidade){
    this.quantidade = quantidade;
    return this;
  }
  
  public java.lang.Double getPreco(){
    return this.preco;
  }
  
  public Mercadoria setPreco(java.lang.Double preco){
    this.preco = preco;
    return this;
  }
  
  public java.lang.String getNegocio(){
    return this.negocio;
  }
  
  public Mercadoria setNegocio(java.lang.String negocio){
    this.negocio = negocio;
    return this;
  }
  
}