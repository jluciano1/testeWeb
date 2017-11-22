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
 * Controller para expor serviços REST de ClassifRiscoCreditoEmpresa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/ClassifRiscoCreditoEmpresa")
public class ClassifRiscoCreditoEmpresaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ClassifRiscoCreditoEmpresaBusiness")
  private ClassifRiscoCreditoEmpresaBusiness classifRiscoCreditoEmpresaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public ClassifRiscoCreditoEmpresa post(@Validated @RequestBody final ClassifRiscoCreditoEmpresa entity) throws Exception {
    return classifRiscoCreditoEmpresaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public ClassifRiscoCreditoEmpresa put(@Validated @RequestBody final ClassifRiscoCreditoEmpresa entity) throws Exception {
    return classifRiscoCreditoEmpresaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{classifRiscoCreditoEmpresaId}")
  public ClassifRiscoCreditoEmpresa put(@Validated @RequestBody final ClassifRiscoCreditoEmpresa entity, @PathVariable("classifRiscoCreditoEmpresaId") java.lang.Integer classifRiscoCreditoEmpresaId) throws Exception {
    return classifRiscoCreditoEmpresaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{classifRiscoCreditoEmpresaId}")
  public void delete(@PathVariable("classifRiscoCreditoEmpresaId") java.lang.Integer classifRiscoCreditoEmpresaId) throws Exception {
    classifRiscoCreditoEmpresaBusiness.delete(classifRiscoCreditoEmpresaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<ClassifRiscoCreditoEmpresa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(classifRiscoCreditoEmpresaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{classifRiscoCreditoEmpresaId}")
  public ClassifRiscoCreditoEmpresa get(@PathVariable("classifRiscoCreditoEmpresaId") java.lang.Integer classifRiscoCreditoEmpresaId) throws Exception {
    return classifRiscoCreditoEmpresaBusiness.get(classifRiscoCreditoEmpresaId);
  }
}
