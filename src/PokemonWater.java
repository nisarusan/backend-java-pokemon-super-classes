public class PokemonWater {
    private int waterStrength;
    private int defense;


    private String special;
    private String defence;
    public String name;
    int hp;
    int height;
    int weight;
    String food;
    String attack;

    PokemonWater(String name, String defence, int hp, int height, int weight, String food, String attack, int waterStrength, int defense) {
        super(name,defence,hp,weight,food,attack);
        this.waterStrength =waterStrength;
        this.defense =defense;
    }


}