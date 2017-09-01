package app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.business.MercadoriaBusiness;
import app.entity.Mercadoria;

@RestController
@RequestMapping(value = "/api/rest/app/Mercadoria")
public class MercadoriaREST {

  @Autowired
  @Qualifier("MercadoriaBusiness")
  private MercadoriaBusiness mercadoriaBusiness;

  @RequestMapping(method = RequestMethod.POST)
  public Mercadoria post(@Validated @RequestBody final Mercadoria entity) throws Exception {
    return mercadoriaBusiness.post(entity);
  }

  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Mercadoria>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(mercadoriaBusiness.list(pageable)), HttpStatus.OK);    
  }

}
