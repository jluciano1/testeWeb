package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TELEFONEPELOSERASA
 * @generated
 */
@Entity
@Table(name = "\"TELEFONEPELOSERASA\"")
@XmlRootElement
public class TelefonePeloSerasa implements Serializable {

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
  @Column(name = "ddi", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer ddi;
  
  /**
  * @generated
  */
  @Column(name = "ddd", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer ddd;
  
  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer numero;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_dadoPessoalSerasa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalSerasa dadoPessoalSerasa;
  
  /**
   * Construtor
   * @generated
   */
  public TelefonePeloSerasa(){
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
  public TelefonePeloSerasa setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém ddi
   * return ddi
   * @generated
   */
  public java.lang.Integer getDdi(){
    return this.ddi;
  }
  
  /**
   * Define ddi
   * @param ddi ddi
   * @generated
   */
  public TelefonePeloSerasa setDdi(java.lang.Integer ddi){
    this.ddi = ddi;
    return this;
  }
  
  /**
   * Obtém ddd
   * return ddd
   * @generated
   */
  public java.lang.Integer getDdd(){
    return this.ddd;
  }
  
  /**
   * Define ddd
   * @param ddd ddd
   * @generated
   */
  public TelefonePeloSerasa setDdd(java.lang.Integer ddd){
    this.ddd = ddd;
    return this;
  }
  
  /**
   * Obtém numero
   * return numero
   * @generated
   */
  public java.lang.Integer getNumero(){
    return this.numero;
  }
  
  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public TelefonePeloSerasa setNumero(java.lang.Integer numero){
    this.numero = numero;
    return this;
  }
  
  /**
   * Obtém dadoPessoalSerasa
   * return dadoPessoalSerasa
   * @generated
   */
  public DadoPessoalSerasa getDadoPessoalSerasa(){
    return this.dadoPessoalSerasa;
  }
  
  /**
   * Define dadoPessoalSerasa
   * @param dadoPessoalSerasa dadoPessoalSerasa
   * @generated
   */
  public TelefonePeloSerasa setDadoPessoalSerasa(DadoPessoalSerasa dadoPessoalSerasa){
    this.dadoPessoalSerasa = dadoPessoalSerasa;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TelefonePeloSerasa object = (TelefonePeloSerasa)obj;
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
