package com.j2.first;

class TurkeyAdapter implements Duck{
  Turkey turkey;
  public TurkeyAdapter(Turkey turkey){
    this.turkey = turkey;
  }
  public void fly(){
    turkey.fly();
  }
  public void quack(){
    turkey.gobble();
  }
}