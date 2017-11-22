package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ENDERECOPELOSERASA
 * @generated
 */
@Entity
@Table(name = "\"ENDERECOPELOSERASA\"")
@XmlRootElement
public class EnderecoPeloSerasa implements Serializable {

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
  @Column(name = "logradouro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String logradouro;
  
  /**
  * @generated
  */
  @Column(name = "complemento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String complemento;
  
  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer numero;
  
  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String bairro;
  
  /**
  * @generated
  */
  @Column(name = "cidade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cidade;
  
  /**
  * @generated
  */
  @Column(name = "uf", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String uf;
  
  /**
  * @generated
  */
  @Column(name = "tipoEndereco", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipoEndereco;
  
  /**
  * @generated
  */
  @Column(name = "dadoVizinho", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String dadoVizinho;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_dadoPessoalSerasa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private DadoPessoalSerasa dadoPessoalSerasa;
  
  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cep;
  
  /**
   * Construtor
   * @generated
   */
  public EnderecoPeloSerasa(){
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
  public EnderecoPeloSerasa setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém logradouro
   * return logradouro
   * @generated
   */
  public java.lang.String getLogradouro(){
    return this.logradouro;
  }
  
  /**
   * Define logradouro
   * @param logradouro logradouro
   * @generated
   */
  public EnderecoPeloSerasa setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }
  
  /**
   * Obtém complemento
   * return complemento
   * @generated
   */
  public java.lang.String getComplemento(){
    return this.complemento;
  }
  
  /**
   * Define complemento
   * @param complemento complemento
   * @generated
   */
  public EnderecoPeloSerasa setComplemento(java.lang.String complemento){
    this.complemento = complemento;
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
  public EnderecoPeloSerasa setNumero(java.lang.Integer numero){
    this.numero = numero;
    return this;
  }
  
  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  public java.lang.String getBairro(){
    return this.bairro;
  }
  
  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public EnderecoPeloSerasa setBairro(java.lang.String bairro){
    this.bairro = bairro;
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
  public EnderecoPeloSerasa setCidade(java.lang.String cidade){
    this.cidade = cidade;
    return this;
  }
  
  /**
   * Obtém uf
   * return uf
   * @generated
   */
  public java.lang.String getUf(){
    return this.uf;
  }
  
  /**
   * Define uf
   * @param uf uf
   * @generated
   */
  public EnderecoPeloSerasa setUf(java.lang.String uf){
    this.uf = uf;
    return this;
  }
  
  /**
   * Obtém tipoEndereco
   * return tipoEndereco
   * @generated
   */
  public java.lang.String getTipoEndereco(){
    return this.tipoEndereco;
  }
  
  /**
   * Define tipoEndereco
   * @param tipoEndereco tipoEndereco
   * @generated
   */
  public EnderecoPeloSerasa setTipoEndereco(java.lang.String tipoEndereco){
    this.tipoEndereco = tipoEndereco;
    return this;
  }
  
  /**
   * Obtém dadoVizinho
   * return dadoVizinho
   * @generated
   */
  public java.lang.String getDadoVizinho(){
    return this.dadoVizinho;
  }
  
  /**
   * Define dadoVizinho
   * @param dadoVizinho dadoVizinho
   * @generated
   */
  public EnderecoPeloSerasa setDadoVizinho(java.lang.String dadoVizinho){
    this.dadoVizinho = dadoVizinho;
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
  public EnderecoPeloSerasa setDadoPessoalSerasa(DadoPessoalSerasa dadoPessoalSerasa){
    this.dadoPessoalSerasa = dadoPessoalSerasa;
    return this;
  }
  
  /**
   * Obtém cep
   * return cep
   * @generated
   */
  public java.lang.String getCep(){
    return this.cep;
  }
  
  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public EnderecoPeloSerasa setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    EnderecoPeloSerasa object = (EnderecoPeloSerasa)obj;
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
