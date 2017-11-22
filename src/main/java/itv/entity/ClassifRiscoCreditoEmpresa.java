package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CLASSIFRISCOCREDITOEMPRESA
 * @generated
 */
@Entity
@Table(name = "\"CLASSIFRISCOCREDITOEMPRESA\"")
@XmlRootElement
public class ClassifRiscoCreditoEmpresa implements Serializable {

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
  @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cnpj;
  
  /**
  * @generated
  */
  @Column(name = "razaoSocial", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String razaoSocial;
  
  /**
  * @generated
  */
  @Column(name = "serasaScoreEmpresa", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String serasaScoreEmpresa;
  
  /**
   * Construtor
   * @generated
   */
  public ClassifRiscoCreditoEmpresa(){
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
  public ClassifRiscoCreditoEmpresa setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém cnpj
   * return cnpj
   * @generated
   */
  public java.lang.String getCnpj(){
    return this.cnpj;
  }
  
  /**
   * Define cnpj
   * @param cnpj cnpj
   * @generated
   */
  public ClassifRiscoCreditoEmpresa setCnpj(java.lang.String cnpj){
    this.cnpj = cnpj;
    return this;
  }
  
  /**
   * Obtém razaoSocial
   * return razaoSocial
   * @generated
   */
  public java.lang.String getRazaoSocial(){
    return this.razaoSocial;
  }
  
  /**
   * Define razaoSocial
   * @param razaoSocial razaoSocial
   * @generated
   */
  public ClassifRiscoCreditoEmpresa setRazaoSocial(java.lang.String razaoSocial){
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  /**
   * Obtém serasaScoreEmpresa
   * return serasaScoreEmpresa
   * @generated
   */
  public java.lang.String getSerasaScoreEmpresa(){
    return this.serasaScoreEmpresa;
  }
  
  /**
   * Define serasaScoreEmpresa
   * @param serasaScoreEmpresa serasaScoreEmpresa
   * @generated
   */
  public ClassifRiscoCreditoEmpresa setSerasaScoreEmpresa(java.lang.String serasaScoreEmpresa){
    this.serasaScoreEmpresa = serasaScoreEmpresa;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ClassifRiscoCreditoEmpresa object = (ClassifRiscoCreditoEmpresa)obj;
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
