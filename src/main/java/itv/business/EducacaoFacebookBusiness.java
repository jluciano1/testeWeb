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
 * Classe que representa a camada de negócios de EducacaoFacebookBusiness
 * 
 * @generated
 **/
@Service("EducacaoFacebookBusiness")
public class EducacaoFacebookBusiness {



  /**
   * Instância da classe EducacaoFacebookDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EducacaoFacebookDAO")
  protected EducacaoFacebookDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public EducacaoFacebook post(final EducacaoFacebook entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    EducacaoFacebook result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public EducacaoFacebook put(final EducacaoFacebook entity) throws Exception {
    // begin-user-code  
    // end-user-code
    EducacaoFacebook result = repository.saveAndFlush(entity);
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
    EducacaoFacebook entity = this.get(id);
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
  public EducacaoFacebook get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    EducacaoFacebook result = repository.findOne(id);
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
  public Page<EducacaoFacebook> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<EducacaoFacebook> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  public Page<EducacaoFacebook> findEducacaoFacebooksByDadoPessoalFacebook(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<EducacaoFacebook> result = repository.findEducacaoFacebooksByDadoPessoalFacebook(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
