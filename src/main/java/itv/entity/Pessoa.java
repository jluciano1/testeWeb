package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PESSOA
 * @generated
 */
@Entity
@Table(name = "\"PESSOA\"")
@XmlRootElement
public class Pessoa implements Serializable {

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
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String email;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtCadastro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dtCadastro;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dtNascimento;
  
  /**
  * @generated
  */
  @Column(name = "cadastrante", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cadastrante;
  
  /**
  * @generated
  */
  @Column(name = "alteradoPor", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String alteradoPor;
  
  /**
  * @generated
  */
  @Column(name = "contato1", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String contato1;
  
  /**
  * @generated
  */
  @Column(name = "contato2", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String contato2;
  
  /**
  * @generated
  */
  @Column(name = "preferencialGoiania", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String preferencialGoiania;
  
  /**
  * @generated
  */
  @Column(name = "substitutoTrib", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String substitutoTrib;
  
  /**
  * @generated
  */
  @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String status;
  
  /**
  * @generated
  */
  @Column(name = "internoExterno", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String internoExterno;
  
  /**
  * @generated
  */
  @Column(name = "natureza", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String natureza;
  
  /**
  * @generated
  */
  @Column(name = "tipoPessoa", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipoCliente;
  
  /**
  * @generated
  */
  @Column(name = "nomeFantasia", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeFantasia;
  
  /**
  * @generated
  */
  @Column(name = "inscrEstadual", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String inscrEstadual;
  
  /**
  * @generated
  */
  @Column(name = "inscrMunicial", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String inscrMunicial;
  
  /**
  * @generated
  */
  @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cnpj;
  
  /**
  * @generated
  */
  @Column(name = "dtAlteracao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String dtAlteracao;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_dadoPessoalSerasa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalSerasa dadoPessoalSerasa;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_dadoPessoalLinkedIn", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalLinkedIn dadoPessoalLinkedIn;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_dadoPessoalFacebook", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalFacebook dadoPessoalFacebook;
  
  /**
  * @generated
  */
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo;
  
  /**
   * Construtor
   * @generated
   */
  public Pessoa(){
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
  public Pessoa setId(java.lang.Integer id){
    this.id = id;
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
  public Pessoa setNome(java.lang.String nome){
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
  public Pessoa setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }
  
  /**
   * Obtém email
   * return email
   * @generated
   */
  public java.lang.String getEmail(){
    return this.email;
  }
  
  /**
   * Define email
   * @param email email
   * @generated
   */
  public Pessoa setEmail(java.lang.String email){
    this.email = email;
    return this;
  }
  
  /**
   * Obtém dtCadastro
   * return dtCadastro
   * @generated
   */
  public java.util.Date getDtCadastro(){
    return this.dtCadastro;
  }
  
  /**
   * Define dtCadastro
   * @param dtCadastro dtCadastro
   * @generated
   */
  public Pessoa setDtCadastro(java.util.Date dtCadastro){
    this.dtCadastro = dtCadastro;
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
  public Pessoa setDtNascimento(java.util.Date dtNascimento){
    this.dtNascimento = dtNascimento;
    return this;
  }
  
  /**
   * Obtém cadastrante
   * return cadastrante
   * @generated
   */
  public java.lang.String getCadastrante(){
    return this.cadastrante;
  }
  
  /**
   * Define cadastrante
   * @param cadastrante cadastrante
   * @generated
   */
  public Pessoa setCadastrante(java.lang.String cadastrante){
    this.cadastrante = cadastrante;
    return this;
  }
  
  /**
   * Obtém alteradoPor
   * return alteradoPor
   * @generated
   */
  public java.lang.String getAlteradoPor(){
    return this.alteradoPor;
  }
  
  /**
   * Define alteradoPor
   * @param alteradoPor alteradoPor
   * @generated
   */
  public Pessoa setAlteradoPor(java.lang.String alteradoPor){
    this.alteradoPor = alteradoPor;
    return this;
  }
  
  /**
   * Obtém contato1
   * return contato1
   * @generated
   */
  public java.lang.String getContato1(){
    return this.contato1;
  }
  
  /**
   * Define contato1
   * @param contato1 contato1
   * @generated
   */
  public Pessoa setContato1(java.lang.String contato1){
    this.contato1 = contato1;
    return this;
  }
  
  /**
   * Obtém contato2
   * return contato2
   * @generated
   */
  public java.lang.String getContato2(){
    return this.contato2;
  }
  
  /**
   * Define contato2
   * @param contato2 contato2
   * @generated
   */
  public Pessoa setContato2(java.lang.String contato2){
    this.contato2 = contato2;
    return this;
  }
  
  /**
   * Obtém preferencialGoiania
   * return preferencialGoiania
   * @generated
   */
  public java.lang.String getPreferencialGoiania(){
    return this.preferencialGoiania;
  }
  
  /**
   * Define preferencialGoiania
   * @param preferencialGoiania preferencialGoiania
   * @generated
   */
  public Pessoa setPreferencialGoiania(java.lang.String preferencialGoiania){
    this.preferencialGoiania = preferencialGoiania;
    return this;
  }
  
  /**
   * Obtém substitutoTrib
   * return substitutoTrib
   * @generated
   */
  public java.lang.String getSubstitutoTrib(){
    return this.substitutoTrib;
  }
  
  /**
   * Define substitutoTrib
   * @param substitutoTrib substitutoTrib
   * @generated
   */
  public Pessoa setSubstitutoTrib(java.lang.String substitutoTrib){
    this.substitutoTrib = substitutoTrib;
    return this;
  }
  
  /**
   * Obtém status
   * return status
   * @generated
   */
  public java.lang.String getStatus(){
    return this.status;
  }
  
  /**
   * Define status
   * @param status status
   * @generated
   */
  public Pessoa setStatus(java.lang.String status){
    this.status = status;
    return this;
  }
  
  /**
   * Obtém internoExterno
   * return internoExterno
   * @generated
   */
  public java.lang.String getInternoExterno(){
    return this.internoExterno;
  }
  
  /**
   * Define internoExterno
   * @param internoExterno internoExterno
   * @generated
   */
  public Pessoa setInternoExterno(java.lang.String internoExterno){
    this.internoExterno = internoExterno;
    return this;
  }
  
  /**
   * Obtém natureza
   * return natureza
   * @generated
   */
  public java.lang.String getNatureza(){
    return this.natureza;
  }
  
  /**
   * Define natureza
   * @param natureza natureza
   * @generated
   */
  public Pessoa setNatureza(java.lang.String natureza){
    this.natureza = natureza;
    return this;
  }
  
  /**
   * Obtém tipoCliente
   * return tipoCliente
   * @generated
   */
  public java.lang.String getTipoCliente(){
    return this.tipoCliente;
  }
  
  /**
   * Define tipoCliente
   * @param tipoCliente tipoCliente
   * @generated
   */
  public Pessoa setTipoCliente(java.lang.String tipoCliente){
    this.tipoCliente = tipoCliente;
    return this;
  }
  
  /**
   * Obtém nomeFantasia
   * return nomeFantasia
   * @generated
   */
  public java.lang.String getNomeFantasia(){
    return this.nomeFantasia;
  }
  
  /**
   * Define nomeFantasia
   * @param nomeFantasia nomeFantasia
   * @generated
   */
  public Pessoa setNomeFantasia(java.lang.String nomeFantasia){
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  /**
   * Obtém inscrEstadual
   * return inscrEstadual
   * @generated
   */
  public java.lang.String getInscrEstadual(){
    return this.inscrEstadual;
  }
  
  /**
   * Define inscrEstadual
   * @param inscrEstadual inscrEstadual
   * @generated
   */
  public Pessoa setInscrEstadual(java.lang.String inscrEstadual){
    this.inscrEstadual = inscrEstadual;
    return this;
  }
  
  /**
   * Obtém inscrMunicial
   * return inscrMunicial
   * @generated
   */
  public java.lang.String getInscrMunicial(){
    return this.inscrMunicial;
  }
  
  /**
   * Define inscrMunicial
   * @param inscrMunicial inscrMunicial
   * @generated
   */
  public Pessoa setInscrMunicial(java.lang.String inscrMunicial){
    this.inscrMunicial = inscrMunicial;
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
  public Pessoa setCnpj(java.lang.String cnpj){
    this.cnpj = cnpj;
    return this;
  }
  
  /**
   * Obtém dtAlteracao
   * return dtAlteracao
   * @generated
   */
  public java.lang.String getDtAlteracao(){
    return this.dtAlteracao;
  }
  
  /**
   * Define dtAlteracao
   * @param dtAlteracao dtAlteracao
   * @generated
   */
  public Pessoa setDtAlteracao(java.lang.String dtAlteracao){
    this.dtAlteracao = dtAlteracao;
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
  public Pessoa setDadoPessoalSerasa(DadoPessoalSerasa dadoPessoalSerasa){
    this.dadoPessoalSerasa = dadoPessoalSerasa;
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
  public Pessoa setDadoPessoalLinkedIn(DadoPessoalLinkedIn dadoPessoalLinkedIn){
    this.dadoPessoalLinkedIn = dadoPessoalLinkedIn;
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
  public Pessoa setDadoPessoalFacebook(DadoPessoalFacebook dadoPessoalFacebook){
    this.dadoPessoalFacebook = dadoPessoalFacebook;
    return this;
  }
  
  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  public java.lang.String getTipo(){
    return this.tipo;
  }
  
  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public Pessoa setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pessoa object = (Pessoa)obj;
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
