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
@Repository("InteresseLinkedInDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface InteresseLinkedInDAO extends JpaRepository<InteresseLinkedIn, java.lang.Integer> {

  /**
   * Obtém a instância de InteresseLinkedIn utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM InteresseLinkedIn entity WHERE entity.id = :id")
  public InteresseLinkedIn findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de InteresseLinkedIn utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM InteresseLinkedIn entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from InteresseLinkedIn c")
  public Page<InteresseLinkedIn> list(Pageable pageable);
  


  /**
   * Foreign Key dadoPessoalLinkedIn
   * @generated
   */
  @Query("SELECT entity FROM InteresseLinkedIn entity WHERE entity.dadoPessoalLinkedIn.id = :id")
  public Page<InteresseLinkedIn> findInteresseLinkedInsByDadoPessoalLinkedIn(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
