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
 * Controller para expor serviços REST de FormacaoAcademicaLinkedIn
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/FormacaoAcademicaLinkedIn")
public class FormacaoAcademicaLinkedInREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("FormacaoAcademicaLinkedInBusiness")
  private FormacaoAcademicaLinkedInBusiness formacaoAcademicaLinkedInBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public FormacaoAcademicaLinkedIn post(@Validated @RequestBody final FormacaoAcademicaLinkedIn entity) throws Exception {
    return formacaoAcademicaLinkedInBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public FormacaoAcademicaLinkedIn put(@Validated @RequestBody final FormacaoAcademicaLinkedIn entity) throws Exception {
    return formacaoAcademicaLinkedInBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{formacaoAcademicaLinkedInId}")
  public FormacaoAcademicaLinkedIn put(@Validated @RequestBody final FormacaoAcademicaLinkedIn entity, @PathVariable("formacaoAcademicaLinkedInId") java.lang.Integer formacaoAcademicaLinkedInId) throws Exception {
    return formacaoAcademicaLinkedInBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{formacaoAcademicaLinkedInId}")
  public void delete(@PathVariable("formacaoAcademicaLinkedInId") java.lang.Integer formacaoAcademicaLinkedInId) throws Exception {
    formacaoAcademicaLinkedInBusiness.delete(formacaoAcademicaLinkedInId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<FormacaoAcademicaLinkedIn>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(formacaoAcademicaLinkedInBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{formacaoAcademicaLinkedInId}")
  public FormacaoAcademicaLinkedIn get(@PathVariable("formacaoAcademicaLinkedInId") java.lang.Integer formacaoAcademicaLinkedInId) throws Exception {
    return formacaoAcademicaLinkedInBusiness.get(formacaoAcademicaLinkedInId);
  }

  /**
   * Foreign Key dadoPessoalLinkedIn
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalLinkedIn/{dadoPessoalLinkedInId}")    
  public HttpEntity<PagedResources<FormacaoAcademicaLinkedIn>> findFormacaoAcademicaLinkedInsByDadoPessoalLinkedIn(@PathVariable("dadoPessoalLinkedInId") java.lang.Integer dadoPessoalLinkedInId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(formacaoAcademicaLinkedInBusiness.findFormacaoAcademicaLinkedInsByDadoPessoalLinkedIn(dadoPessoalLinkedInId, pageable)), HttpStatus.OK);
  }
}
