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
@Repository("EducacaoFacebookDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface EducacaoFacebookDAO extends JpaRepository<EducacaoFacebook, java.lang.Integer> {

  /**
   * Obtém a instância de EducacaoFacebook utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM EducacaoFacebook entity WHERE entity.id = :id")
  public EducacaoFacebook findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de EducacaoFacebook utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM EducacaoFacebook entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from EducacaoFacebook c")
  public Page<EducacaoFacebook> list(Pageable pageable);
  


  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  @Query("SELECT entity FROM EducacaoFacebook entity WHERE entity.dadoPessoalFacebook.id = :id")
  public Page<EducacaoFacebook> findEducacaoFacebooksByDadoPessoalFacebook(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
