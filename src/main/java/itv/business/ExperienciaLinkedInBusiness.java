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
 * Classe que representa a camada de negócios de ExperienciaLinkedInBusiness
 * 
 * @generated
 **/
@Service("ExperienciaLinkedInBusiness")
public class ExperienciaLinkedInBusiness {



  /**
   * Instância da classe ExperienciaLinkedInDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ExperienciaLinkedInDAO")
  protected ExperienciaLinkedInDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public ExperienciaLinkedIn post(final ExperienciaLinkedIn entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    ExperienciaLinkedIn result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public ExperienciaLinkedIn put(final ExperienciaLinkedIn entity) throws Exception {
    // begin-user-code  
    // end-user-code
    ExperienciaLinkedIn result = repository.saveAndFlush(entity);
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
    ExperienciaLinkedIn entity = this.get(id);
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
  public ExperienciaLinkedIn get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    ExperienciaLinkedIn result = repository.findOne(id);
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
  public Page<ExperienciaLinkedIn> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<ExperienciaLinkedIn> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key dadoPessoalLinkedIn
   * @generated
   */
  public Page<ExperienciaLinkedIn> findExperienciaLinkedInsByDadoPessoalLinkedIn(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<ExperienciaLinkedIn> result = repository.findExperienciaLinkedInsByDadoPessoalLinkedIn(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
