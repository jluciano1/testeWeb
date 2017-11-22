package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela MEMBROFAMILIAFACEBOOK
 * @generated
 */
@Entity
@Table(name = "\"MEMBROFAMILIAFACEBOOK\"")
@XmlRootElement
public class MembroFamiliaFacebook implements Serializable {

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
  @Column(name = "url", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String url;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "parentesco", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String parentesco;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_dadoPessoalFacebook", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalFacebook dadoPessoalFacebook;
  
  /**
   * Construtor
   * @generated
   */
  public MembroFamiliaFacebook(){
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
  public MembroFamiliaFacebook setId(java.lang.Integer id){
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
  public MembroFamiliaFacebook setUrl(java.lang.String url){
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
  public MembroFamiliaFacebook setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém parentesco
   * return parentesco
   * @generated
   */
  public java.lang.String getParentesco(){
    return this.parentesco;
  }
  
  /**
   * Define parentesco
   * @param parentesco parentesco
   * @generated
   */
  public MembroFamiliaFacebook setParentesco(java.lang.String parentesco){
    this.parentesco = parentesco;
    return this;
  }
  
  /**
   * Obtém dadoPessoalFacebook
   * return dadoPessoalFacebook
   * @generated
   */
  public DadoPessoalFacebook getDadoPessoalFacebook(){
    return this.dadoPessoalFacebook;
  }
  
  /**
   * Define dadoPessoalFacebook
   * @param dadoPessoalFacebook dadoPessoalFacebook
   * @generated
   */
  public MembroFamiliaFacebook setDadoPessoalFacebook(DadoPessoalFacebook dadoPessoalFacebook){
    this.dadoPessoalFacebook = dadoPessoalFacebook;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    MembroFamiliaFacebook object = (MembroFamiliaFacebook)obj;
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
