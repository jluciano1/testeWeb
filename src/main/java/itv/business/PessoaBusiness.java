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
 * Classe que representa a camada de negócios de PessoaBusiness
 * 
 * @generated
 **/
@Service("PessoaBusiness")
public class PessoaBusiness {



  /**
   * Instância da classe PessoaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PessoaDAO")
  protected PessoaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Pessoa post(final Pessoa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Pessoa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Pessoa put(final Pessoa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Pessoa result = repository.saveAndFlush(entity);
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
    Pessoa entity = this.get(id);
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
  public Pessoa get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    Pessoa result = repository.findOne(id);
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
  public Page<Pessoa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Pessoa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Pessoa> listByNome( java.lang.String nome, Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Pessoa> result = repository.listByNome( nome, pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Endereco> findEndereco(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Endereco> result = repository.findEndereco(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
}
