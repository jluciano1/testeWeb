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
 * Controller para expor serviços REST de TelefonePeloSerasa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/itv/TelefonePeloSerasa")
public class TelefonePeloSerasaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TelefonePeloSerasaBusiness")
  private TelefonePeloSerasaBusiness telefonePeloSerasaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public TelefonePeloSerasa post(@Validated @RequestBody final TelefonePeloSerasa entity) throws Exception {
    return telefonePeloSerasaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public TelefonePeloSerasa put(@Validated @RequestBody final TelefonePeloSerasa entity) throws Exception {
    return telefonePeloSerasaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{telefonePeloSerasaId}")
  public TelefonePeloSerasa put(@Validated @RequestBody final TelefonePeloSerasa entity, @PathVariable("telefonePeloSerasaId") java.lang.Integer telefonePeloSerasaId) throws Exception {
    return telefonePeloSerasaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{telefonePeloSerasaId}")
  public void delete(@PathVariable("telefonePeloSerasaId") java.lang.Integer telefonePeloSerasaId) throws Exception {
    telefonePeloSerasaBusiness.delete(telefonePeloSerasaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<TelefonePeloSerasa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(telefonePeloSerasaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{telefonePeloSerasaId}")
  public TelefonePeloSerasa get(@PathVariable("telefonePeloSerasaId") java.lang.Integer telefonePeloSerasaId) throws Exception {
    return telefonePeloSerasaBusiness.get(telefonePeloSerasaId);
  }

  /**
   * Foreign Key dadoPessoalSerasa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/DadoPessoalSerasa/{dadoPessoalSerasaId}")    
  public HttpEntity<PagedResources<TelefonePeloSerasa>> findTelefonePeloSerasasByDadoPessoalSerasa(@PathVariable("dadoPessoalSerasaId") java.lang.Integer dadoPessoalSerasaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(telefonePeloSerasaBusiness.findTelefonePeloSerasasByDadoPessoalSerasa(dadoPessoalSerasaId, pageable)), HttpStatus.OK);
  }
}
