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
 * Controller para expor serviços REST de AcontecimentoFacebook
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/AcontecimentoFacebook")
public class AcontecimentoFacebookREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("AcontecimentoFacebookBusiness")
  private AcontecimentoFacebookBusiness acontecimentoFacebookBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public AcontecimentoFacebook post(@Validated @RequestBody final AcontecimentoFacebook entity) throws Exception {
    return acontecimentoFacebookBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public AcontecimentoFacebook put(@Validated @RequestBody final AcontecimentoFacebook entity) throws Exception {
    return acontecimentoFacebookBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{acontecimentoFacebookId}")
  public AcontecimentoFacebook put(@Validated @RequestBody final AcontecimentoFacebook entity, @PathVariable("acontecimentoFacebookId") java.lang.Integer acontecimentoFacebookId) throws Exception {
    return acontecimentoFacebookBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{acontecimentoFacebookId}")
  public void delete(@PathVariable("acontecimentoFacebookId") java.lang.Integer acontecimentoFacebookId) throws Exception {
    acontecimentoFacebookBusiness.delete(acontecimentoFacebookId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<AcontecimentoFacebook>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(acontecimentoFacebookBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{acontecimentoFacebookId}")
  public AcontecimentoFacebook get(@PathVariable("acontecimentoFacebookId") java.lang.Integer acontecimentoFacebookId) throws Exception {
    return acontecimentoFacebookBusiness.get(acontecimentoFacebookId);
  }

  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalFacebook/{dadoPessoalFacebookId}")    
  public HttpEntity<PagedResources<AcontecimentoFacebook>> findAcontecimentoFacebooksByDadoPessoalFacebook(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(acontecimentoFacebookBusiness.findAcontecimentoFacebooksByDadoPessoalFacebook(dadoPessoalFacebookId, pageable)), HttpStatus.OK);
  }
}
