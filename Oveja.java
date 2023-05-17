package Gatitolanyia;

public class Oveja extends Animales {
  private boolean material;
  
  Oveja(String nombre, String raza){
    super(nombre, raza, "beee", "Yiyo");
  }

  @Override
  public void info(){
  System.out.println(dueño + " es la amiga de " + name + " la " + especie);
  }
  
  public void ropa(boolean lana){
    this.material = lana;
      
    if(lana == true){
      System.out.println("Vamos a hacer una bufanda");
    }else{
      System.out.println("Hay que esperar a que la " + especie + " tenga lana");
    }
  }
}
