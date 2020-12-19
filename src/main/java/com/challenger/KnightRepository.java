package com.challenger;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Sort;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KnightRepository implements PanacheMongoRepository<Knight> {

  public Knight findByName(String name){
    return find("name", name).firstResult();
  }

  public List<Knight> findOrderedByName(){
    return findAll(Sort.by("name")).list();
  }

}
