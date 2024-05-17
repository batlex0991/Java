public class App {
    public static void main(String[] args) throws Exception {
        // Personaje personaje = new Personaje();

        /* Imprimir valores de inicio */
        // System.out.println(personaje.nombre);
        // System.out.println(personaje.fuerza);
        // System.out.println(personaje.inteligencia);
        // System.out.println(personaje.defensa);
        // System.out.println(personaje.vida);

        /* Cambiar valores del personaje */
        // System.out.println(personaje.nombre = "modificado");

        // Pasar argumentos al constructor
        Personaje personaje = new Personaje("Big Boss", 10, 1, 5, 100);
        Personaje enemigo = new Personaje("Enemigo", 8, 5, 3, 5);

        /* Mostrar todos los argumentos de la clase uno por uno */
        // System.out.println(personaje.nombre);
        // System.out.println(personaje.fuerza);
        // System.out.println(personaje.inteligencia);
        // System.out.println(personaje.defensa);
        // System.out.println(personaje.vida);

        /* Mostrar ATRIBUTOS del objeto */
        personaje.atributos();
        enemigo.atributos();

        /* subir de nivel al personaje */
        // personaje.subirNivel(10, 5, 15);
        // personaje.atributos();

        /* Validar si está vivo el personaje */
        // System.out.println(personaje.estaVivo());

        /* Validar si el personaje está muerto */
        // personaje.estaMuerto();
        // personaje.atributos();

        /* Dañar al enemigo */
        // System.out.println(personaje.daniar(enemigo));

        /* Atacar al enemigo */
        personaje.atacar(enemigo);
        enemigo.atributos();

    }
}
