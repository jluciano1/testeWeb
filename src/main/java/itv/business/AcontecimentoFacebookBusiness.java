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
 * Classe que representa a camada de negócios de AcontecimentoFacebookBusiness
 * 
 * @generated
 **/
@Service("AcontecimentoFacebookBusiness")
public class AcontecimentoFacebookBusiness {



  /**
   * Instância da classe AcontecimentoFacebookDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("AcontecimentoFacebookDAO")
  protected AcontecimentoFacebookDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public AcontecimentoFacebook post(final AcontecimentoFacebook entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    AcontecimentoFacebook result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public AcontecimentoFacebook put(final AcontecimentoFacebook entity) throws Exception {
    // begin-user-code  
    // end-user-code
    AcontecimentoFacebook result = repository.saveAndFlush(entity);
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
    AcontecimentoFacebook entity = this.get(id);
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
  public AcontecimentoFacebook get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    AcontecimentoFacebook result = repository.findOne(id);
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
  public Page<AcontecimentoFacebook> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<AcontecimentoFacebook> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  public Page<AcontecimentoFacebook> findAcontecimentoFacebooksByDadoPessoalFacebook(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<AcontecimentoFacebook> result = repository.findAcontecimentoFacebooksByDadoPessoalFacebook(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  public Page<AcontecimentoFacebook> findAcontecimentoFacebooksByPessoaId(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<AcontecimentoFacebook> result = repository.findAcontecimentoFacebooksByPessoaId(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
