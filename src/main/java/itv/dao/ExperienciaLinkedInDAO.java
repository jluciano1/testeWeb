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
@Repository("ExperienciaLinkedInDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface ExperienciaLinkedInDAO extends JpaRepository<ExperienciaLinkedIn, java.lang.Integer> {

  /**
   * Obtém a instância de ExperienciaLinkedIn utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ExperienciaLinkedIn entity WHERE entity.id = :id")
  public ExperienciaLinkedIn findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de ExperienciaLinkedIn utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ExperienciaLinkedIn entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ExperienciaLinkedIn c")
  public Page<ExperienciaLinkedIn> list(Pageable pageable);
  


  /**
   * Foreign Key dadoPessoalLinkedIn
   * @generated
   */
  @Query("SELECT entity FROM ExperienciaLinkedIn entity WHERE entity.dadoPessoalLinkedIn.id = :id")
  public Page<ExperienciaLinkedIn> findExperienciaLinkedInsByDadoPessoalLinkedIn(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
