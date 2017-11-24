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

import itv.business.ExperienciaLinkedInBusiness;
import itv.entity.ExperienciaLinkedIn;

/**
 * Controller para expor serviços REST de ExperienciaLinkedIn
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/ExperienciaLinkedIn")
public class ExperienciaLinkedInREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ExperienciaLinkedInBusiness")
  private ExperienciaLinkedInBusiness experienciaLinkedInBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public ExperienciaLinkedIn post(@Validated @RequestBody final ExperienciaLinkedIn entity) throws Exception {
    return experienciaLinkedInBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public ExperienciaLinkedIn put(@Validated @RequestBody final ExperienciaLinkedIn entity) throws Exception {
    return experienciaLinkedInBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{experienciaLinkedInId}")
  public ExperienciaLinkedIn put(@Validated @RequestBody final ExperienciaLinkedIn entity, @PathVariable("experienciaLinkedInId") java.lang.Integer experienciaLinkedInId) throws Exception {
    return experienciaLinkedInBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{experienciaLinkedInId}")
  public void delete(@PathVariable("experienciaLinkedInId") java.lang.Integer experienciaLinkedInId) throws Exception {
    experienciaLinkedInBusiness.delete(experienciaLinkedInId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<ExperienciaLinkedIn>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(experienciaLinkedInBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{experienciaLinkedInId}")
  public ExperienciaLinkedIn get(@PathVariable("experienciaLinkedInId") java.lang.Integer experienciaLinkedInId) throws Exception {
    return experienciaLinkedInBusiness.get(experienciaLinkedInId);
  }

  /**
   * Foreign Key dadoPessoalLinkedIn
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalLinkedIn/{dadoPessoalLinkedInId}")    
  public HttpEntity<PagedResources<ExperienciaLinkedIn>> findExperienciaLinkedInsByDadoPessoalLinkedIn(@PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(experienciaLinkedInBusiness.findExperienciaLinkedInsByDadoPessoalLinkedIn(dadoPessoalLinkedInId, pageable)), HttpStatus.OK);
  }
  
  @RequestMapping(method = RequestMethod.GET, value="/Pessoa/{pessoaId}")    
  public HttpEntity<PagedResources<ExperienciaLinkedIn>> findByPessoaId(@PathVariable("pessoaId") java.lang.Integer id, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(experienciaLinkedInBusiness.findByPessoaId(id, pageable)), HttpStatus.OK);
  }
}
