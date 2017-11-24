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

import itv.business.InteresseLinkedInBusiness;
import itv.entity.InteresseLinkedIn;

/**
 * Controller para expor serviços REST de InteresseLinkedIn
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/InteresseLinkedIn")
public class InteresseLinkedInREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("InteresseLinkedInBusiness")
  private InteresseLinkedInBusiness interesseLinkedInBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public InteresseLinkedIn post(@Validated @RequestBody final InteresseLinkedIn entity) throws Exception {
    return interesseLinkedInBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public InteresseLinkedIn put(@Validated @RequestBody final InteresseLinkedIn entity) throws Exception {
    return interesseLinkedInBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{interesseLinkedInId}")
  public InteresseLinkedIn put(@Validated @RequestBody final InteresseLinkedIn entity, @PathVariable("interesseLinkedInId") java.lang.Integer interesseLinkedInId) throws Exception {
    return interesseLinkedInBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{interesseLinkedInId}")
  public void delete(@PathVariable("interesseLinkedInId") java.lang.Integer interesseLinkedInId) throws Exception {
    interesseLinkedInBusiness.delete(interesseLinkedInId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<InteresseLinkedIn>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(interesseLinkedInBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{interesseLinkedInId}")
  public InteresseLinkedIn get(@PathVariable("interesseLinkedInId") java.lang.Integer interesseLinkedInId) throws Exception {
    return interesseLinkedInBusiness.get(interesseLinkedInId);
  }

  /**
   * Foreign Key dadoPessoalLinkedIn
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalLinkedIn/{dadoPessoalLinkedInId}")    
  public HttpEntity<PagedResources<InteresseLinkedIn>> findInteresseLinkedInsByDadoPessoalLinkedIn(@PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(interesseLinkedInBusiness.findInteresseLinkedInsByDadoPessoalLinkedIn(dadoPessoalLinkedInId, pageable)), HttpStatus.OK);
  }
  
  @RequestMapping(method = RequestMethod.GET, value="/Pessoa/{pessoaId}")    
  public HttpEntity<PagedResources<InteresseLinkedIn>> findByPessoaId(@PathVariable("pessoaId") java.lang.Integer id, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(interesseLinkedInBusiness.findByPessoaId(id, pageable)), HttpStatus.OK);
  }
}
