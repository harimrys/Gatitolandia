package Gatitolanyia;

public class Cerdito extends Animales {

private String color;
private String comoEs;

  
Cerdito(String nombre, String raza){
  super(nombre, raza, "oink oink", "Yiyo");
}

@Override
public void info(){
  System.out.println(dueño + " es la amiga de " + name + " el " + especie);
}

public void descripcion(String color, String comoEs){
  System.out.println(especie + " es de color " + color + " y es " + comoEs);
  }
}
