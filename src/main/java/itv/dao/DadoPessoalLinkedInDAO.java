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
@Repository("DadoPessoalLinkedInDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface DadoPessoalLinkedInDAO extends JpaRepository<DadoPessoalLinkedIn, java.lang.Integer> {

  /**
   * Obtém a instância de DadoPessoalLinkedIn utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM DadoPessoalLinkedIn entity WHERE entity.id = :id")
  public DadoPessoalLinkedIn findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de DadoPessoalLinkedIn utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM DadoPessoalLinkedIn entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from DadoPessoalLinkedIn c")
  public Page<DadoPessoalLinkedIn> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM InteresseLinkedIn entity WHERE entity.dadoPessoalLinkedIn.id = :id")
  public Page<InteresseLinkedIn> findInteresseLinkedIn(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM FormacaoAcademicaLinkedIn entity WHERE entity.dadoPessoalLinkedIn.id = :id")
  public Page<FormacaoAcademicaLinkedIn> findFormacaoAcademicaLinkedIn(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ExperienciaLinkedIn entity WHERE entity.dadoPessoalLinkedIn.id = :id")
  public Page<ExperienciaLinkedIn> findExperienciaLinkedIn(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
