package Gatitolanyia;

public class Bapa extends Animales {
  
  Bapa(){
  super("Bapa", "humanoide", "te quieo pico", "Yiyo");
  }
  
  public void mimos(){
    System.out.println("mimos quieo mimos " + dueño);
  }

@Override
  public void ruido(){
    System.out.println("Cuando " + name + " ve a " + dueño + " dice: ");
    System.out.println(sonido);
  }
  public void info(){
    System.out.println(dueño + " es la novia de " + name + " el " + especie);
  }
}
