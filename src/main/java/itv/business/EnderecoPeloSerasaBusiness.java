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
 * Classe que representa a camada de negócios de EnderecoPeloSerasaBusiness
 * 
 * @generated
 **/
@Service("EnderecoPeloSerasaBusiness")
public class EnderecoPeloSerasaBusiness {



  /**
   * Instância da classe EnderecoPeloSerasaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EnderecoPeloSerasaDAO")
  protected EnderecoPeloSerasaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public EnderecoPeloSerasa post(final EnderecoPeloSerasa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    EnderecoPeloSerasa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public EnderecoPeloSerasa put(final EnderecoPeloSerasa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    EnderecoPeloSerasa result = repository.saveAndFlush(entity);
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
    EnderecoPeloSerasa entity = this.get(id);
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
  public EnderecoPeloSerasa get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    EnderecoPeloSerasa result = repository.findOne(id);
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
  public Page<EnderecoPeloSerasa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<EnderecoPeloSerasa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<DadoVizinho> findDadoVizinho(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<DadoVizinho> result = repository.findDadoVizinho(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * Foreign Key dadoPessoalSerasa
   * @generated
   */
  public Page<EnderecoPeloSerasa> findEnderecoPeloSerasasByDadoPessoalSerasa(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<EnderecoPeloSerasa> result = repository.findEnderecoPeloSerasasByDadoPessoalSerasa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
