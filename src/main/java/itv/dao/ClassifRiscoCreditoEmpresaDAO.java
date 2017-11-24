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
@Repository("ClassifRiscoCreditoEmpresaDAO")
@Transactional(transactionManager="itv-TransactionManager")
public interface ClassifRiscoCreditoEmpresaDAO extends JpaRepository<ClassifRiscoCreditoEmpresa, java.lang.Integer> {

  /**
   * Obtém a instância de ClassifRiscoCreditoEmpresa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ClassifRiscoCreditoEmpresa entity WHERE entity.id = :id")
  public ClassifRiscoCreditoEmpresa findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de ClassifRiscoCreditoEmpresa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ClassifRiscoCreditoEmpresa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ClassifRiscoCreditoEmpresa c")
  public Page<ClassifRiscoCreditoEmpresa> list(Pageable pageable);
  
  @Query("SELECT entity FROM ClassifRiscoCreditoEmpresa entity left join ParticipacaoSocietaria ps left join DadoPessoalSerasa dps left join Pessoa p WHERE entity.id = ps.classifRiscoCreditoEmpresa.id and dps.id = ps.dadoPessoalSerasa.id and p.id = :id")
  public Page<ClassifRiscoCreditoEmpresa> findByDadoPessoaId(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
