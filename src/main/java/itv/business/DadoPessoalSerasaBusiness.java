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
 * Classe que representa a camada de negócios de DadoPessoalSerasaBusiness
 * 
 * @generated
 **/
@Service("DadoPessoalSerasaBusiness")
public class DadoPessoalSerasaBusiness {



  /**
   * Instância da classe DadoPessoalSerasaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DadoPessoalSerasaDAO")
  protected DadoPessoalSerasaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public DadoPessoalSerasa post(final DadoPessoalSerasa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    DadoPessoalSerasa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public DadoPessoalSerasa put(final DadoPessoalSerasa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    DadoPessoalSerasa result = repository.saveAndFlush(entity);
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
    DadoPessoalSerasa entity = this.get(id);
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
  public DadoPessoalSerasa get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    DadoPessoalSerasa result = repository.findOne(id);
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
  public Page<DadoPessoalSerasa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<DadoPessoalSerasa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<EnderecoPeloSerasa> findEnderecoPeloSerasa(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<EnderecoPeloSerasa> result = repository.findEnderecoPeloSerasa(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<TelefonePeloSerasa> findTelefonePeloSerasa(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<TelefonePeloSerasa> result = repository.findTelefonePeloSerasa(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<ParticipacaoSocietaria> findParticipacaoSocietaria(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<ParticipacaoSocietaria> result = repository.findParticipacaoSocietaria(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
}
