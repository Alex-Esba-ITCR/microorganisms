public class Jugador extends Microorganismo{
    // Constructor
    public Jugador(){
        super();
        this.setX(24);
        this.setY(24);
    }

    public void comer(Alimento alimento){
        alimento.serComido(this);
    }

    public void moverseIzquierda(){
        this.setX(this.getX() - 1);
    }

    public void moverseDerecha(){
        this.setX(this.getX() + 1);
    }

    public void moverseArriba(){
        this.setY(this.getY() - 1);
    }

    public void moverseAbajo(){
        this.setY(this.getY() + 1);
    }

    // toString
    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + getId() +
                ", energia=" + getEnergia() +
                ", vision=" + getVision() +
                ", velocidad=" + getVelocidad() +
                ", edad=" + getEdad() +
                ", MAX_ENERGIA=" + getMAX_ENERGIA() +
                ", MAX_VISION=" + getMAX_VISION() +
                ", MAX_VELOCIDAD=" + getMAX_VELOCIDAD() +
                ", MAX_EDAD=" + getMAX_EDAD() +
                ", MIN_ENERGIA=" + getMIN_ENERGIA() +
                ", MIN_VISION=" + getMIN_VISION() +
                ", MIN_VELOCIDAD=" + getMIN_VELOCIDAD() +
                ", MIN_EDAD=" + getMIN_EDAD() +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
