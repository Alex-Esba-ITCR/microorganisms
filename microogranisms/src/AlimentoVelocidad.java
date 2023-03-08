public class AlimentoVelocidad extends Alimento{
    // Constructor
    public AlimentoVelocidad() {
        super();
    }

    // toString
    @Override
    public String toString() {
        return "AlimentoVelocidad [id=" + this.getId() + ", tamano=" + this.getTamano() + ", x=" + this.getX() + ", y=" + this.getY() + "]";
    }

}
