package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela DADOPESSOALFACEBOOK
 * @generated
 */
@Entity
@Table(name = "\"DADOPESSOALFACEBOOK\"")
@XmlRootElement
public class DadoPessoalFacebook implements Serializable {

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
  @Column(name = "urlId", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String urlId;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dtNascimento;
  
  /**
  * @generated
  */
  @Column(name = "cidadeAtual", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cidadeAtual;
  
  /**
  * @generated
  */
  @Column(name = "cidadeNatal", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cidadeNatal;
  
  /**
  * @generated
  */
  @Column(name = "relacionamento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String relacionamento;
  
  /**
  * @generated
  */
  @Column(name = "casadoCom", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String casadoCom;
  
  /**
  * @generated
  */
  @Column(name = "genero", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String genero;
  
  /**
  * @generated
  */
  @Column(name = "idioma", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String idioma;
  
  /**
  * @generated
  */
  @Column(name = "quantAmigo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer quantAmigo;
  
  /**
   * Construtor
   * @generated
   */
  public DadoPessoalFacebook(){
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
  public DadoPessoalFacebook setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém urlId
   * return urlId
   * @generated
   */
  public java.lang.String getUrlId(){
    return this.urlId;
  }
  
  /**
   * Define urlId
   * @param urlId urlId
   * @generated
   */
  public DadoPessoalFacebook setUrlId(java.lang.String urlId){
    this.urlId = urlId;
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
  public DadoPessoalFacebook setNome(java.lang.String nome){
    this.nome = nome;
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
  public DadoPessoalFacebook setDtNascimento(java.util.Date dtNascimento){
    this.dtNascimento = dtNascimento;
    return this;
  }
  
  /**
   * Obtém cidadeAtual
   * return cidadeAtual
   * @generated
   */
  public java.lang.String getCidadeAtual(){
    return this.cidadeAtual;
  }
  
  /**
   * Define cidadeAtual
   * @param cidadeAtual cidadeAtual
   * @generated
   */
  public DadoPessoalFacebook setCidadeAtual(java.lang.String cidadeAtual){
    this.cidadeAtual = cidadeAtual;
    return this;
  }
  
  /**
   * Obtém cidadeNatal
   * return cidadeNatal
   * @generated
   */
  public java.lang.String getCidadeNatal(){
    return this.cidadeNatal;
  }
  
  /**
   * Define cidadeNatal
   * @param cidadeNatal cidadeNatal
   * @generated
   */
  public DadoPessoalFacebook setCidadeNatal(java.lang.String cidadeNatal){
    this.cidadeNatal = cidadeNatal;
    return this;
  }
  
  /**
   * Obtém relacionamento
   * return relacionamento
   * @generated
   */
  public java.lang.String getRelacionamento(){
    return this.relacionamento;
  }
  
  /**
   * Define relacionamento
   * @param relacionamento relacionamento
   * @generated
   */
  public DadoPessoalFacebook setRelacionamento(java.lang.String relacionamento){
    this.relacionamento = relacionamento;
    return this;
  }
  
  /**
   * Obtém casadoCom
   * return casadoCom
   * @generated
   */
  public java.lang.String getCasadoCom(){
    return this.casadoCom;
  }
  
  /**
   * Define casadoCom
   * @param casadoCom casadoCom
   * @generated
   */
  public DadoPessoalFacebook setCasadoCom(java.lang.String casadoCom){
    this.casadoCom = casadoCom;
    return this;
  }
  
  /**
   * Obtém genero
   * return genero
   * @generated
   */
  public java.lang.String getGenero(){
    return this.genero;
  }
  
  /**
   * Define genero
   * @param genero genero
   * @generated
   */
  public DadoPessoalFacebook setGenero(java.lang.String genero){
    this.genero = genero;
    return this;
  }
  
  /**
   * Obtém idioma
   * return idioma
   * @generated
   */
  public java.lang.String getIdioma(){
    return this.idioma;
  }
  
  /**
   * Define idioma
   * @param idioma idioma
   * @generated
   */
  public DadoPessoalFacebook setIdioma(java.lang.String idioma){
    this.idioma = idioma;
    return this;
  }
  
  /**
   * Obtém quantAmigo
   * return quantAmigo
   * @generated
   */
  public java.lang.Integer getQuantAmigo(){
    return this.quantAmigo;
  }
  
  /**
   * Define quantAmigo
   * @param quantAmigo quantAmigo
   * @generated
   */
  public DadoPessoalFacebook setQuantAmigo(java.lang.Integer quantAmigo){
    this.quantAmigo = quantAmigo;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    DadoPessoalFacebook object = (DadoPessoalFacebook)obj;
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
