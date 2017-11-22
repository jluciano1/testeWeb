package itv.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import itv.entity.*;
import itv.business.*;

/**
 * Controller para expor serviços REST de DadoPessoalLinkedIn
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/DadoPessoalLinkedIn")
public class DadoPessoalLinkedInREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DadoPessoalLinkedInBusiness")
  private DadoPessoalLinkedInBusiness dadoPessoalLinkedInBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("InteresseLinkedInBusiness")
  private InteresseLinkedInBusiness interesseLinkedInBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("FormacaoAcademicaLinkedInBusiness")
  private FormacaoAcademicaLinkedInBusiness formacaoAcademicaLinkedInBusiness;

  /**
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
  public DadoPessoalLinkedIn post(@Validated @RequestBody final DadoPessoalLinkedIn entity) throws Exception {
    return dadoPessoalLinkedInBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public DadoPessoalLinkedIn put(@Validated @RequestBody final DadoPessoalLinkedIn entity) throws Exception {
    return dadoPessoalLinkedInBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{dadoPessoalLinkedInId}")
  public DadoPessoalLinkedIn put(@Validated @RequestBody final DadoPessoalLinkedIn entity, @PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    return dadoPessoalLinkedInBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{dadoPessoalLinkedInId}")
  public void delete(@PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    dadoPessoalLinkedInBusiness.delete(dadoPessoalLinkedInId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<DadoPessoalLinkedIn>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(dadoPessoalLinkedInBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalLinkedInId}/InteresseLinkedIn")    
  public HttpEntity<PagedResources<InteresseLinkedIn>> findInteresseLinkedIn(@PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalLinkedInBusiness.findInteresseLinkedIn(dadoPessoalLinkedInId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalLinkedInId}/InteresseLinkedIn/{interesseLinkedInId}")    
  public void deleteInteresseLinkedIn(@PathVariable("interesseLinkedInId") java.lang.Integer interesseLinkedInId) throws Exception {
    this.interesseLinkedInBusiness.delete(interesseLinkedInId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalLinkedInId}/InteresseLinkedIn")
  public InteresseLinkedIn putInteresseLinkedIn(@Validated @RequestBody final InteresseLinkedIn entity, @PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    return this.interesseLinkedInBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalLinkedInId}/InteresseLinkedIn")
  public InteresseLinkedIn postInteresseLinkedIn(@Validated @RequestBody final InteresseLinkedIn entity, @PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    DadoPessoalLinkedIn dadoPessoalLinkedIn = this.dadoPessoalLinkedInBusiness.get(dadoPessoalLinkedInId);
    entity.setDadoPessoalLinkedIn(dadoPessoalLinkedIn);
    return this.interesseLinkedInBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalLinkedInId}/FormacaoAcademicaLinkedIn")    
  public HttpEntity<PagedResources<FormacaoAcademicaLinkedIn>> findFormacaoAcademicaLinkedIn(@PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalLinkedInBusiness.findFormacaoAcademicaLinkedIn(dadoPessoalLinkedInId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalLinkedInId}/FormacaoAcademicaLinkedIn/{formacaoAcademicaLinkedInId}")    
  public void deleteFormacaoAcademicaLinkedIn(@PathVariable("formacaoAcademicaLinkedInId") java.lang.Integer formacaoAcademicaLinkedInId) throws Exception {
    this.formacaoAcademicaLinkedInBusiness.delete(formacaoAcademicaLinkedInId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalLinkedInId}/FormacaoAcademicaLinkedIn")
  public FormacaoAcademicaLinkedIn putFormacaoAcademicaLinkedIn(@Validated @RequestBody final FormacaoAcademicaLinkedIn entity, @PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    return this.formacaoAcademicaLinkedInBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalLinkedInId}/FormacaoAcademicaLinkedIn")
  public FormacaoAcademicaLinkedIn postFormacaoAcademicaLinkedIn(@Validated @RequestBody final FormacaoAcademicaLinkedIn entity, @PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    DadoPessoalLinkedIn dadoPessoalLinkedIn = this.dadoPessoalLinkedInBusiness.get(dadoPessoalLinkedInId);
    entity.setDadoPessoalLinkedIn(dadoPessoalLinkedIn);
    return this.formacaoAcademicaLinkedInBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalLinkedInId}/ExperienciaLinkedIn")    
  public HttpEntity<PagedResources<ExperienciaLinkedIn>> findExperienciaLinkedIn(@PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalLinkedInBusiness.findExperienciaLinkedIn(dadoPessoalLinkedInId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalLinkedInId}/ExperienciaLinkedIn/{experienciaLinkedInId}")    
  public void deleteExperienciaLinkedIn(@PathVariable("experienciaLinkedInId") java.lang.Integer experienciaLinkedInId) throws Exception {
    this.experienciaLinkedInBusiness.delete(experienciaLinkedInId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalLinkedInId}/ExperienciaLinkedIn")
  public ExperienciaLinkedIn putExperienciaLinkedIn(@Validated @RequestBody final ExperienciaLinkedIn entity, @PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    return this.experienciaLinkedInBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalLinkedInId}/ExperienciaLinkedIn")
  public ExperienciaLinkedIn postExperienciaLinkedIn(@Validated @RequestBody final ExperienciaLinkedIn entity, @PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    DadoPessoalLinkedIn dadoPessoalLinkedIn = this.dadoPessoalLinkedInBusiness.get(dadoPessoalLinkedInId);
    entity.setDadoPessoalLinkedIn(dadoPessoalLinkedIn);
    return this.experienciaLinkedInBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{dadoPessoalLinkedInId}")
  public DadoPessoalLinkedIn get(@PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId) throws Exception {
    return dadoPessoalLinkedInBusiness.get(dadoPessoalLinkedInId);
  }
}
