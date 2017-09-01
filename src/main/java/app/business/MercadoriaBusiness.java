package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.MercadoriaDAO;
import app.entity.Mercadoria;

@Service("MercadoriaBusiness")
public class MercadoriaBusiness {

  @Autowired
  @Qualifier("MercadoriaDAO")
  protected MercadoriaDAO repository;

  public Mercadoria post(final Mercadoria entity) throws Exception {
    Mercadoria result = repository.save(entity);
    return result;
  }
  
  public Page<Mercadoria> list(Pageable pageable){
    Page<Mercadoria> result = repository.list(pageable);
    return result;
  }
}
