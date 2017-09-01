package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Mercadoria
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/Mercadoria")
public class MercadoriaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("MercadoriaBusiness")
  private MercadoriaBusiness mercadoriaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Mercadoria post(@Validated @RequestBody final Mercadoria entity) throws Exception {
    return mercadoriaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Mercadoria put(@Validated @RequestBody final Mercadoria entity) throws Exception {
    return mercadoriaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{mercadoriaId}")
  public Mercadoria put(@Validated @RequestBody final Mercadoria entity, @PathVariable("mercadoriaId") java.lang.Integer mercadoriaId) throws Exception {
    return mercadoriaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{mercadoriaId}")
  public void delete(@PathVariable("mercadoriaId") java.lang.Integer mercadoriaId) throws Exception {
    mercadoriaBusiness.delete(mercadoriaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Mercadoria>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(mercadoriaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{mercadoriaId}")
  public Mercadoria get(@PathVariable("mercadoriaId") java.lang.Integer mercadoriaId) throws Exception {
    return mercadoriaBusiness.get(mercadoriaId);
  }
}
