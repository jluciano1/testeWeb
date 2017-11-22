package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PARTICIPACAOSOCIETARIA
 * @generated
 */
@Entity
@Table(name = "\"PARTICIPACAOSOCIETARIA\"")
@XmlRootElement
public class ParticipacaoSocietaria implements Serializable {

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
  @Column(name = "nomeEmpresa", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeEmpresa;
  
  /**
  * @generated
  */
  @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cnpj;
  
  /**
  * @generated
  */
  @Column(name = "participacaoEmpresa", nullable = true, unique = false, insertable=true, updatable=true)
  private float participacaoEmpresa;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtInicio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dtInicio;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtAtualizacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dtAtualizacao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_dadoPessoalSerasa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalSerasa dadoPessoalSerasa;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_classifRiscoCreditoEmpresa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private ClassifRiscoCreditoEmpresa classifRiscoCreditoEmpresa;
  
  /**
   * Construtor
   * @generated
   */
  public ParticipacaoSocietaria(){
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
  public ParticipacaoSocietaria setNomeEmpresa(java.lang.String nomeEmpresa){
    this.nomeEmpresa = nomeEmpresa;
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
  public ParticipacaoSocietaria setCnpj(java.lang.String cnpj){
    this.cnpj = cnpj;
    return this;
  }
  
  /**
   * Obtém participacaoEmpresa
   * return participacaoEmpresa
   * @generated
   */
  public float getParticipacaoEmpresa(){
    return this.participacaoEmpresa;
  }
  
  /**
   * Define participacaoEmpresa
   * @param participacaoEmpresa participacaoEmpresa
   * @generated
   */
  public ParticipacaoSocietaria setParticipacaoEmpresa(float participacaoEmpresa){
    this.participacaoEmpresa = participacaoEmpresa;
    return this;
  }
  
  /**
   * Obtém dtInicio
   * return dtInicio
   * @generated
   */
  public java.util.Date getDtInicio(){
    return this.dtInicio;
  }
  
  /**
   * Define dtInicio
   * @param dtInicio dtInicio
   * @generated
   */
  public ParticipacaoSocietaria setDtInicio(java.util.Date dtInicio){
    this.dtInicio = dtInicio;
    return this;
  }
  
  /**
   * Obtém dtAtualizacao
   * return dtAtualizacao
   * @generated
   */
  public java.util.Date getDtAtualizacao(){
    return this.dtAtualizacao;
  }
  
  /**
   * Define dtAtualizacao
   * @param dtAtualizacao dtAtualizacao
   * @generated
   */
  public ParticipacaoSocietaria setDtAtualizacao(java.util.Date dtAtualizacao){
    this.dtAtualizacao = dtAtualizacao;
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
  public ParticipacaoSocietaria setDadoPessoalSerasa(DadoPessoalSerasa dadoPessoalSerasa){
    this.dadoPessoalSerasa = dadoPessoalSerasa;
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
  public ParticipacaoSocietaria setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém classifRiscoCreditoEmpresa
   * return classifRiscoCreditoEmpresa
   * @generated
   */
  public ClassifRiscoCreditoEmpresa getClassifRiscoCreditoEmpresa(){
    return this.classifRiscoCreditoEmpresa;
  }
  
  /**
   * Define classifRiscoCreditoEmpresa
   * @param classifRiscoCreditoEmpresa classifRiscoCreditoEmpresa
   * @generated
   */
  public ParticipacaoSocietaria setClassifRiscoCreditoEmpresa(ClassifRiscoCreditoEmpresa classifRiscoCreditoEmpresa){
    this.classifRiscoCreditoEmpresa = classifRiscoCreditoEmpresa;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ParticipacaoSocietaria object = (ParticipacaoSocietaria)obj;
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
