import java.util.Random;
public class Alimento extends Entidad {
    // Atributos
    // Constructor
    public Alimento(){
        Random random = new Random();
        this.setId(random.nextInt(99999));
        this.setX(random.nextInt(50));
        this.setY(random.nextInt(50));
    }

    // Getters y Setters

    // toString
    @Override
    public String toString() {
        return "Alimento [id=" + this.getId() + ", x=" + this.getX() + ", y=" + this.getY() + "]";
    }

    public void serComido(Microorganismo microorganismo) {
        // TODO Auto-generated method stub

    }

}
