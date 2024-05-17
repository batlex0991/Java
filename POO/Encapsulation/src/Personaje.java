import javax.swing.plaf.TreeUI;

public class Personaje {
    String nombre = "Default";
    int fuerza = 0;
    int inteligencia = 0;
    int defensa = 0;
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    int vida = 0;

    Personaje(String nombre, int fuerza, int inteligencia, int defensa, int vida) {
        // El nombre que tienes(linea 2) cambialo por el nombre que recibas(linea 8)
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.defensa = defensa;
        this.vida = vida;
    }

    // Método que muestre el estado del objeto
    private void atributos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fuerza: " + this.fuerza);
        System.out.println("Inteligencia: " + this.inteligencia);
        System.out.println("Defensa: " + this.defensa);
        System.out.println("Vida: " + this.vida);
        System.out.println(" ");
    }

    public void subirNivel(int fuerza, int inteligencia, int defensa) {
        this.fuerza = this.fuerza + fuerza;
        this.inteligencia = this.inteligencia + inteligencia;
        this.defensa = this.defensa + defensa;
    }

    public boolean estaVivo() {

        if (vida > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void estaMuerto() {
        this.vida = 0;

        System.out.println(this.nombre + " ha muerto");
    }

    public Integer daniar(Personaje enemigo) {
        this.fuerza = this.fuerza - enemigo.defensa;
        return fuerza;
    }

    public void atacar(Personaje enemigo) {
        int danio = this.daniar(enemigo);
        enemigo.vida = enemigo.vida - danio;
        System.out.println(this.nombre + " ha realizado " + danio + " puntos de daño a " + enemigo.nombre);
        if (enemigo.estaVivo()) {
            System.out.println("la vida de " + enemigo.nombre + " es " + enemigo.vida);
        } else {
            enemigo.estaMuerto();
        }

    }

}
