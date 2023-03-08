public class Simulacion {
    public static void main(String[] args) {
        NPC npc = new NPC();
        Jugador jugador = new Jugador();
        AlimentoEnergia alimentoEnergia = new AlimentoEnergia();
        AlimentoVelocidad alimentoVelocidad = new AlimentoVelocidad();
        AlimentoVision alimentoVision = new AlimentoVision();
        Entidad[] entidades = new Entidad[5];
        entidades[0] = npc;
        entidades[1] = jugador;
        entidades[2] = alimentoEnergia;
        entidades[3] = alimentoVelocidad;
        entidades[4] = alimentoVision;
        for (Entidad entidad : entidades) {
            System.out.println();
        }

    }
}
