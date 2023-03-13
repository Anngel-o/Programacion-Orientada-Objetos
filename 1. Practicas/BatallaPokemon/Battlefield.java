package BatallaPokemon;

public class Battlefield {
    public static void main(String[] args) {
        Pokemon charizard = new Charizard(new FlameThrower(), "Charizard");
        charizard.fight();

        Pokemon venusaur = new Venusaur(new GermBomb(), "Venusaur");
        venusaur.fight();

        Pokemon blastoise = new Blastoise(new WaterJet(), "Blastoise");
        blastoise.fight();
    }
}
