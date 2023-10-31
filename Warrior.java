public class Warrior extends Character implements Movable {
    public Warrior(String name, int capacity) {
        super(name, "Warrior", capacity);
        this.life = 100;
        this.agility = 8;
        this.strength = 10;
        this.wit = 3;
        System.out.println(this.name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) {
        if (weapon == "sword" || weapon == "hammer") {
            System.out.println(this.name + ": Rrrrrrrrr....");
            System.out.println(this.name + ": I'll crush you with my " + weapon + "!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right like a bad boy.");
    }

    public void moveLeft() {
        System.out.println(this.name + ": moves left like a bad boy.");
    }

    public void moveForward() {
        System.out.println(this.name + ": moves forward like a bad boy.");
    }

    public void moveBack() {
        System.out.println(this.name + ": moves back like a bad boy.");
    }
}