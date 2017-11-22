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
 * Classe que representa a camada de negócios de ClassifRiscoCreditoEmpresaBusiness
 * 
 * @generated
 **/
@Service("ClassifRiscoCreditoEmpresaBusiness")
public class ClassifRiscoCreditoEmpresaBusiness {



  /**
   * Instância da classe ClassifRiscoCreditoEmpresaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ClassifRiscoCreditoEmpresaDAO")
  protected ClassifRiscoCreditoEmpresaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public ClassifRiscoCreditoEmpresa post(final ClassifRiscoCreditoEmpresa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    ClassifRiscoCreditoEmpresa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public ClassifRiscoCreditoEmpresa put(final ClassifRiscoCreditoEmpresa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    ClassifRiscoCreditoEmpresa result = repository.saveAndFlush(entity);
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
    ClassifRiscoCreditoEmpresa entity = this.get(id);
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
  public ClassifRiscoCreditoEmpresa get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    ClassifRiscoCreditoEmpresa result = repository.findOne(id);
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
  public Page<ClassifRiscoCreditoEmpresa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<ClassifRiscoCreditoEmpresa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
}
