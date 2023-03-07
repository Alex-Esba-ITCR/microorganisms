import java.util.Random;
public class Alimento {
    //Atributos
    private int id;

    public String type;
    private int size;

    private int x;

    private int y;

    //Constructor
    public Alimento() {
        Random random = new Random();
        this.id = random.nextInt(99999);
        this.size = random.nextInt(1,4);
        this.x = random.nextInt(50);
        this.y = random.nextInt(50);
    }

    //Getters y Setters
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getSize() {return size;}

    public void setSize(int size) {this.size = size;}

    public int getX() {return x;}

    public void setX(int x) {
        if (x > 50){
            x = 50;
        }
        if (x < 0){
            x = 0;
        }
        this.x = x;
    }

    public int getY() {return y;}

    public void setY(int y) {
        if (y > 50){
            y = 50;
        }
        if (y < 0){
            y = 0;
        }
        this.y = y;
    }

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public String toString(){
        return "ID: " + this.id + " Size: " + this.size + " X: " + this.x + " Y: " + this.y + " Type: " + this.type;
    }
    /*public static void main(String[] args) {
        Alimento alimentos[] = new Alimento[3];
        alimentos[0] = new AlimentoVelocidad();
        alimentos[1] = new AlimentoEnergia();
        alimentos[2] = new AlimentoVision();

        for (int i = 0; i < alimentos.length; i++) {
            System.out.println(alimentos[i].toString());
        }
    }*/
}
