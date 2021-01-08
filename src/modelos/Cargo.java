package modelos;

public class Cargo  {
 private String nivel;

    public Cargo(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "nivel='" + nivel + '\'' +
                '}';
    }
}

