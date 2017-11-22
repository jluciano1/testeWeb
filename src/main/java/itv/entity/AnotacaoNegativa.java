package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ANOTACAONEGATIVA
 * @generated
 */
@Entity
@Table(name = "\"ANOTACAONEGATIVA\"")
@XmlRootElement
public class AnotacaoNegativa implements Serializable {

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
  @Column(name = "id", nullable = true, insertable=true, updatable=true)
  private java.lang.Integer id;
  
  /**
  * @generated
  */
  @Column(name = "pendenciaComercial", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer pendenciaComercial;
  
  /**
  * @generated
  */
  @Column(name = "pendenciaBancaria", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer pendenciaBancaria;
  
  /**
  * @generated
  */
  @Column(name = "chequeSemFundo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer chequeSemFundo;
  
  /**
  * @generated
  */
  @Column(name = "protesto", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer protesto;
  
  /**
  * @generated
  */
  @Column(name = "acaoJudicial", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer acaoJudicial;
  
  /**
  * @generated
  */
  @Column(name = "participacaoFalencia", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer participacaoFalencia;
  
  /**
  * @generated
  */
  @Column(name = "dividaVencida", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer dividaVencida;
  
  /**
  * @generated
  */
  @Column(name = "falencia", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer falencia;
  
  /**
  * @generated
  */
  @Column(name = "pendenciaInterna", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer pendenciaInterna;
  
  /**
   * Construtor
   * @generated
   */
  public AnotacaoNegativa(){
  }

  
  /**
   * Obtém pendenciaComercial
   * return pendenciaComercial
   * @generated
   */
  public java.lang.Integer getPendenciaComercial(){
    return this.pendenciaComercial;
  }
  
  /**
   * Define pendenciaComercial
   * @param pendenciaComercial pendenciaComercial
   * @generated
   */
  public AnotacaoNegativa setPendenciaComercial(java.lang.Integer pendenciaComercial){
    this.pendenciaComercial = pendenciaComercial;
    return this;
  }
  
  /**
   * Obtém pendenciaBancaria
   * return pendenciaBancaria
   * @generated
   */
  public java.lang.Integer getPendenciaBancaria(){
    return this.pendenciaBancaria;
  }
  
  /**
   * Define pendenciaBancaria
   * @param pendenciaBancaria pendenciaBancaria
   * @generated
   */
  public AnotacaoNegativa setPendenciaBancaria(java.lang.Integer pendenciaBancaria){
    this.pendenciaBancaria = pendenciaBancaria;
    return this;
  }
  
  /**
   * Obtém chequeSemFundo
   * return chequeSemFundo
   * @generated
   */
  public java.lang.Integer getChequeSemFundo(){
    return this.chequeSemFundo;
  }
  
  /**
   * Define chequeSemFundo
   * @param chequeSemFundo chequeSemFundo
   * @generated
   */
  public AnotacaoNegativa setChequeSemFundo(java.lang.Integer chequeSemFundo){
    this.chequeSemFundo = chequeSemFundo;
    return this;
  }
  
  /**
   * Obtém protesto
   * return protesto
   * @generated
   */
  public java.lang.Integer getProtesto(){
    return this.protesto;
  }
  
  /**
   * Define protesto
   * @param protesto protesto
   * @generated
   */
  public AnotacaoNegativa setProtesto(java.lang.Integer protesto){
    this.protesto = protesto;
    return this;
  }
  
  /**
   * Obtém acaoJudicial
   * return acaoJudicial
   * @generated
   */
  public java.lang.Integer getAcaoJudicial(){
    return this.acaoJudicial;
  }
  
  /**
   * Define acaoJudicial
   * @param acaoJudicial acaoJudicial
   * @generated
   */
  public AnotacaoNegativa setAcaoJudicial(java.lang.Integer acaoJudicial){
    this.acaoJudicial = acaoJudicial;
    return this;
  }
  
  /**
   * Obtém participacaoFalencia
   * return participacaoFalencia
   * @generated
   */
  public java.lang.Integer getParticipacaoFalencia(){
    return this.participacaoFalencia;
  }
  
  /**
   * Define participacaoFalencia
   * @param participacaoFalencia participacaoFalencia
   * @generated
   */
  public AnotacaoNegativa setParticipacaoFalencia(java.lang.Integer participacaoFalencia){
    this.participacaoFalencia = participacaoFalencia;
    return this;
  }
  
  /**
   * Obtém dividaVencida
   * return dividaVencida
   * @generated
   */
  public java.lang.Integer getDividaVencida(){
    return this.dividaVencida;
  }
  
  /**
   * Define dividaVencida
   * @param dividaVencida dividaVencida
   * @generated
   */
  public AnotacaoNegativa setDividaVencida(java.lang.Integer dividaVencida){
    this.dividaVencida = dividaVencida;
    return this;
  }
  
  /**
   * Obtém falencia
   * return falencia
   * @generated
   */
  public java.lang.Integer getFalencia(){
    return this.falencia;
  }
  
  /**
   * Define falencia
   * @param falencia falencia
   * @generated
   */
  public AnotacaoNegativa setFalencia(java.lang.Integer falencia){
    this.falencia = falencia;
    return this;
  }
  
  /**
   * Obtém pendenciaInterna
   * return pendenciaInterna
   * @generated
   */
  public java.lang.Integer getPendenciaInterna(){
    return this.pendenciaInterna;
  }
  
  /**
   * Define pendenciaInterna
   * @param pendenciaInterna pendenciaInterna
   * @generated
   */
  public AnotacaoNegativa setPendenciaInterna(java.lang.Integer pendenciaInterna){
    this.pendenciaInterna = pendenciaInterna;
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
  public AnotacaoNegativa setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AnotacaoNegativa object = (AnotacaoNegativa)obj;
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
