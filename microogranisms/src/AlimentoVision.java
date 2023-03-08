public class AlimentoVision extends Alimento{
    // Constructor
    public AlimentoVision() {
        super();
    }

    // toString
    @Override
    public String toString() {
        return "AlimentoVision [id=" + this.getId() + ", tamano=" + this.getTamano() + ", x=" + this.getX() + ", y=" + this.getY() + "]";
    }
}
