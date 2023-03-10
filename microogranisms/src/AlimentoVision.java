public class AlimentoVision extends Alimento{
    // Constructor
    public AlimentoVision() {
        super();
    }

    // toString
    @Override
    public String toString() {
        return "AlimentoVision [id=" + this.getId() + ", x=" + this.getX() + ", y=" + this.getY() + "]";
    }
    // por ahora se le va a aumentar la vision en 2 para ejemplificar
    @Override
    public void serComido(Microorganismo microorganismo) {
        microorganismo.setVision(microorganismo.getVision() + 2);
    }
}
