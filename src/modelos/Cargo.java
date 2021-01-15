package modelos;

import modelos.Enums.TipoDeNivel;

public class Cargo {
    private TipoDeNivel nivel;

    public Cargo(TipoDeNivel nivel) {
        this.nivel = nivel;
    }

    public TipoDeNivel getNivel() {
        return nivel;
    }

    public void setNivel(TipoDeNivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "nivel=" + nivel.name() +
                '}';
    }
}



