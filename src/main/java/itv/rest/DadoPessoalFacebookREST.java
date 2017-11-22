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
 * Controller para expor serviços REST de DadoPessoalFacebook
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/DadoPessoalFacebook")
public class DadoPessoalFacebookREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DadoPessoalFacebookBusiness")
  private DadoPessoalFacebookBusiness dadoPessoalFacebookBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("EducacaoFacebookBusiness")
  private EducacaoFacebookBusiness educacaoFacebookBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("TrabalhoFacebookBusiness")
  private TrabalhoFacebookBusiness trabalhoFacebookBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("MembroFamiliaFacebookBusiness")
  private MembroFamiliaFacebookBusiness membroFamiliaFacebookBusiness;

  /**
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
  public DadoPessoalFacebook post(@Validated @RequestBody final DadoPessoalFacebook entity) throws Exception {
    return dadoPessoalFacebookBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public DadoPessoalFacebook put(@Validated @RequestBody final DadoPessoalFacebook entity) throws Exception {
    return dadoPessoalFacebookBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{dadoPessoalFacebookId}")
  public DadoPessoalFacebook put(@Validated @RequestBody final DadoPessoalFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    return dadoPessoalFacebookBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{dadoPessoalFacebookId}")
  public void delete(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    dadoPessoalFacebookBusiness.delete(dadoPessoalFacebookId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<DadoPessoalFacebook>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(dadoPessoalFacebookBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalFacebookId}/EducacaoFacebook")    
  public HttpEntity<PagedResources<EducacaoFacebook>> findEducacaoFacebook(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalFacebookBusiness.findEducacaoFacebook(dadoPessoalFacebookId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalFacebookId}/EducacaoFacebook/{educacaoFacebookId}")    
  public void deleteEducacaoFacebook(@PathVariable("educacaoFacebookId") java.lang.Integer educacaoFacebookId) throws Exception {
    this.educacaoFacebookBusiness.delete(educacaoFacebookId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalFacebookId}/EducacaoFacebook")
  public EducacaoFacebook putEducacaoFacebook(@Validated @RequestBody final EducacaoFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    return this.educacaoFacebookBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalFacebookId}/EducacaoFacebook")
  public EducacaoFacebook postEducacaoFacebook(@Validated @RequestBody final EducacaoFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    DadoPessoalFacebook dadoPessoalFacebook = this.dadoPessoalFacebookBusiness.get(dadoPessoalFacebookId);
    entity.setDadoPessoalFacebook(dadoPessoalFacebook);
    return this.educacaoFacebookBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalFacebookId}/TrabalhoFacebook")    
  public HttpEntity<PagedResources<TrabalhoFacebook>> findTrabalhoFacebook(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalFacebookBusiness.findTrabalhoFacebook(dadoPessoalFacebookId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalFacebookId}/TrabalhoFacebook/{trabalhoFacebookId}")    
  public void deleteTrabalhoFacebook(@PathVariable("trabalhoFacebookId") java.lang.Integer trabalhoFacebookId) throws Exception {
    this.trabalhoFacebookBusiness.delete(trabalhoFacebookId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalFacebookId}/TrabalhoFacebook")
  public TrabalhoFacebook putTrabalhoFacebook(@Validated @RequestBody final TrabalhoFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    return this.trabalhoFacebookBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalFacebookId}/TrabalhoFacebook")
  public TrabalhoFacebook postTrabalhoFacebook(@Validated @RequestBody final TrabalhoFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    DadoPessoalFacebook dadoPessoalFacebook = this.dadoPessoalFacebookBusiness.get(dadoPessoalFacebookId);
    entity.setDadoPessoalFacebook(dadoPessoalFacebook);
    return this.trabalhoFacebookBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalFacebookId}/MembroFamiliaFacebook")    
  public HttpEntity<PagedResources<MembroFamiliaFacebook>> findMembroFamiliaFacebook(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalFacebookBusiness.findMembroFamiliaFacebook(dadoPessoalFacebookId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalFacebookId}/MembroFamiliaFacebook/{membroFamiliaFacebookId}")    
  public void deleteMembroFamiliaFacebook(@PathVariable("membroFamiliaFacebookId") java.lang.Integer membroFamiliaFacebookId) throws Exception {
    this.membroFamiliaFacebookBusiness.delete(membroFamiliaFacebookId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalFacebookId}/MembroFamiliaFacebook")
  public MembroFamiliaFacebook putMembroFamiliaFacebook(@Validated @RequestBody final MembroFamiliaFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    return this.membroFamiliaFacebookBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalFacebookId}/MembroFamiliaFacebook")
  public MembroFamiliaFacebook postMembroFamiliaFacebook(@Validated @RequestBody final MembroFamiliaFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    DadoPessoalFacebook dadoPessoalFacebook = this.dadoPessoalFacebookBusiness.get(dadoPessoalFacebookId);
    entity.setDadoPessoalFacebook(dadoPessoalFacebook);
    return this.membroFamiliaFacebookBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalFacebookId}/AcontecimentoFacebook")    
  public HttpEntity<PagedResources<AcontecimentoFacebook>> findAcontecimentoFacebook(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalFacebookBusiness.findAcontecimentoFacebook(dadoPessoalFacebookId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalFacebookId}/AcontecimentoFacebook/{acontecimentoFacebookId}")    
  public void deleteAcontecimentoFacebook(@PathVariable("acontecimentoFacebookId") java.lang.Integer acontecimentoFacebookId) throws Exception {
    this.acontecimentoFacebookBusiness.delete(acontecimentoFacebookId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalFacebookId}/AcontecimentoFacebook")
  public AcontecimentoFacebook putAcontecimentoFacebook(@Validated @RequestBody final AcontecimentoFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    return this.acontecimentoFacebookBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalFacebookId}/AcontecimentoFacebook")
  public AcontecimentoFacebook postAcontecimentoFacebook(@Validated @RequestBody final AcontecimentoFacebook entity, @PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    DadoPessoalFacebook dadoPessoalFacebook = this.dadoPessoalFacebookBusiness.get(dadoPessoalFacebookId);
    entity.setDadoPessoalFacebook(dadoPessoalFacebook);
    return this.acontecimentoFacebookBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{dadoPessoalFacebookId}")
  public DadoPessoalFacebook get(@PathVariable("dadoPessoalFacebookId") java.lang.Integer dadoPessoalFacebookId) throws Exception {
    return dadoPessoalFacebookBusiness.get(dadoPessoalFacebookId);
  }
}
