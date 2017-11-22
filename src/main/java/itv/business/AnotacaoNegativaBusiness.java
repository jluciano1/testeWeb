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
 * Classe que representa a camada de negócios de AnotacaoNegativaBusiness
 * 
 * @generated
 **/
@Service("AnotacaoNegativaBusiness")
public class AnotacaoNegativaBusiness {



  /**
   * Instância da classe AnotacaoNegativaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("AnotacaoNegativaDAO")
  protected AnotacaoNegativaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public AnotacaoNegativa post(final AnotacaoNegativa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    AnotacaoNegativa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public AnotacaoNegativa put(final AnotacaoNegativa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    AnotacaoNegativa result = repository.saveAndFlush(entity);
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
    AnotacaoNegativa entity = this.get(id);
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
  public AnotacaoNegativa get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    AnotacaoNegativa result = repository.findOne(id);
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
  public Page<AnotacaoNegativa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<AnotacaoNegativa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
}
