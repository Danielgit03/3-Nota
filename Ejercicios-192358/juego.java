import java.util.Scanner;
import java.util.Random;
// Daniel Santiago Ostos Urrego - 192358
// Clase base del personaje
class Personaje {
    String nombre;
    int fuerza;
    int vida_hp;
    int ataqueEspecial;
    int contRecuperar = 3;
    boolean defendiendo = false; // Cambiado a false para no defender por defecto
    int contEspecial = 3;
    
    // Constructor
    public Personaje(String nombre, int fuerza, int vida_hp, int ataqueEspecial) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida_hp = vida_hp;
        this.ataqueEspecial = ataqueEspecial;
    }

    // Método para mostrar estadísticas del personaje
    public void mostrarEstadisticas() {
        System.out.println(" ");
        System.out.println(nombre + "  Fuerza: " + fuerza + "  Vida:  " + vida_hp + "    Recuperaciones restantes:   " + contRecuperar + "     Ataques especiales restantes: " + contEspecial);
        System.out.println(" ");
    }

    // Método para atacar al enemigo
    public void atacar(Personaje enemigo) {
        enemigo.recibirDaño(fuerza);
       
    }

    // Método para recibir daño
    public void recibirDaño(int daño) {
        if (defendiendo) {
            daño = calcularDañoReducido(daño); // Reducir el daño si está defendiendo
            defendiendo = false; // Termina la defensa después del ataque
        }
      
        vida_hp -= daño;
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño. Vida restante: " + vida_hp);
      
        
        if (vida_hp < 0) {
            vida_hp = 0;
        }
    }

    // Método para calcular daño reducido (por ejemplo, en caso de defensa)
    public int calcularDañoReducido(int daño) {
        return daño;
    }

    // Método para realizar un ataque especial
    public void ataqueEspecial(Personaje enemigo) {
       
        if (contEspecial > 0) {
            int dañoEspecial = ataqueEspecial;
            enemigo.recibirDaño(dañoEspecial);
            contEspecial--;
            System.out.println(nombre + " ha realizado un ataque especial ha " +enemigo.nombre+" causando " + dañoEspecial + " puntos de daño.");
        } else {
            System.out.println(nombre + " ya no puedes lanzar más ataques especiales.");
        }
    }

    // Método para defenderse
    public void defender() {
        System.out.println(nombre + " se está defendiendo. El próximo ataque recibirá menos daño.");
        defendiendo = true;
    }

    // Método para verificar si el personaje sigue vivo
    public boolean estarVivo() {
        return vida_hp > 0;
    }

    // Método para curarse
    public void Curarse() {
       
    }

    // Método estático para procesar el turno de un personaje
    public static void procesarTurno(Personaje personaje, Personaje enemigo, Scanner scan) {
        System.out.println("Turno de " + personaje.nombre);
        System.out.println(" ");
        System.out.println("1. Atacar");
        System.out.println("2. Cubrirse");
        System.out.println("3. Curarse");
        System.out.println("4. Ataque Especial");
        
        int opcion = scan.nextInt();
    
        switch (opcion) {
            case 1:
                personaje.atacar(enemigo);
                break;
            case 2:
                personaje.defender();
                break;
            case 3:
                personaje.Curarse();
                break;
            case 4:
                personaje.ataqueEspecial(enemigo);
                break;
            default:
                System.out.println("Acción no válida. Pierdes tu turno.");
                break;
        }
    }
}

// Subclase SuperHero
class SuperHero extends Personaje {
    public SuperHero(String nombre, int fuerza, int vida_hp, int ataqueEspecial) {
        super(nombre, fuerza, vida_hp, ataqueEspecial);
    }

    @Override
    public int calcularDañoReducido(int daño) {
        return (int) (daño * 0.2); // Reduce el daño en un 80%

      
    }

    @Override
    public void Curarse() {
        if (contRecuperar > 0) {
            int curarHp = 50;
            vida_hp += curarHp;
            contRecuperar--;
            System.out.println(nombre + " ha recuperado " + curarHp + " puntos de vida. Vida actual: " + vida_hp);
            System.out.println("Recuperaciones restantes: " + contRecuperar);
        } else {
            System.out.println(nombre + " ya no puede recuperar más vida.");
        }
    }
}

// Subclase Villano
class Villano extends Personaje {
    public Villano(String nombre, int fuerza, int vida_hp, int ataqueEspecial) {
        super(nombre, fuerza, vida_hp, ataqueEspecial);
    }

    @Override
    public int calcularDañoReducido(int daño) {
        return (int) (daño * 0.6); // Reduce el daño en un 40%

    }

    @Override
    public void Curarse() {
        if (contRecuperar > 0) {
            int curarHp = 30;
            vida_hp += curarHp;
            contRecuperar--;
            System.out.println(nombre + " ha recuperado " + curarHp + " puntos de vida. Vida actual: " + vida_hp);
            System.out.println("Recuperaciones restantes: " + contRecuperar);
        } else {
            System.out.println(nombre + " ya no puede recuperar más vida.");
        }
}

// Clase principal del juego
public class juego {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Crear personajes disponibles
        SuperHero[] heroes = {
            new SuperHero("Goku", 80, 400, 100),
            new SuperHero("Vegeta", 70, 380, 130),
            new SuperHero("Gohan", 65, 390, 125)
        };

        Villano[] villanos = {
            new Villano("Freezer", 90, 400, 120),
            new Villano("Cell", 100, 550, 140),
            new Villano("Majin Buu", 40, 350, 180)
        };

        // Menú de selección de personajes
        System.out.println("DRAGON BALL DOKKAN BATTLE");
        System.out.println(" ");
        System.out.println("Selecciona tu héroe:");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println((i + 1) + ". " + heroes[i].nombre);
        }

        int eleccionHeroe = scan.nextInt() - 1;
        SuperHero heroe = heroes[eleccionHeroe];

        System.out.println("Selecciona tu villano:");
        for (int i = 0; i < villanos.length; i++) {
            System.out.println((i + 1) + ". " + villanos[i].nombre);
        }

        int eleccionVillano = scan.nextInt() - 1;
        Villano villano = villanos[eleccionVillano];

        System.out.println(heroe.nombre);
        heroe.mostrarEstadisticas();
        System.out.println(" ");
        System.out.println(villano.nombre);
        villano.mostrarEstadisticas();
        System.out.println(" ");

        // Determinar quién comienza                                           // 
        boolean turnoHeroe = random.nextBoolean();
        System.out.println("Comienza el combate con " + (turnoHeroe ? heroe.nombre : villano.nombre));
        System.out.println(" ");

        // Ciclo de combate
        while (heroe.estarVivo() && villano.estarVivo()) {
            if (turnoHeroe) {
                Personaje.procesarTurno(heroe, villano, scan);
            } else {
                Personaje.procesarTurno(villano, heroe, scan);
            }
            turnoHeroe = !turnoHeroe; // Cambia el turno

            // Mostrar estadísticas después de cada turno
            heroe.mostrarEstadisticas();
            villano.mostrarEstadisticas();
        }

        // Mostrar el ganador
        if (heroe.vida_hp > 0) {
            System.out.println(heroe.nombre + " HA GANADOO !");
        } else {
            System.out.println(villano.nombre + " HA GANADO !");
        }

        scan.close(); // Cerrar el scanner para evitar fugas de memoria
    }
}
}








