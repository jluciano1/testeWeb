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
@Repository("DadoPessoalFacebookDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface DadoPessoalFacebookDAO extends JpaRepository<DadoPessoalFacebook, java.lang.Integer> {

  /**
   * Obtém a instância de DadoPessoalFacebook utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM DadoPessoalFacebook entity WHERE entity.id = :id")
  public DadoPessoalFacebook findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de DadoPessoalFacebook utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM DadoPessoalFacebook entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from DadoPessoalFacebook c")
  public Page<DadoPessoalFacebook> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM EducacaoFacebook entity WHERE entity.dadoPessoalFacebook.id = :id")
  public Page<EducacaoFacebook> findEducacaoFacebook(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TrabalhoFacebook entity WHERE entity.dadoPessoalFacebook.id = :id")
  public Page<TrabalhoFacebook> findTrabalhoFacebook(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM MembroFamiliaFacebook entity WHERE entity.dadoPessoalFacebook.id = :id")
  public Page<MembroFamiliaFacebook> findMembroFamiliaFacebook(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AcontecimentoFacebook entity WHERE entity.dadoPessoalFacebook.id = :id")
  public Page<AcontecimentoFacebook> findAcontecimentoFacebook(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
