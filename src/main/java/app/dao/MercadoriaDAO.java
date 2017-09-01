package app.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app.entity.Mercadoria; 

@Repository("MercadoriaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface MercadoriaDAO extends JpaRepository<Mercadoria, java.lang.Integer> {

  @Query("select c from Mercadoria c")
  public Page<Mercadoria> list(Pageable pageable);

}
