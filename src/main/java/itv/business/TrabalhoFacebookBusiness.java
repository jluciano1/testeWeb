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
 * Classe que representa a camada de negócios de TrabalhoFacebookBusiness
 * 
 * @generated
 **/
@Service("TrabalhoFacebookBusiness")
public class TrabalhoFacebookBusiness {



  /**
   * Instância da classe TrabalhoFacebookDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TrabalhoFacebookDAO")
  protected TrabalhoFacebookDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public TrabalhoFacebook post(final TrabalhoFacebook entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    TrabalhoFacebook result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public TrabalhoFacebook put(final TrabalhoFacebook entity) throws Exception {
    // begin-user-code  
    // end-user-code
    TrabalhoFacebook result = repository.saveAndFlush(entity);
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
    TrabalhoFacebook entity = this.get(id);
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
  public TrabalhoFacebook get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    TrabalhoFacebook result = repository.findOne(id);
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
  public Page<TrabalhoFacebook> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<TrabalhoFacebook> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  public Page<TrabalhoFacebook> findTrabalhoFacebooksByDadoPessoalFacebook(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<TrabalhoFacebook> result = repository.findTrabalhoFacebooksByDadoPessoalFacebook(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
