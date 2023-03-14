import java.util.Random;

public class Entidad {
    // Atributos
    private int id;
    private int x;
    private int y;


    // Constructor
    public Entidad(){
        Random random = new Random();
        this.id = random.nextInt(99999);
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
