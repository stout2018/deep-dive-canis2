package edu.cnm.deepdive.taxonomy;

public class CanisLupus extends Canis {

  @Override
  public void hunt() {
    // TODO Auto-generated method stub
    System.out.println("Hunts animals in packs");
  }
  public void speak() {
    System.out.println("Howl!");
  }
  
  public static void describe() {
    System.out.println("Canis lupus is the species of gray wolves.");
  }
  
}
