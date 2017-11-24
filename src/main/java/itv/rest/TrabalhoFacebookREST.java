package itv.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import itv.business.TrabalhoFacebookBusiness;
import itv.entity.TrabalhoFacebook;

/**
 * Controller para expor serviços REST de TrabalhoFacebook
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/TrabalhoFacebook")
public class TrabalhoFacebookREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TrabalhoFacebookBusiness")
  private TrabalhoFacebookBusiness trabalhoFacebookBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public TrabalhoFacebook post(@Validated @RequestBody final TrabalhoFacebook entity) throws Exception {
    return trabalhoFacebookBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public TrabalhoFacebook put(@Validated @RequestBody final TrabalhoFacebook entity) throws Exception {
    return trabalhoFacebookBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{trabalhoFacebookId}")
  public TrabalhoFacebook put(@Validated @RequestBody final TrabalhoFacebook entity, @PathVariable("trabalhoFacebookId") java.lang.Integer trabalhoFacebookId) throws Exception {
    return trabalhoFacebookBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{trabalhoFacebookId}")
  public void delete(@PathVariable("trabalhoFacebookId") java.lang.Integer trabalhoFacebookId) throws Exception {
    trabalhoFacebookBusiness.delete(trabalhoFacebookId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<TrabalhoFacebook>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(trabalhoFacebookBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{trabalhoFacebookId}")
  public TrabalhoFacebook get(@PathVariable("trabalhoFacebookId") java.lang.Integer trabalhoFacebookId) throws Exception {
    return trabalhoFacebookBusiness.get(trabalhoFacebookId);
  }

  @RequestMapping(method = RequestMethod.GET, value="/Pessoa/{pessoaId}")    
  public HttpEntity<PagedResources<TrabalhoFacebook>> findByPessoaId(@PathVariable("pessoaId") java.lang.Integer id, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(trabalhoFacebookBusiness.findByPessoaId(id, pageable)), HttpStatus.OK);
  }
}
