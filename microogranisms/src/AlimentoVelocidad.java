public class AlimentoVelocidad extends Alimento{
    // Constructor
    public AlimentoVelocidad() {
        super();
    }

    // toString
    @Override
    public String toString() {
        return "AlimentoVelocidad [id=" + this.getId() + ", x=" + this.getX() + ", y=" + this.getY() + "]";
    }

    // por ahora se le va a aumentar la velocidad en 2 para ejemplificar
    @Override
    public void serComido(Microorganismo microorganismo) {
        microorganismo.setVelocidad(microorganismo.getVelocidad() + 2);
    }

}
