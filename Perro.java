package Gatitolanyia;

public class Perro extends Animales {

//metodo que cambia algunos parametros solo del metodo de Animales
  Perro(String nombre, String raza){
    super(nombre, raza, "Guau guau", "Bapi");
  }

//para cambiar algo de un metodo que solo afecte a esta clase
  @Override
  public void ruido(){
  System.out.println("Cuando " + name + " ve a " + dueño + " hace: ");
  System.out.println(sonido);
  System.out.println(name + " quiere mucho a " + dueño);
  }
}
