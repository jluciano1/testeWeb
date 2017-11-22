package itv.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela DADOVIZINHO
 * @generated
 */
@Entity
@Table(name = "\"DADOVIZINHO\"")
@XmlRootElement
public class DadoVizinho implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_enderecoPeloSerasa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private EnderecoPeloSerasa enderecoPeloSerasa;
  
  /**
   * Construtor
   * @generated
   */
  public DadoVizinho(){
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
  public DadoVizinho setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém enderecoPeloSerasa
   * return enderecoPeloSerasa
   * @generated
   */
  public EnderecoPeloSerasa getEnderecoPeloSerasa(){
    return this.enderecoPeloSerasa;
  }
  
  /**
   * Define enderecoPeloSerasa
   * @param enderecoPeloSerasa enderecoPeloSerasa
   * @generated
   */
  public DadoVizinho setEnderecoPeloSerasa(EnderecoPeloSerasa enderecoPeloSerasa){
    this.enderecoPeloSerasa = enderecoPeloSerasa;
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
  public DadoVizinho setId(java.lang.Integer id){
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
    DadoVizinho object = (DadoVizinho)obj;
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
