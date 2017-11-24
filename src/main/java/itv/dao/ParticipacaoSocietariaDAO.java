package itv.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import itv.entity.ParticipacaoSocietaria; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ParticipacaoSocietariaDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface ParticipacaoSocietariaDAO extends JpaRepository<ParticipacaoSocietaria, java.lang.Integer> {

  /**
   * Obtém a instância de ParticipacaoSocietaria utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ParticipacaoSocietaria entity WHERE entity.id = :id")
  public ParticipacaoSocietaria findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de ParticipacaoSocietaria utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ParticipacaoSocietaria entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ParticipacaoSocietaria c")
  public Page<ParticipacaoSocietaria> list(Pageable pageable);
  
  @Query("SELECT entity FROM ParticipacaoSocietaria entity WHERE entity.dadoPessoalSerasa.id = :id")
  public Page<ParticipacaoSocietaria> findParticipacaoSocietariasByDadoPessoalSerasa(@Param(value="id") java.lang.Integer id, Pageable pageable);

  @Query("SELECT entity FROM ParticipacaoSocietaria entity left join DadoPessoalSerasa dps left join Pessoa p WHERE entity.dadoPessoalSerasa.id = dps.id and p.dadoPessoalSerasa.id = dps.id and p.id = :id")
  public Page<ParticipacaoSocietaria> findByPessoaId(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
