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

  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalFacebook/{dadoPessoalFacebookId}")    
  public HttpEntity<PagedResources<TrabalhoFacebook>> findTrabalhoFacebooksByDadoPessoalFacebook(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(trabalhoFacebookBusiness.findTrabalhoFacebooksByDadoPessoalFacebook(dadoPessoalFacebookId, pageable)), HttpStatus.OK);
  }
}
