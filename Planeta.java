public class Planeta extends CuerpoCeleste{

    public Planeta(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste luna) {
        if (luna.getTipoCuerpo() == TipoCuerpoCeleste.LUNA)
            return super.addSatelite(luna);
        else
            return false;
    }
}
