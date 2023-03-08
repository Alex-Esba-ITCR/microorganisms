public class AlimentoEnergia extends Alimento{
    // Constructor
    public AlimentoEnergia() {
        super();
    }

    // toString
    @Override
    public String toString() {
        return "AlimentoEnergia [id=" + this.getId() + ", tamano=" + this.getTamano() + ", x=" + this.getX() + ", y=" + this.getY() + "]";
    }

}
