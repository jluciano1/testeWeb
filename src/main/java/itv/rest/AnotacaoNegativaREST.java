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
 * Controller para expor serviços REST de AnotacaoNegativa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/AnotacaoNegativa")
public class AnotacaoNegativaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("AnotacaoNegativaBusiness")
  private AnotacaoNegativaBusiness anotacaoNegativaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public AnotacaoNegativa post(@Validated @RequestBody final AnotacaoNegativa entity) throws Exception {
    return anotacaoNegativaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public AnotacaoNegativa put(@Validated @RequestBody final AnotacaoNegativa entity) throws Exception {
    return anotacaoNegativaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{anotacaoNegativaId}")
  public AnotacaoNegativa put(@Validated @RequestBody final AnotacaoNegativa entity, @PathVariable("anotacaoNegativaId") java.lang.Integer anotacaoNegativaId) throws Exception {
    return anotacaoNegativaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{anotacaoNegativaId}")
  public void delete(@PathVariable("anotacaoNegativaId") java.lang.Integer anotacaoNegativaId) throws Exception {
    anotacaoNegativaBusiness.delete(anotacaoNegativaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<AnotacaoNegativa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(anotacaoNegativaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{anotacaoNegativaId}")
  public AnotacaoNegativa get(@PathVariable("anotacaoNegativaId") java.lang.Integer anotacaoNegativaId) throws Exception {
    return anotacaoNegativaBusiness.get(anotacaoNegativaId);
  }
}
