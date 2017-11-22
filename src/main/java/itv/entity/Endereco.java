package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ENDERECO
 * @generated
 */
@Entity
@Table(name = "\"ENDERECO\"")
@XmlRootElement
public class Endereco implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = true, insertable=true, updatable=true)
  private java.lang.Integer id;
  
  /**
  * @generated
  */
  @Column(name = "logradouro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String logradouro;
  
  /**
  * @generated
  */
  @Column(name = "complemento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String complemento;
  
  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer numero;
  
  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String bairro;
  
  /**
  * @generated
  */
  @Column(name = "cep", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Integer cep;
  
  /**
  * @generated
  */
  @Column(name = "cidade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cidade;
  
  /**
  * @generated
  */
  @Column(name = "uf", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String uf;
  
  /**
  * @generated
  */
  @Column(name = "referencia", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String referencia;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pessoa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Pessoa pessoa;
  
  /**
   * Construtor
   * @generated
   */
  public Endereco(){
  }

  
  /**
   * Obtém logradouro
   * return logradouro
   * @generated
   */
  public java.lang.String getLogradouro(){
    return this.logradouro;
  }
  
  /**
   * Define logradouro
   * @param logradouro logradouro
   * @generated
   */
  public Endereco setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }
  
  /**
   * Obtém complemento
   * return complemento
   * @generated
   */
  public java.lang.String getComplemento(){
    return this.complemento;
  }
  
  /**
   * Define complemento
   * @param complemento complemento
   * @generated
   */
  public Endereco setComplemento(java.lang.String complemento){
    this.complemento = complemento;
    return this;
  }
  
  /**
   * Obtém numero
   * return numero
   * @generated
   */
  public java.lang.Integer getNumero(){
    return this.numero;
  }
  
  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Endereco setNumero(java.lang.Integer numero){
    this.numero = numero;
    return this;
  }
  
  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  public java.lang.String getBairro(){
    return this.bairro;
  }
  
  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public Endereco setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }
  
  /**
   * Obtém cep
   * return cep
   * @generated
   */
  public java.lang.Integer getCep(){
    return this.cep;
  }
  
  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public Endereco setCep(java.lang.Integer cep){
    this.cep = cep;
    return this;
  }
  
  /**
   * Obtém cidade
   * return cidade
   * @generated
   */
  public java.lang.String getCidade(){
    return this.cidade;
  }
  
  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Endereco setCidade(java.lang.String cidade){
    this.cidade = cidade;
    return this;
  }
  
  /**
   * Obtém uf
   * return uf
   * @generated
   */
  public java.lang.String getUf(){
    return this.uf;
  }
  
  /**
   * Define uf
   * @param uf uf
   * @generated
   */
  public Endereco setUf(java.lang.String uf){
    this.uf = uf;
    return this;
  }
  
  /**
   * Obtém referencia
   * return referencia
   * @generated
   */
  public java.lang.String getReferencia(){
    return this.referencia;
  }
  
  /**
   * Define referencia
   * @param referencia referencia
   * @generated
   */
  public Endereco setReferencia(java.lang.String referencia){
    this.referencia = referencia;
    return this;
  }
  
  /**
   * Obtém pessoa
   * return pessoa
   * @generated
   */
  public Pessoa getPessoa(){
    return this.pessoa;
  }
  
  /**
   * Define pessoa
   * @param pessoa pessoa
   * @generated
   */
  public Endereco setPessoa(Pessoa pessoa){
    this.pessoa = pessoa;
    return this;
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
  public Endereco setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Endereco object = (Endereco)obj;
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
