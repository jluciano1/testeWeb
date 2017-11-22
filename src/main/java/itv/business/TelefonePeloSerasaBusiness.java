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
 * Classe que representa a camada de negócios de TelefonePeloSerasaBusiness
 * 
 * @generated
 **/
@Service("TelefonePeloSerasaBusiness")
public class TelefonePeloSerasaBusiness {



  /**
   * Instância da classe TelefonePeloSerasaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TelefonePeloSerasaDAO")
  protected TelefonePeloSerasaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public TelefonePeloSerasa post(final TelefonePeloSerasa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    TelefonePeloSerasa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public TelefonePeloSerasa put(final TelefonePeloSerasa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    TelefonePeloSerasa result = repository.saveAndFlush(entity);
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
    TelefonePeloSerasa entity = this.get(id);
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
  public TelefonePeloSerasa get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    TelefonePeloSerasa result = repository.findOne(id);
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
  public Page<TelefonePeloSerasa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<TelefonePeloSerasa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key dadoPessoalSerasa
   * @generated
   */
  public Page<TelefonePeloSerasa> findTelefonePeloSerasasByDadoPessoalSerasa(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<TelefonePeloSerasa> result = repository.findTelefonePeloSerasasByDadoPessoalSerasa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
