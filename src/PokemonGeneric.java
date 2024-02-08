public class PokemonGeneric {

    private String special;
    private String defence;
    public String name;
    int hp;
    int height;
    int weight;
    String food;
    String attack;
    PokemonGeneric(String special, String defence, String name, int hp, int height, String food, String attack) {
        this.special = special;
        this.defence = defence;
        this.name = name;
        this.hp = hp;
        this.height = height;
        this.food = food;
        this.attack = attack;
    }

    public void attack(String move) {
        System.out.println(name + " used " + move + "!");
    }

    public void heal(int amount) {
        System.out.println(name + " healed for " + amount + " health points!");
    }


    public String getName() {
        return name;
    }

    String getAttack() {
        return attack;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    void setXP(int xp) {
        this.xp = xp;
    }

    public defenceNow() {
        this.xp = xp;
    }

}



