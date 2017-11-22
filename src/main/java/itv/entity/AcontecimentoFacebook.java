package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ACONTECIMENTOFACEBOOK
 * @generated
 */
@Entity
@Table(name = "\"ACONTECIMENTOFACEBOOK\"")
@XmlRootElement
public class AcontecimentoFacebook implements Serializable {

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
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String descricao;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "ano", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date ano;
  
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
  public AcontecimentoFacebook(){
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
  public AcontecimentoFacebook setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  public java.lang.String getDescricao(){
    return this.descricao;
  }
  
  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public AcontecimentoFacebook setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * Obtém ano
   * return ano
   * @generated
   */
  public java.util.Date getAno(){
    return this.ano;
  }
  
  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public AcontecimentoFacebook setAno(java.util.Date ano){
    this.ano = ano;
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
  public AcontecimentoFacebook setDadoPessoalFacebook(DadoPessoalFacebook dadoPessoalFacebook){
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
    AcontecimentoFacebook object = (AcontecimentoFacebook)obj;
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
