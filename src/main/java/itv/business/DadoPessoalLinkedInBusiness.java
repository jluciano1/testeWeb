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
 * Classe que representa a camada de negócios de DadoPessoalLinkedInBusiness
 * 
 * @generated
 **/
@Service("DadoPessoalLinkedInBusiness")
public class DadoPessoalLinkedInBusiness {



  /**
   * Instância da classe DadoPessoalLinkedInDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DadoPessoalLinkedInDAO")
  protected DadoPessoalLinkedInDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public DadoPessoalLinkedIn post(final DadoPessoalLinkedIn entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    DadoPessoalLinkedIn result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public DadoPessoalLinkedIn put(final DadoPessoalLinkedIn entity) throws Exception {
    // begin-user-code  
    // end-user-code
    DadoPessoalLinkedIn result = repository.saveAndFlush(entity);
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
    DadoPessoalLinkedIn entity = this.get(id);
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
  public DadoPessoalLinkedIn get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    DadoPessoalLinkedIn result = repository.findOne(id);
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
  public Page<DadoPessoalLinkedIn> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<DadoPessoalLinkedIn> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<InteresseLinkedIn> findInteresseLinkedIn(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<InteresseLinkedIn> result = repository.findInteresseLinkedIn(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<FormacaoAcademicaLinkedIn> findFormacaoAcademicaLinkedIn(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<FormacaoAcademicaLinkedIn> result = repository.findFormacaoAcademicaLinkedIn(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<ExperienciaLinkedIn> findExperienciaLinkedIn(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<ExperienciaLinkedIn> result = repository.findExperienciaLinkedIn(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
}
