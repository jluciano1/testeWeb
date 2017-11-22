package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela INTERESSELINKEDIN
 * @generated
 */
@Entity
@Table(name = "\"INTERESSELINKEDIN\"")
@XmlRootElement
public class InteresseLinkedIn implements Serializable {

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
  @Column(name = "nomeInfluencer", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeInfluencer;
  
  /**
  * @generated
  */
  @Column(name = "nomeEmpresa", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeEmpresa;
  
  /**
  * @generated
  */
  @Column(name = "nomeGrupo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeGrupo;
  
  /**
  * @generated
  */
  @Column(name = "nomeInstituicaoDeEnsino", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeInstituicaoDeEnsino;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_dadoPessoalLinkedIn", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalLinkedIn dadoPessoalLinkedIn;
  
  /**
   * Construtor
   * @generated
   */
  public InteresseLinkedIn(){
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
  public InteresseLinkedIn setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nomeInfluencer
   * return nomeInfluencer
   * @generated
   */
  public java.lang.String getNomeInfluencer(){
    return this.nomeInfluencer;
  }
  
  /**
   * Define nomeInfluencer
   * @param nomeInfluencer nomeInfluencer
   * @generated
   */
  public InteresseLinkedIn setNomeInfluencer(java.lang.String nomeInfluencer){
    this.nomeInfluencer = nomeInfluencer;
    return this;
  }
  
  /**
   * Obtém nomeEmpresa
   * return nomeEmpresa
   * @generated
   */
  public java.lang.String getNomeEmpresa(){
    return this.nomeEmpresa;
  }
  
  /**
   * Define nomeEmpresa
   * @param nomeEmpresa nomeEmpresa
   * @generated
   */
  public InteresseLinkedIn setNomeEmpresa(java.lang.String nomeEmpresa){
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  /**
   * Obtém nomeGrupo
   * return nomeGrupo
   * @generated
   */
  public java.lang.String getNomeGrupo(){
    return this.nomeGrupo;
  }
  
  /**
   * Define nomeGrupo
   * @param nomeGrupo nomeGrupo
   * @generated
   */
  public InteresseLinkedIn setNomeGrupo(java.lang.String nomeGrupo){
    this.nomeGrupo = nomeGrupo;
    return this;
  }
  
  /**
   * Obtém nomeInstituicaoDeEnsino
   * return nomeInstituicaoDeEnsino
   * @generated
   */
  public java.lang.String getNomeInstituicaoDeEnsino(){
    return this.nomeInstituicaoDeEnsino;
  }
  
  /**
   * Define nomeInstituicaoDeEnsino
   * @param nomeInstituicaoDeEnsino nomeInstituicaoDeEnsino
   * @generated
   */
  public InteresseLinkedIn setNomeInstituicaoDeEnsino(java.lang.String nomeInstituicaoDeEnsino){
    this.nomeInstituicaoDeEnsino = nomeInstituicaoDeEnsino;
    return this;
  }
  
  /**
   * Obtém dadoPessoalLinkedIn
   * return dadoPessoalLinkedIn
   * @generated
   */
  public DadoPessoalLinkedIn getDadoPessoalLinkedIn(){
    return this.dadoPessoalLinkedIn;
  }
  
  /**
   * Define dadoPessoalLinkedIn
   * @param dadoPessoalLinkedIn dadoPessoalLinkedIn
   * @generated
   */
  public InteresseLinkedIn setDadoPessoalLinkedIn(DadoPessoalLinkedIn dadoPessoalLinkedIn){
    this.dadoPessoalLinkedIn = dadoPessoalLinkedIn;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    InteresseLinkedIn object = (InteresseLinkedIn)obj;
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
