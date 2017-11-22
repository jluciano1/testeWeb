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
 * Controller para expor serviços REST de DadoPessoalSerasa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/DadoPessoalSerasa")
public class DadoPessoalSerasaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DadoPessoalSerasaBusiness")
  private DadoPessoalSerasaBusiness dadoPessoalSerasaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("EnderecoPeloSerasaBusiness")
  private EnderecoPeloSerasaBusiness enderecoPeloSerasaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("TelefonePeloSerasaBusiness")
  private TelefonePeloSerasaBusiness telefonePeloSerasaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("ParticipacaoSocietariaBusiness")
  private ParticipacaoSocietariaBusiness participacaoSocietariaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public DadoPessoalSerasa post(@Validated @RequestBody final DadoPessoalSerasa entity) throws Exception {
    return dadoPessoalSerasaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public DadoPessoalSerasa put(@Validated @RequestBody final DadoPessoalSerasa entity) throws Exception {
    return dadoPessoalSerasaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{dadoPessoalSerasaId}")
  public DadoPessoalSerasa put(@Validated @RequestBody final DadoPessoalSerasa entity, @PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    return dadoPessoalSerasaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{dadoPessoalSerasaId}")
  public void delete(@PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    dadoPessoalSerasaBusiness.delete(dadoPessoalSerasaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<DadoPessoalSerasa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(dadoPessoalSerasaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalSerasaId}/EnderecoPeloSerasa")    
  public HttpEntity<PagedResources<EnderecoPeloSerasa>> findEnderecoPeloSerasa(@PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalSerasaBusiness.findEnderecoPeloSerasa(dadoPessoalSerasaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalSerasaId}/EnderecoPeloSerasa/{enderecoPeloSerasaId}")    
  public void deleteEnderecoPeloSerasa(@PathVariable("enderecoPeloSerasaId") java.lang.Integer enderecoPeloSerasaId) throws Exception {
    this.enderecoPeloSerasaBusiness.delete(enderecoPeloSerasaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalSerasaId}/EnderecoPeloSerasa")
  public EnderecoPeloSerasa putEnderecoPeloSerasa(@Validated @RequestBody final EnderecoPeloSerasa entity, @PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    return this.enderecoPeloSerasaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalSerasaId}/EnderecoPeloSerasa")
  public EnderecoPeloSerasa postEnderecoPeloSerasa(@Validated @RequestBody final EnderecoPeloSerasa entity, @PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    DadoPessoalSerasa dadoPessoalSerasa = this.dadoPessoalSerasaBusiness.get(dadoPessoalSerasaId);
    entity.setDadoPessoalSerasa(dadoPessoalSerasa);
    return this.enderecoPeloSerasaBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalSerasaId}/TelefonePeloSerasa")    
  public HttpEntity<PagedResources<TelefonePeloSerasa>> findTelefonePeloSerasa(@PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalSerasaBusiness.findTelefonePeloSerasa(dadoPessoalSerasaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalSerasaId}/TelefonePeloSerasa/{telefonePeloSerasaId}")    
  public void deleteTelefonePeloSerasa(@PathVariable("telefonePeloSerasaId") java.lang.Integer telefonePeloSerasaId) throws Exception {
    this.telefonePeloSerasaBusiness.delete(telefonePeloSerasaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalSerasaId}/TelefonePeloSerasa")
  public TelefonePeloSerasa putTelefonePeloSerasa(@Validated @RequestBody final TelefonePeloSerasa entity, @PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    return this.telefonePeloSerasaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalSerasaId}/TelefonePeloSerasa")
  public TelefonePeloSerasa postTelefonePeloSerasa(@Validated @RequestBody final TelefonePeloSerasa entity, @PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    DadoPessoalSerasa dadoPessoalSerasa = this.dadoPessoalSerasaBusiness.get(dadoPessoalSerasaId);
    entity.setDadoPessoalSerasa(dadoPessoalSerasa);
    return this.telefonePeloSerasaBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dadoPessoalSerasaId}/ParticipacaoSocietaria")    
  public HttpEntity<PagedResources<ParticipacaoSocietaria>> findParticipacaoSocietaria(@PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dadoPessoalSerasaBusiness.findParticipacaoSocietaria(dadoPessoalSerasaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dadoPessoalSerasaId}/ParticipacaoSocietaria/{participacaoSocietariaId}")    
  public void deleteParticipacaoSocietaria(@PathVariable("participacaoSocietariaId") java.lang.Integer participacaoSocietariaId) throws Exception {
    this.participacaoSocietariaBusiness.delete(participacaoSocietariaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dadoPessoalSerasaId}/ParticipacaoSocietaria")
  public ParticipacaoSocietaria putParticipacaoSocietaria(@Validated @RequestBody final ParticipacaoSocietaria entity, @PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    return this.participacaoSocietariaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dadoPessoalSerasaId}/ParticipacaoSocietaria")
  public ParticipacaoSocietaria postParticipacaoSocietaria(@Validated @RequestBody final ParticipacaoSocietaria entity, @PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    DadoPessoalSerasa dadoPessoalSerasa = this.dadoPessoalSerasaBusiness.get(dadoPessoalSerasaId);
    entity.setDadoPessoalSerasa(dadoPessoalSerasa);
    return this.participacaoSocietariaBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{dadoPessoalSerasaId}")
  public DadoPessoalSerasa get(@PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId) throws Exception {
    return dadoPessoalSerasaBusiness.get(dadoPessoalSerasaId);
  }
}
