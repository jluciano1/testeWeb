package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela DADOPESSOALSERASA
 * @generated
 */
@Entity
@Table(name = "\"DADOPESSOALSERASA\"")
@XmlRootElement
public class DadoPessoalSerasa implements Serializable {

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
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cpf;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dtNascimento;
  
  /**
  * @generated
  */
  @Column(name = "nomeMae", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeMae;
  
  /**
  * @generated
  */
  @Column(name = "statusCpf", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String statusCpf;
  
  /**
  * @generated
  */
  @Column(name = "serasaScore", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String serasaScore;
  
  /**
  * @generated
  */
  @Column(name = "estadoCivil", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String estadoCivil;
  
  /**
  * @generated
  */
  @Column(name = "sexo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String sexo;
  
  /**
  * @generated
  */
  @Column(name = "signo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String signo;
  
  /**
  * @generated
  */
  @Column(name = "ratingPessoal", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ratingPessoal;
  
  /**
  * @generated
  */
  @Column(name = "ratingNegocio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ratingNegocio;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_anotacaoNegativa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private AnotacaoNegativa anotacaoNegativa;
  
  /**
   * Construtor
   * @generated
   */
  public DadoPessoalSerasa(){
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
  public DadoPessoalSerasa setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  public java.lang.String getCpf(){
    return this.cpf;
  }
  
  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public DadoPessoalSerasa setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }
  
  /**
   * Obtém dtNascimento
   * return dtNascimento
   * @generated
   */
  public java.util.Date getDtNascimento(){
    return this.dtNascimento;
  }
  
  /**
   * Define dtNascimento
   * @param dtNascimento dtNascimento
   * @generated
   */
  public DadoPessoalSerasa setDtNascimento(java.util.Date dtNascimento){
    this.dtNascimento = dtNascimento;
    return this;
  }
  
  /**
   * Obtém nomeMae
   * return nomeMae
   * @generated
   */
  public java.lang.String getNomeMae(){
    return this.nomeMae;
  }
  
  /**
   * Define nomeMae
   * @param nomeMae nomeMae
   * @generated
   */
  public DadoPessoalSerasa setNomeMae(java.lang.String nomeMae){
    this.nomeMae = nomeMae;
    return this;
  }
  
  /**
   * Obtém statusCpf
   * return statusCpf
   * @generated
   */
  public java.lang.String getStatusCpf(){
    return this.statusCpf;
  }
  
  /**
   * Define statusCpf
   * @param statusCpf statusCpf
   * @generated
   */
  public DadoPessoalSerasa setStatusCpf(java.lang.String statusCpf){
    this.statusCpf = statusCpf;
    return this;
  }
  
  /**
   * Obtém serasaScore
   * return serasaScore
   * @generated
   */
  public java.lang.String getSerasaScore(){
    return this.serasaScore;
  }
  
  /**
   * Define serasaScore
   * @param serasaScore serasaScore
   * @generated
   */
  public DadoPessoalSerasa setSerasaScore(java.lang.String serasaScore){
    this.serasaScore = serasaScore;
    return this;
  }
  
  /**
   * Obtém estadoCivil
   * return estadoCivil
   * @generated
   */
  public java.lang.String getEstadoCivil(){
    return this.estadoCivil;
  }
  
  /**
   * Define estadoCivil
   * @param estadoCivil estadoCivil
   * @generated
   */
  public DadoPessoalSerasa setEstadoCivil(java.lang.String estadoCivil){
    this.estadoCivil = estadoCivil;
    return this;
  }
  
  /**
   * Obtém sexo
   * return sexo
   * @generated
   */
  public java.lang.String getSexo(){
    return this.sexo;
  }
  
  /**
   * Define sexo
   * @param sexo sexo
   * @generated
   */
  public DadoPessoalSerasa setSexo(java.lang.String sexo){
    this.sexo = sexo;
    return this;
  }
  
  /**
   * Obtém signo
   * return signo
   * @generated
   */
  public java.lang.String getSigno(){
    return this.signo;
  }
  
  /**
   * Define signo
   * @param signo signo
   * @generated
   */
  public DadoPessoalSerasa setSigno(java.lang.String signo){
    this.signo = signo;
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
  public DadoPessoalSerasa setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém ratingPessoal
   * return ratingPessoal
   * @generated
   */
  public java.lang.String getRatingPessoal(){
    return this.ratingPessoal;
  }
  
  /**
   * Define ratingPessoal
   * @param ratingPessoal ratingPessoal
   * @generated
   */
  public DadoPessoalSerasa setRatingPessoal(java.lang.String ratingPessoal){
    this.ratingPessoal = ratingPessoal;
    return this;
  }
  
  /**
   * Obtém ratingNegocio
   * return ratingNegocio
   * @generated
   */
  public java.lang.String getRatingNegocio(){
    return this.ratingNegocio;
  }
  
  /**
   * Define ratingNegocio
   * @param ratingNegocio ratingNegocio
   * @generated
   */
  public DadoPessoalSerasa setRatingNegocio(java.lang.String ratingNegocio){
    this.ratingNegocio = ratingNegocio;
    return this;
  }
  
  /**
   * Obtém anotacaoNegativa
   * return anotacaoNegativa
   * @generated
   */
  public AnotacaoNegativa getAnotacaoNegativa(){
    return this.anotacaoNegativa;
  }
  
  /**
   * Define anotacaoNegativa
   * @param anotacaoNegativa anotacaoNegativa
   * @generated
   */
  public DadoPessoalSerasa setAnotacaoNegativa(AnotacaoNegativa anotacaoNegativa){
    this.anotacaoNegativa = anotacaoNegativa;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    DadoPessoalSerasa object = (DadoPessoalSerasa)obj;
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
