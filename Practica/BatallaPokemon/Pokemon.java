package BatallaPokemon;

public abstract class Pokemon {
    Attack attack;
    String name;

    Pokemon(Attack attack, String name) {
        this.attack = attack;
        this.name = name;
    }

    void otherAttack(Attack attack) {
        this.attack = attack;
    }

    abstract void fight();
}

class Charizard extends Pokemon implements Fire, Flying{
    Charizard(Attack attack, String name) {
        super(attack, name);
        System.out.println(name + " yo te elijo");
    }

    @Override
    public void fight() {
        System.out.println("Es turno de " + name);
        attack.inAttack();
    }
}

class Venusaur extends Pokemon implements Grass, Poison{
    Venusaur(Attack attack, String name) {
        super(attack, name);
        System.out.println(name + " yo te elijo");
    }

    @Override
    public void fight() {
        System.out.println("Es turno de " + name);
        attack.inAttack();
    }
}

class Blastoise extends Pokemon implements Water{
    Blastoise(Attack attack, String name) {
        super(attack, name);
        System.out.println(name + " yo te elijo");
    }

    @Override
    public void fight() {
        System.out.println("Es turno de " + name);
        attack.inAttack();
    }
}
