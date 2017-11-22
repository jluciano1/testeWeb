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
 * Classe que representa a camada de negócios de DadoPessoalFacebookBusiness
 * 
 * @generated
 **/
@Service("DadoPessoalFacebookBusiness")
public class DadoPessoalFacebookBusiness {



  /**
   * Instância da classe DadoPessoalFacebookDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DadoPessoalFacebookDAO")
  protected DadoPessoalFacebookDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public DadoPessoalFacebook post(final DadoPessoalFacebook entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    DadoPessoalFacebook result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public DadoPessoalFacebook put(final DadoPessoalFacebook entity) throws Exception {
    // begin-user-code  
    // end-user-code
    DadoPessoalFacebook result = repository.saveAndFlush(entity);
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
    DadoPessoalFacebook entity = this.get(id);
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
  public DadoPessoalFacebook get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    DadoPessoalFacebook result = repository.findOne(id);
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
  public Page<DadoPessoalFacebook> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<DadoPessoalFacebook> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<EducacaoFacebook> findEducacaoFacebook(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<EducacaoFacebook> result = repository.findEducacaoFacebook(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<TrabalhoFacebook> findTrabalhoFacebook(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<TrabalhoFacebook> result = repository.findTrabalhoFacebook(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<MembroFamiliaFacebook> findMembroFamiliaFacebook(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<MembroFamiliaFacebook> result = repository.findMembroFamiliaFacebook(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<AcontecimentoFacebook> findAcontecimentoFacebook(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<AcontecimentoFacebook> result = repository.findAcontecimentoFacebook(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
}
