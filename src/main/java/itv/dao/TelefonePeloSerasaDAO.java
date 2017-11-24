package itv.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import itv.entity.TelefonePeloSerasa; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("TelefonePeloSerasaDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface TelefonePeloSerasaDAO extends JpaRepository<TelefonePeloSerasa, java.lang.Integer> {

  /**
   * Obtém a instância de TelefonePeloSerasa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TelefonePeloSerasa entity WHERE entity.id = :id")
  public TelefonePeloSerasa findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de TelefonePeloSerasa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TelefonePeloSerasa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from TelefonePeloSerasa c")
  public Page<TelefonePeloSerasa> list(Pageable pageable);
  


  /**
   * Foreign Key dadoPessoalSerasa
   * @generated
   */
  @Query("SELECT entity FROM TelefonePeloSerasa entity WHERE entity.dadoPessoalSerasa.id = :id")
  public Page<TelefonePeloSerasa> findTelefonePeloSerasasByDadoPessoalSerasa(@Param(value="id") java.lang.Integer id, Pageable pageable);
  
  @Query("SELECT entity FROM TelefonePeloSerasa entity left join DadoPessoalSerasa dps left join Pessoa p WHERE entity.dadoPessoalSerasa.id = dps.id and dps.id = p.dadoPessoalSerasa.id and p.id = :id")
  public Page<TelefonePeloSerasa> findByPessoaId(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
