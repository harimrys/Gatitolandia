package Gatitolanyia;

public class Gato extends Animales {
  private String animo;
  
  Gato(String nombre, String raza){
    super(nombre, raza, "rrrw", "Bapa");
  }

  public void cazar(boolean raton){ 
    if(raton == true){
      System.out.println("Oh no! " + name + " ha cazado un raton");
    }else{
      System.out.println("Se oyen ratones en el jardin");
    } 
  }

  public void estado(String jugar){
    this.animo = jugar;
    
    if(animo.contains("feliz")){
      System.out.println(name + " esta "+ animo + " así que esta haciendo la croqueta");
    }else{
      System.out.println(name + " esta " + animo + " asi que no hace nada");
    }
  }
}
