package itv.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import itv.dao.*;
import itv.entity.*;

/**
 * Classe que representa a camada de negócios de ParticipacaoSocietariaBusiness
 * 
 * @generated
 **/
@Service("ParticipacaoSocietariaBusiness")
public class ParticipacaoSocietariaBusiness {



  /**
   * Instância da classe ParticipacaoSocietariaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ParticipacaoSocietariaDAO")
  protected ParticipacaoSocietariaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public ParticipacaoSocietaria post(final ParticipacaoSocietaria entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    ParticipacaoSocietaria result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public ParticipacaoSocietaria put(final ParticipacaoSocietaria entity) throws Exception {
    // begin-user-code  
    // end-user-code
    ParticipacaoSocietaria result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.Integer id) throws Exception {
    ParticipacaoSocietaria entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public ParticipacaoSocietaria get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    ParticipacaoSocietaria result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<ParticipacaoSocietaria> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<ParticipacaoSocietaria> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key dadoPessoalSerasa
   * @generated
   */
  public Page<ParticipacaoSocietaria> findParticipacaoSocietariasByDadoPessoalSerasa(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<ParticipacaoSocietaria> result = repository.findParticipacaoSocietariasByDadoPessoalSerasa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
