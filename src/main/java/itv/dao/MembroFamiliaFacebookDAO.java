package itv.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import itv.entity.MembroFamiliaFacebook; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("MembroFamiliaFacebookDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface MembroFamiliaFacebookDAO extends JpaRepository<MembroFamiliaFacebook, java.lang.Integer> {

  /**
   * Obtém a instância de MembroFamiliaFacebook utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM MembroFamiliaFacebook entity WHERE entity.id = :id")
  public MembroFamiliaFacebook findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de MembroFamiliaFacebook utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM MembroFamiliaFacebook entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from MembroFamiliaFacebook c")
  public Page<MembroFamiliaFacebook> list(Pageable pageable);
  


  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  @Query("SELECT entity FROM MembroFamiliaFacebook entity WHERE entity.dadoPessoalFacebook.id = :id")
  public Page<MembroFamiliaFacebook> findMembroFamiliaFacebooksByDadoPessoalFacebook(@Param(value="id") java.lang.Integer id, Pageable pageable);

  @Query("SELECT entity FROM MembroFamiliaFacebook entity left join DadoPessoalFacebook dpf left join Pessoa p WHERE entity.dadoPessoalFacebook.id = dpf.id and dpf.id = p.dadoPessoalFacebook.id and p.id = :id")
  public Page<MembroFamiliaFacebook> findByPessoaId(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
