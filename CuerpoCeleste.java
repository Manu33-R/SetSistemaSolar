import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    public enum TipoCuerpoCeleste{ESTRELLA,PLANETA,PLANETA_ENANO,LUNA,COMETA,ASTEROIDE};
    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        this.satelites = new HashSet<>();
    }

    public boolean addSatelite(CuerpoCeleste cc){
        if (satelites.add(cc))
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Objects.equals(nombre, that.nombre) && tipoCuerpo == that.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipoCuerpo);
    }

    @Override
    public String toString() {
        return nombre + ": Tipo: " + tipoCuerpo +
                " Periodo orbital: " + periodoOrbital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(double periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public void setTipoCuerpo(TipoCuerpoCeleste tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return this.satelites;
    }

    public void setSatelites(Set<CuerpoCeleste> satelites) {
        this.satelites = satelites;
    }
}
