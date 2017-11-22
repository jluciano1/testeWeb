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
@Repository("AnotacaoNegativaDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface AnotacaoNegativaDAO extends JpaRepository<AnotacaoNegativa, java.lang.Integer> {

  /**
   * Obtém a instância de AnotacaoNegativa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM AnotacaoNegativa entity WHERE entity.id = :id")
  public AnotacaoNegativa findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de AnotacaoNegativa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM AnotacaoNegativa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from AnotacaoNegativa c")
  public Page<AnotacaoNegativa> list(Pageable pageable);
  


}
