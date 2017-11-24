package itv.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import itv.business.ParticipacaoSocietariaBusiness;
import itv.entity.ParticipacaoSocietaria;

/**
 * Controller para expor serviços REST de ParticipacaoSocietaria
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/ParticipacaoSocietaria")
public class ParticipacaoSocietariaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  public ParticipacaoSocietaria post(@Validated @RequestBody final ParticipacaoSocietaria entity) throws Exception {
    return participacaoSocietariaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public ParticipacaoSocietaria put(@Validated @RequestBody final ParticipacaoSocietaria entity) throws Exception {
    return participacaoSocietariaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{participacaoSocietariaId}")
  public ParticipacaoSocietaria put(@Validated @RequestBody final ParticipacaoSocietaria entity, @PathVariable("participacaoSocietariaId") java.lang.Integer participacaoSocietariaId) throws Exception {
    return participacaoSocietariaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{participacaoSocietariaId}")
  public void delete(@PathVariable("participacaoSocietariaId") java.lang.Integer participacaoSocietariaId) throws Exception {
    participacaoSocietariaBusiness.delete(participacaoSocietariaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<ParticipacaoSocietaria>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(participacaoSocietariaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{participacaoSocietariaId}")
  public ParticipacaoSocietaria get(@PathVariable("participacaoSocietariaId") java.lang.Integer participacaoSocietariaId) throws Exception {
    return participacaoSocietariaBusiness.get(participacaoSocietariaId);
  }

  /**
   * Foreign Key dadoPessoalSerasa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalSerasa/{dadoPessoalSerasaId}")    
  public HttpEntity<PagedResources<ParticipacaoSocietaria>> findParticipacaoSocietariasByDadoPessoalSerasa(@PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(participacaoSocietariaBusiness.findParticipacaoSocietariasByDadoPessoalSerasa(dadoPessoalSerasaId, pageable)), HttpStatus.OK);
  }
  
  @RequestMapping(method = RequestMethod.GET, value="/Pessoa/{pessoaId}")    
  public HttpEntity<PagedResources<ParticipacaoSocietaria>> findByPessoaId(@PathVariable("pessoaId") java.lang.Integer id, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(participacaoSocietariaBusiness.findByPessoaId(id, pageable)), HttpStatus.OK);
  }
}
