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
 * Controller para expor serviços REST de EnderecoPeloSerasa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/EnderecoPeloSerasa")
public class EnderecoPeloSerasaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EnderecoPeloSerasaBusiness")
  private EnderecoPeloSerasaBusiness enderecoPeloSerasaBusiness;

  /**
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
  public EnderecoPeloSerasa post(@Validated @RequestBody final EnderecoPeloSerasa entity) throws Exception {
    return enderecoPeloSerasaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public EnderecoPeloSerasa put(@Validated @RequestBody final EnderecoPeloSerasa entity) throws Exception {
    return enderecoPeloSerasaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{enderecoPeloSerasaId}")
  public EnderecoPeloSerasa put(@Validated @RequestBody final EnderecoPeloSerasa entity, @PathVariable("enderecoPeloSerasaId") java.lang.Integer enderecoPeloSerasaId) throws Exception {
    return enderecoPeloSerasaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{enderecoPeloSerasaId}")
  public void delete(@PathVariable("enderecoPeloSerasaId") java.lang.Integer enderecoPeloSerasaId) throws Exception {
    enderecoPeloSerasaBusiness.delete(enderecoPeloSerasaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<EnderecoPeloSerasa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(enderecoPeloSerasaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{enderecoPeloSerasaId}/DadoVizinho")    
  public HttpEntity<PagedResources<DadoVizinho>> findDadoVizinho(@PathVariable("enderecoPeloSerasaId") java.lang.Integer enderecoPeloSerasaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(enderecoPeloSerasaBusiness.findDadoVizinho(enderecoPeloSerasaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{enderecoPeloSerasaId}/DadoVizinho/{dadoVizinhoId}")    
  public void deleteDadoVizinho(@PathVariable("dadoVizinhoId") java.lang.Integer dadoVizinhoId) throws Exception {
    this.dadoVizinhoBusiness.delete(dadoVizinhoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{enderecoPeloSerasaId}/DadoVizinho")
  public DadoVizinho putDadoVizinho(@Validated @RequestBody final DadoVizinho entity, @PathVariable("enderecoPeloSerasaId") java.lang.Integer enderecoPeloSerasaId) throws Exception {
    return this.dadoVizinhoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{enderecoPeloSerasaId}/DadoVizinho")
  public DadoVizinho postDadoVizinho(@Validated @RequestBody final DadoVizinho entity, @PathVariable("enderecoPeloSerasaId") java.lang.Integer enderecoPeloSerasaId) throws Exception {
    EnderecoPeloSerasa enderecoPeloSerasa = this.enderecoPeloSerasaBusiness.get(enderecoPeloSerasaId);
    entity.setEnderecoPeloSerasa(enderecoPeloSerasa);
    return this.dadoVizinhoBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{enderecoPeloSerasaId}")
  public EnderecoPeloSerasa get(@PathVariable("enderecoPeloSerasaId") java.lang.Integer enderecoPeloSerasaId) throws Exception {
    return enderecoPeloSerasaBusiness.get(enderecoPeloSerasaId);
  }

  /**
   * Foreign Key dadoPessoalSerasa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalSerasa/{dadoPessoalSerasaId}")    
  public HttpEntity<PagedResources<EnderecoPeloSerasa>> findEnderecoPeloSerasasByDadoPessoalSerasa(@PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(enderecoPeloSerasaBusiness.findEnderecoPeloSerasasByDadoPessoalSerasa(dadoPessoalSerasaId, pageable)), HttpStatus.OK);
  }
}
