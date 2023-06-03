package BatallaPokemon;

public interface Attack {
    abstract void inAttack();
}

class FlameThrower implements Attack{
    FlameThrower() {

    }

    @Override
    public void inAttack() {
        System.out.println("usa Lanzallamas");
    }
}

class WaterJet implements Attack{
    WaterJet() {

    }

    @Override
    public void inAttack() {
        System.out.println("usa Chorro de Agua"); 
    }
}

class SharpBlade implements Attack{
    SharpBlade() {

    }

    @Override
    public void inAttack() {
        System.out.println("usa Hoja Afilada");   
    }
}

class Fly implements Attack{
    Fly() {

    }

    @Override
    public void inAttack() {
        System.out.println("vuela alto y Ataca desde los Cielos");
    }
}

class GermBomb implements Attack{
    GermBomb() {

    }

    @Override
    public void inAttack() {
        System.out.println("usa Bomba Germen"); 
    }
}
