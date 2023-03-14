import java.util.Random;

public class Mapa {

    Entidad[][] tablero;
    int tamano;


    public Mapa(int tamano) {
        this.tamano = tamano;
        this.tablero = new Entidad[tamano][tamano];
    }
    public void generarJugador(){
        Random random = new Random();
        int x = random.nextInt(this.tamano);
        int y = random.nextInt(this.tamano);
        if (this.tablero[x][y] == null) {
            this.tablero[x][y] = new Jugador();
        }
        else{
            generarJugador();
        }
    }
    public void generarNPC(){
        Random random = new Random();
        int x = random.nextInt(this.tamano);
        int y = random.nextInt(this.tamano);
        if (this.tablero[x][y] == null) {
            this.tablero[x][y] = new NPC();
        }
    }
    public void generarAlimentoEnergia(){
        Random random = new Random();
        int x = random.nextInt(this.tamano);
        int y = random.nextInt(this.tamano);
        if (this.tablero[x][y] == null) {
            this.tablero[x][y] = new AlimentoEnergia();
        }
        else{
            generarAlimentoEnergia();
        }
    }
    public void generarAlimentoVelocidad(){
        Random random = new Random();
        int x = random.nextInt(this.tamano);
        int y = random.nextInt(this.tamano);
        if (this.tablero[x][y] == null) {
            this.tablero[x][y] = new AlimentoVelocidad();
        }
        else{
            generarAlimentoVelocidad();
        }
    }
    public void generarAlimentoVision(){
        Random random = new Random();
        int x = random.nextInt(this.tamano);
        int y = random.nextInt(this.tamano);
        if (this.tablero[x][y] == null) {
            this.tablero[x][y] = new AlimentoVision();
        }
        else{
            generarAlimentoVision();
        }
    }

    public void generarMapa(){
        generarJugador();
        for (int i = 0; i < 250; i++) {
            generarNPC();
        }
        for (int i = 0; i < 250; i++) {
            generarAlimentoEnergia();
        }
        for (int i = 0; i < 250; i++) {
            generarAlimentoVelocidad();
        }
        for (int i = 0; i < 250; i++) {
            generarAlimentoVision();
        }
    }
    public void imprimirMapa(){
        for (int i = 0; i < this.tamano; i++) {
            for (int j = 0; j < this.tamano; j++) {
                if (this.tablero[i][j] == null) {
                    System.out.print(" 0 ");
                }
                else{
                    System.out.print(" " + this.tablero[i][j].getClass()+ " ");
                }
            }
            System.out.println();
        }
    }

}
