import java.util.Random;
public class AlimentoEnergia extends Alimento{
    private int tamano;


    // Constructor
    public AlimentoEnergia() {
        super();
        Random rd = new Random();
        // como solo puede tener 3 tamaños, se le asigna un valor aleatorio entre 1 y 3
        tamano= rd.nextInt(1,4);
    }
    // Getters y Setters
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    // toString
    @Override
    public String toString() {
        return "AlimentoEnergia [id=" + this.getId() + ", tamano=" + this.getTamano() + ", x=" + this.getX() + ", y=" + this.getY() + "]";
    }

    @Override
    public void serComido(Microorganismo microorganismo) {
        microorganismo.setEnergia(microorganismo.getEnergia() + this.getTamano());
    }
}
