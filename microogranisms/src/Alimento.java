import java.util.Random;
public class Alimento extends Entidad {
    // Atributos
    private int tamano;
    private int MAX_TAMANO = 10;
    private int MIN_TAMANO = 1;

    // Constructor
    public Alimento(){
        Random random = new Random();
        this.setId(random.nextInt(99999));
        this.tamano = random.nextInt(MAX_TAMANO + 1);
        this.setX(random.nextInt(50));
        this.setY(random.nextInt(50));
    }

    // Getters y Setters
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getMAX_TAMANO() {
        return MAX_TAMANO;
    }

    public void setMAX_TAMANO(int MAX_TAMANO) {
        this.MAX_TAMANO = MAX_TAMANO;
    }

    public int getMIN_TAMANO() {
        return MIN_TAMANO;
    }

    public void setMIN_TAMANO(int MIN_TAMANO) {
        this.MIN_TAMANO = MIN_TAMANO;
    }

    // toString
    @Override
    public String toString() {
        return "Alimento [id=" + this.getId() + ", tamano=" + tamano + ", x=" + this.getX() + ", y=" + this.getY() + "]";
    }

}
