package itv.dao;

import itv.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PessoaDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface PessoaDAO extends JpaRepository<Pessoa, java.lang.Integer> {

  /**
   * Obtém a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pessoa entity WHERE entity.id = :id")
  public Pessoa findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pessoa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Pessoa c")
  public Page<Pessoa> list(Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from Pessoa p where p.nome LIKE CONCAT('%', COALESCE(:nome, p.nome),'%')")
  public Page<Pessoa> listByNome(@Param(value="nome") java.lang.String nome, Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Endereco entity WHERE entity.pessoa.id = :id")
  public Page<Endereco> findEndereco(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
