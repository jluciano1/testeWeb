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
 * Controller para expor serviços REST de MembroFamiliaFacebook
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/MembroFamiliaFacebook")
public class MembroFamiliaFacebookREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("MembroFamiliaFacebookBusiness")
  private MembroFamiliaFacebookBusiness membroFamiliaFacebookBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public MembroFamiliaFacebook post(@Validated @RequestBody final MembroFamiliaFacebook entity) throws Exception {
    return membroFamiliaFacebookBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public MembroFamiliaFacebook put(@Validated @RequestBody final MembroFamiliaFacebook entity) throws Exception {
    return membroFamiliaFacebookBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{membroFamiliaFacebookId}")
  public MembroFamiliaFacebook put(@Validated @RequestBody final MembroFamiliaFacebook entity, @PathVariable("membroFamiliaFacebookId") java.lang.Integer membroFamiliaFacebookId) throws Exception {
    return membroFamiliaFacebookBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{membroFamiliaFacebookId}")
  public void delete(@PathVariable("membroFamiliaFacebookId") java.lang.Integer membroFamiliaFacebookId) throws Exception {
    membroFamiliaFacebookBusiness.delete(membroFamiliaFacebookId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<MembroFamiliaFacebook>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(membroFamiliaFacebookBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{membroFamiliaFacebookId}")
  public MembroFamiliaFacebook get(@PathVariable("membroFamiliaFacebookId") java.lang.Integer membroFamiliaFacebookId) throws Exception {
    return membroFamiliaFacebookBusiness.get(membroFamiliaFacebookId);
  }

  /**
   * Foreign Key dadoPessoalFacebook
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalFacebook/{dadoPessoalFacebookId}")    
  public HttpEntity<PagedResources<MembroFamiliaFacebook>> findMembroFamiliaFacebooksByDadoPessoalFacebook(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(membroFamiliaFacebookBusiness.findMembroFamiliaFacebooksByDadoPessoalFacebook(dadoPessoalFacebookId, pageable)), HttpStatus.OK);
  }
}
