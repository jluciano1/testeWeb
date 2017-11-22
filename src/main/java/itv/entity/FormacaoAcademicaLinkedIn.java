package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela FORMACAOACADEMICALINKEDIN
 * @generated
 */
@Entity
@Table(name = "\"FORMACAOACADEMICALINKEDIN\"")
@XmlRootElement
public class FormacaoAcademicaLinkedIn implements Serializable {

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
  @Column(name = "ensinoSuperior", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ensinoSuperior;
  
  /**
  * @generated
  */
  @Column(name = "curso", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String curso;
  
  /**
  * @generated
  */
  @Column(name = "formacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String formacao;
  
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
  @JoinColumn(name="fk_dadoPessoalLinkedIn", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalLinkedIn dadoPessoalLinkedIn;
  
  /**
   * Construtor
   * @generated
   */
  public FormacaoAcademicaLinkedIn(){
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
  public FormacaoAcademicaLinkedIn setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém ensinoSuperior
   * return ensinoSuperior
   * @generated
   */
  public java.lang.String getEnsinoSuperior(){
    return this.ensinoSuperior;
  }
  
  /**
   * Define ensinoSuperior
   * @param ensinoSuperior ensinoSuperior
   * @generated
   */
  public FormacaoAcademicaLinkedIn setEnsinoSuperior(java.lang.String ensinoSuperior){
    this.ensinoSuperior = ensinoSuperior;
    return this;
  }
  
  /**
   * Obtém curso
   * return curso
   * @generated
   */
  public java.lang.String getCurso(){
    return this.curso;
  }
  
  /**
   * Define curso
   * @param curso curso
   * @generated
   */
  public FormacaoAcademicaLinkedIn setCurso(java.lang.String curso){
    this.curso = curso;
    return this;
  }
  
  /**
   * Obtém formacao
   * return formacao
   * @generated
   */
  public java.lang.String getFormacao(){
    return this.formacao;
  }
  
  /**
   * Define formacao
   * @param formacao formacao
   * @generated
   */
  public FormacaoAcademicaLinkedIn setFormacao(java.lang.String formacao){
    this.formacao = formacao;
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
  public FormacaoAcademicaLinkedIn setAno(java.util.Date ano){
    this.ano = ano;
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
  public FormacaoAcademicaLinkedIn setDadoPessoalLinkedIn(DadoPessoalLinkedIn dadoPessoalLinkedIn){
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
    FormacaoAcademicaLinkedIn object = (FormacaoAcademicaLinkedIn)obj;
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
