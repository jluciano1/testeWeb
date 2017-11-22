package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela DADOPESSOALLINKEDIN
 * @generated
 */
@Entity
@Table(name = "\"DADOPESSOALLINKEDIN\"")
@XmlRootElement
public class DadoPessoalLinkedIn implements Serializable {

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
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String url;
  
  /**
  * @generated
  */
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date aniversario;
  
  /**
   * Construtor
   * @generated
   */
  public DadoPessoalLinkedIn(){
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
  public DadoPessoalLinkedIn setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém url
   * return url
   * @generated
   */
  public java.lang.String getUrl(){
    return this.url;
  }
  
  /**
   * Define url
   * @param url url
   * @generated
   */
  public DadoPessoalLinkedIn setUrl(java.lang.String url){
    this.url = url;
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
  public DadoPessoalLinkedIn setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém aniversario
   * return aniversario
   * @generated
   */
  public java.util.Date getAniversario(){
    return this.aniversario;
  }
  
  /**
   * Define aniversario
   * @param aniversario aniversario
   * @generated
   */
  public DadoPessoalLinkedIn setAniversario(java.util.Date aniversario){
    this.aniversario = aniversario;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    DadoPessoalLinkedIn object = (DadoPessoalLinkedIn)obj;
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
