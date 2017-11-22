package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TRABALHOFACEBOOK
 * @generated
 */
@Entity
@Table(name = "\"TRABALHOFACEBOOK\"")
@XmlRootElement
public class TrabalhoFacebook implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_dadoPessoalFacebook", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalFacebook dadoPessoalFacebook;
  
  /**
   * Construtor
   * @generated
   */
  public TrabalhoFacebook(){
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
  public TrabalhoFacebook setId(java.lang.Integer id){
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
  public TrabalhoFacebook setLocal(java.lang.String local){
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
  public TrabalhoFacebook setCargo(java.lang.String cargo){
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
  public TrabalhoFacebook setPeriodo(java.util.Date periodo){
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
  public TrabalhoFacebook setCidade(java.lang.String cidade){
    this.cidade = cidade;
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
  public TrabalhoFacebook setDadoPessoalFacebook(DadoPessoalFacebook dadoPessoalFacebook){
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
    TrabalhoFacebook object = (TrabalhoFacebook)obj;
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
