import java.util.Random;

public class Microorganismo extends Entidad{
    // Atributos
    private int energia;
    private int vision;
    private int velocidad;
    private int edad;
    private int MAX_ENERGIA = 100;
    private int MAX_VISION = 5;
    private int MAX_VELOCIDAD = 10;
    private int MAX_EDAD = 20;
    private int MIN_ENERGIA = 0;
    private int MIN_VISION = 1;
    private int MIN_VELOCIDAD = 1;
    private int MIN_EDAD = 0;

    // Constructor
    public Microorganismo(){
        Random random = new Random();
        this.setId(random.nextInt(99999));
        this.energia = 50;
        this.vision = MIN_VISION;
        this.velocidad = MIN_VELOCIDAD;
        this.setX(random.nextInt(50));
        this.setY(random.nextInt(50));
    }

    // Getters y Setters
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia > MAX_ENERGIA){
            energia = MAX_ENERGIA;
        }
        if (energia < MIN_ENERGIA){
            energia = MIN_ENERGIA;
        }
        this.energia = energia;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        if (vision > MAX_VISION){
            vision = MAX_VISION;
        }
        if (vision < MIN_VISION){
            vision = MIN_VISION;
        }
        this.vision = vision;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad > MAX_VELOCIDAD){
            velocidad = MAX_VELOCIDAD;
        }
        if (velocidad < MIN_VELOCIDAD){
            velocidad = MIN_VELOCIDAD;
        }
        this.velocidad = velocidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > MAX_EDAD){
            edad = MAX_EDAD;
        }
        if (edad < MIN_EDAD){
            edad = MIN_EDAD;
        }
        this.edad = edad;
    }

    public int getMAX_ENERGIA() {
        return MAX_ENERGIA;
    }

    public void setMAX_ENERGIA(int MAX_ENERGIA) {
        this.MAX_ENERGIA = MAX_ENERGIA;
    }

    public int getMAX_VISION() {
        return MAX_VISION;
    }

    public void setMAX_VISION(int MAX_VISION) {
        this.MAX_VISION = MAX_VISION;
    }

    public int getMAX_VELOCIDAD() {
        return MAX_VELOCIDAD;
    }

    public void setMAX_VELOCIDAD(int MAX_VELOCIDAD) {
        this.MAX_VELOCIDAD = MAX_VELOCIDAD;
    }

    public int getMAX_EDAD() {
        return MAX_EDAD;
    }

    public void setMAX_EDAD(int MAX_EDAD) {
        this.MAX_EDAD = MAX_EDAD;
    }

    public int getMIN_ENERGIA() {
        return MIN_ENERGIA;
    }

    public void setMIN_ENERGIA(int MIN_ENERGIA) {
        this.MIN_ENERGIA = MIN_ENERGIA;
    }

    public int getMIN_VISION() {
        return MIN_VISION;
    }

    public void setMIN_VISION(int MIN_VISION) {
        this.MIN_VISION = MIN_VISION;
    }

    public int getMIN_VELOCIDAD() {
        return MIN_VELOCIDAD;
    }

    public void setMIN_VELOCIDAD(int MIN_VELOCIDAD) {
        this.MIN_VELOCIDAD = MIN_VELOCIDAD;
    }

    public int getMIN_EDAD() {
        return MIN_EDAD;
    }

    public void setMIN_EDAD(int MIN_EDAD) {
        this.MIN_EDAD = MIN_EDAD;
    }

    // toString
    @Override
    public String toString() {
        return "MicroorganismosNPC{" +
                "id=" + getId() +
                ", energia=" + energia +
                ", vision=" + vision +
                ", velocidad=" + velocidad +
                ", edad=" + edad +
                ", MAX_ENERGIA=" + MAX_ENERGIA +
                ", MAX_VISION=" + MAX_VISION +
                ", MAX_VELOCIDAD=" + MAX_VELOCIDAD +
                ", MAX_EDAD=" + MAX_EDAD +
                ", MIN_ENERGIA=" + MIN_ENERGIA +
                ", MIN_VISION=" + MIN_VISION +
                ", MIN_VELOCIDAD=" + MIN_VELOCIDAD +
                ", MIN_EDAD=" + MIN_EDAD +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }

    // Métodos
    public void moverse(int direccion){
        Random random = new Random();
        switch (direccion) {
            case 0 -> {
                if (this.getX() + this.getVelocidad() >= 50) {
                    this.setX(this.getX() - random.nextInt(this.getVelocidad() + 1));
                    this.setEnergia(this.getEnergia() - 1);
                    break;
                }
                this.setX(this.getX() + random.nextInt(this.getVelocidad() + 1));
                this.setEnergia(this.getEnergia() - 1);
            }
            case 1 -> {
                if (this.getX() - this.getVelocidad() < 0) {
                    this.setX(this.getX() + random.nextInt(this.getVelocidad() + 1));
                    this.setEnergia(this.getEnergia() - 1);
                    break;
                }
                this.setX(this.getX() - random.nextInt(this.getVelocidad() + 1));
                this.setEnergia(this.getEnergia() - 1);
            }
            case 2 -> {
                if (this.getY() + this.getVelocidad() >= 50) {
                    this.setY(this.getY() - random.nextInt(this.getVelocidad() + 1));
                    this.setEnergia(this.getEnergia() - 1);
                    break;
                }
                this.setY(this.getY() + random.nextInt(this.getVelocidad() + 1));
                this.setEnergia(this.getEnergia() - 1);
            }
            case 3 -> {
                if (this.getY() - this.getVelocidad() < 0) {
                    this.setY(this.getY() + random.nextInt(this.getVelocidad() + 1));
                    this.setEnergia(this.getEnergia() - 1);
                    break;
                }
                this.setY(this.getY() - random.nextInt(this.getVelocidad() + 1));
                this.setEnergia(this.getEnergia() - 1);
            }
        }
    }
}
