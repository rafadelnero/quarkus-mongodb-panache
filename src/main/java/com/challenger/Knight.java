package com.challenger;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Knight extends PanacheMongoEntity {

  public String name;
  public String swordName;

  public Knight() {

  }

  public Knight(String name, String swordName) {
    this.name = name;
    this.swordName = swordName;
  }
}
