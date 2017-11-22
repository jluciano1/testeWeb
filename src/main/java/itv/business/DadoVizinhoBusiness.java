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
 * Classe que representa a camada de negócios de DadoVizinhoBusiness
 * 
 * @generated
 **/
@Service("DadoVizinhoBusiness")
public class DadoVizinhoBusiness {



  /**
   * Instância da classe DadoVizinhoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DadoVizinhoDAO")
  protected DadoVizinhoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public DadoVizinho post(final DadoVizinho entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    DadoVizinho result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public DadoVizinho put(final DadoVizinho entity) throws Exception {
    // begin-user-code  
    // end-user-code
    DadoVizinho result = repository.saveAndFlush(entity);
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
    DadoVizinho entity = this.get(id);
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
  public DadoVizinho get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    DadoVizinho result = repository.findOne(id);
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
  public Page<DadoVizinho> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<DadoVizinho> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key enderecoPeloSerasa
   * @generated
   */
  public Page<DadoVizinho> findDadoVizinhosByEnderecoPeloSerasa(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<DadoVizinho> result = repository.findDadoVizinhosByEnderecoPeloSerasa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
