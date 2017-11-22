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
 * Controller para expor serviços REST de DadoVizinho
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/DadoVizinho")
public class DadoVizinhoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DadoVizinhoBusiness")
  private DadoVizinhoBusiness dadoVizinhoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public DadoVizinho post(@Validated @RequestBody final DadoVizinho entity) throws Exception {
    return dadoVizinhoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public DadoVizinho put(@Validated @RequestBody final DadoVizinho entity) throws Exception {
    return dadoVizinhoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{dadoVizinhoId}")
  public DadoVizinho put(@Validated @RequestBody final DadoVizinho entity, @PathVariable("dadoVizinhoId") java.lang.Integer dadoVizinhoId) throws Exception {
    return dadoVizinhoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{dadoVizinhoId}")
  public void delete(@PathVariable("dadoVizinhoId") java.lang.Integer dadoVizinhoId) throws Exception {
    dadoVizinhoBusiness.delete(dadoVizinhoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<DadoVizinho>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(dadoVizinhoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{dadoVizinhoId}")
  public DadoVizinho get(@PathVariable("dadoVizinhoId") java.lang.Integer dadoVizinhoId) throws Exception {
    return dadoVizinhoBusiness.get(dadoVizinhoId);
  }

  /**
   * Foreign Key enderecoPeloSerasa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/EnderecoPeloSerasa/{enderecoPeloSerasaId}")    
  public HttpEntity<PagedResources<DadoVizinho>> findDadoVizinhosByEnderecoPeloSerasa(@PathVariable("enderecoPeloSerasaId") java.lang.Integer enderecoPeloSerasaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoVizinhoBusiness.findDadoVizinhosByEnderecoPeloSerasa(enderecoPeloSerasaId, pageable)), HttpStatus.OK);
  }
}
