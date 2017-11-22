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
 * Controller para expor serviços REST de EducacaoFacebook
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/EducacaoFacebook")
public class EducacaoFacebookREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EducacaoFacebookBusiness")
  private EducacaoFacebookBusiness educacaoFacebookBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public EducacaoFacebook post(@Validated @RequestBody final EducacaoFacebook entity) throws Exception {
    return educacaoFacebookBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public EducacaoFacebook put(@Validated @RequestBody final EducacaoFacebook entity) throws Exception {
    return educacaoFacebookBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{educacaoFacebookId}")
  public EducacaoFacebook put(@Validated @RequestBody final EducacaoFacebook entity, @PathVariable("educacaoFacebookId") java.lang.Integer educacaoFacebookId) throws Exception {
    return educacaoFacebookBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{educacaoFacebookId}")
  public void delete(@PathVariable("educacaoFacebookId") java.lang.Integer educacaoFacebookId) throws Exception {
    educacaoFacebookBusiness.delete(educacaoFacebookId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<EducacaoFacebook>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(educacaoFacebookBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{educacaoFacebookId}")
  public EducacaoFacebook get(@PathVariable("educacaoFacebookId") java.lang.Integer educacaoFacebookId) throws Exception {
    return educacaoFacebookBusiness.get(educacaoFacebookId);
  }

  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalFacebook/{dadoPessoalFacebookId}")    
  public HttpEntity<PagedResources<EducacaoFacebook>> findEducacaoFacebooksByDadoPessoalFacebook(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(educacaoFacebookBusiness.findEducacaoFacebooksByDadoPessoalFacebook(dadoPessoalFacebookId, pageable)), HttpStatus.OK);
  }
}
