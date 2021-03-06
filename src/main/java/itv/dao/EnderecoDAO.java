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
@Repository("EnderecoDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface EnderecoDAO extends JpaRepository<Endereco, java.lang.Integer> {

  /**
   * Obtém a instância de Endereco utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Endereco entity WHERE entity.id = :id")
  public Endereco findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de Endereco utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Endereco entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Endereco c")
  public Page<Endereco> list(Pageable pageable);
  


  /**
   * Foreign Key pessoa
   * @generated
   */
  @Query("SELECT entity FROM Endereco entity WHERE entity.pessoa.id = :id")
  public Page<Endereco> findEnderecosByPessoa(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
