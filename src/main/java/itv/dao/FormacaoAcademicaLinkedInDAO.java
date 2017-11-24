package itv.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import itv.entity.FormacaoAcademicaLinkedIn; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("FormacaoAcademicaLinkedInDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface FormacaoAcademicaLinkedInDAO extends JpaRepository<FormacaoAcademicaLinkedIn, java.lang.Integer> {

  /**
   * Obtém a instância de FormacaoAcademicaLinkedIn utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM FormacaoAcademicaLinkedIn entity WHERE entity.id = :id")
  public FormacaoAcademicaLinkedIn findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de FormacaoAcademicaLinkedIn utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM FormacaoAcademicaLinkedIn entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from FormacaoAcademicaLinkedIn c")
  public Page<FormacaoAcademicaLinkedIn> list(Pageable pageable);
  


  /**
   * Foreign Key dadoPessoalLinkedIn
   * @generated
   */
  @Query("SELECT entity FROM FormacaoAcademicaLinkedIn entity WHERE entity.dadoPessoalLinkedIn.id = :id")
  public Page<FormacaoAcademicaLinkedIn> findFormacaoAcademicaLinkedInsByDadoPessoalLinkedIn(@Param(value="id") java.lang.Integer id, Pageable pageable);

  @Query("SELECT entity FROM FormacaoAcademicaLinkedIn entity left join DadoPessoalLinkedIn dpl left join Pessoa p WHERE entity.dadoPessoalLinkedIn.id = dpl.id and p.dadoPessoalLinkedIn.id = dpl.id and p.id = :id")
  public Page<FormacaoAcademicaLinkedIn> findByPessoaId(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
