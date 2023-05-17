package Gatitolanyia;

class Animales {
  protected String name;
  protected String especie;
  protected String sonido;
  protected String dueño;

//constructor
  Animales(String nombre, String raza, String voz, String amigo){
    this.name = nombre;
    this.especie = raza;
    this.sonido = voz;
    this.dueño = amigo;
  }
//metodo
public void ruido(){
  System.out.println("Cuando " + name + " ve a " + dueño + " hace: ");
  System.out.println(sonido);
}

public void info(){
  System.out.println(dueño + " es el amigo de " + name + " el " + especie);
}

  public static void main(String[] args){

    Animales animal = new Animales ("Bigotes", "gato", "miau", "Yiyo");
    animal.ruido();
    animal.info();

    System.out.println();

    Bapa bapa = new Bapa();
    bapa.ruido();
    bapa.info();
    bapa.mimos();

    System.out.println();

    Gato gato = new Gato("Irgo", "gato");
    gato.ruido();
    gato.info();
    gato.cazar(true);
    gato.cazar(false);
    gato.estado("feliz");
    gato.estado("pensando");

    System.out.println();

    Perro perrito = new Perro("Beleo", "perro");
    perrito.ruido();
    perrito.info();

    System.out.println();
    
    Cerdito cerdo = new Cerdito("Pepa", "cerdito");
    cerdo.ruido();
    cerdo.info();
    cerdo.descripcion("rosa", "rechonchito");

    System.out.println();

    Oveja ovejita = new Oveja("Lanitas", "oveja");
    ovejita.ruido();
    ovejita.info();
    ovejita.ropa(true);

    Oveja ovejita2 = new Oveja("Suavecita", "oveja");
    ovejita2.ropa(false);
  }
}
