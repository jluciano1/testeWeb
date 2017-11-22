package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela EXPERIENCIALINKEDIN
 * @generated
 */
@Entity
@Table(name = "\"EXPERIENCIALINKEDIN\"")
@XmlRootElement
public class ExperienciaLinkedIn implements Serializable {

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
  @Column(name = "local", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String local;
  
  /**
  * @generated
  */
  @Column(name = "cargo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cargo;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "periodo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date periodo;
  
  /**
  * @generated
  */
  @Column(name = "cidade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cidade;
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String descricao;
  
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
  public ExperienciaLinkedIn(){
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
  public ExperienciaLinkedIn setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém local
   * return local
   * @generated
   */
  public java.lang.String getLocal(){
    return this.local;
  }
  
  /**
   * Define local
   * @param local local
   * @generated
   */
  public ExperienciaLinkedIn setLocal(java.lang.String local){
    this.local = local;
    return this;
  }
  
  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  public java.lang.String getCargo(){
    return this.cargo;
  }
  
  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public ExperienciaLinkedIn setCargo(java.lang.String cargo){
    this.cargo = cargo;
    return this;
  }
  
  /**
   * Obtém periodo
   * return periodo
   * @generated
   */
  public java.util.Date getPeriodo(){
    return this.periodo;
  }
  
  /**
   * Define periodo
   * @param periodo periodo
   * @generated
   */
  public ExperienciaLinkedIn setPeriodo(java.util.Date periodo){
    this.periodo = periodo;
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
  public ExperienciaLinkedIn setCidade(java.lang.String cidade){
    this.cidade = cidade;
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
  public ExperienciaLinkedIn setDescricao(java.lang.String descricao){
    this.descricao = descricao;
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
  public ExperienciaLinkedIn setDadoPessoalLinkedIn(DadoPessoalLinkedIn dadoPessoalLinkedIn){
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
    ExperienciaLinkedIn object = (ExperienciaLinkedIn)obj;
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
