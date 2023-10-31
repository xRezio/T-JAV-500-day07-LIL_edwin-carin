public class Mage extends Character implements Movable {
    public Mage(String name, int capacity) {
        super(name, "Mage", capacity);
        this.life = 70;
        this.agility = 10;
        this.strength = 3;
        this.wit = 10;
        System.out.println(this.name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        if (weapon == "magic" || weapon == "wand") {
            System.out.println(this.name + ": Rrrrrrrrr....");
            System.out.println(this.name + ": Feel the power of my " + weapon + "!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right furtively.");
    }

    public void moveLeft() {
        System.out.println(this.name + ": moves left furtively.");
    }

    public void moveForward() {
        System.out.println(this.name + ": moves forward furtively.");
    }

    public void moveBack() {
        System.out.println(this.name + ": moves back furtively.");
    }
}