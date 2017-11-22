package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela EDUCACAOFACEBOOK
 * @generated
 */
@Entity
@Table(name = "\"EDUCACAOFACEBOOK\"")
@XmlRootElement
public class EducacaoFacebook implements Serializable {

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
  @Column(name = "ensinoMedio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ensinoMedio;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "anoEnsinoMedio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date anoEnsinoMedio;
  
  /**
  * @generated
  */
  @Column(name = "ensinoSuperior", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ensinoSuperior;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "anoEnsinoSuperior", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date anoEnsinoSuperior;
  
  /**
  * @generated
  */
  @Column(name = "cursoSuperior", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cursoSuperior;
  
  /**
  * @generated
  */
  @Column(name = "formacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String formacao;
  
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
  public EducacaoFacebook(){
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
  public EducacaoFacebook setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém ensinoMedio
   * return ensinoMedio
   * @generated
   */
  public java.lang.String getEnsinoMedio(){
    return this.ensinoMedio;
  }
  
  /**
   * Define ensinoMedio
   * @param ensinoMedio ensinoMedio
   * @generated
   */
  public EducacaoFacebook setEnsinoMedio(java.lang.String ensinoMedio){
    this.ensinoMedio = ensinoMedio;
    return this;
  }
  
  /**
   * Obtém anoEnsinoMedio
   * return anoEnsinoMedio
   * @generated
   */
  public java.util.Date getAnoEnsinoMedio(){
    return this.anoEnsinoMedio;
  }
  
  /**
   * Define anoEnsinoMedio
   * @param anoEnsinoMedio anoEnsinoMedio
   * @generated
   */
  public EducacaoFacebook setAnoEnsinoMedio(java.util.Date anoEnsinoMedio){
    this.anoEnsinoMedio = anoEnsinoMedio;
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
  public EducacaoFacebook setEnsinoSuperior(java.lang.String ensinoSuperior){
    this.ensinoSuperior = ensinoSuperior;
    return this;
  }
  
  /**
   * Obtém anoEnsinoSuperior
   * return anoEnsinoSuperior
   * @generated
   */
  public java.util.Date getAnoEnsinoSuperior(){
    return this.anoEnsinoSuperior;
  }
  
  /**
   * Define anoEnsinoSuperior
   * @param anoEnsinoSuperior anoEnsinoSuperior
   * @generated
   */
  public EducacaoFacebook setAnoEnsinoSuperior(java.util.Date anoEnsinoSuperior){
    this.anoEnsinoSuperior = anoEnsinoSuperior;
    return this;
  }
  
  /**
   * Obtém cursoSuperior
   * return cursoSuperior
   * @generated
   */
  public java.lang.String getCursoSuperior(){
    return this.cursoSuperior;
  }
  
  /**
   * Define cursoSuperior
   * @param cursoSuperior cursoSuperior
   * @generated
   */
  public EducacaoFacebook setCursoSuperior(java.lang.String cursoSuperior){
    this.cursoSuperior = cursoSuperior;
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
  public EducacaoFacebook setFormacao(java.lang.String formacao){
    this.formacao = formacao;
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
  public EducacaoFacebook setDadoPessoalFacebook(DadoPessoalFacebook dadoPessoalFacebook){
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
    EducacaoFacebook object = (EducacaoFacebook)obj;
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
