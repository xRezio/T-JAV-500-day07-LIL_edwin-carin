import java.util.List;
import java.util.ArrayList;

public class Battalion<T extends Character> {
    private List<T> characters;

    public Battalion() {
        this.characters = new ArrayList<>();
    }

    public void add(List<T> newCharacters) {
        characters.addAll(newCharacters);
    }

    public void display() {
        for (T character : characters) {
            System.out.println(character.getName());
        }
    }

    public boolean fight() {
        if (characters.size() < 2) {
            return false;
        }

        T character1 = characters.get(0);
        T character2 = characters.get(1);

        int comparisonResult = character1.compareTo(character2);

        if (comparisonResult > 0) {
            // character1 is the winner, remove character2
            characters.remove(character2);
        } else if (comparisonResult < 0) {
            // character2 is the winner, remove character1
            characters.remove(character1);
        } else {
            // equal, remove both
            characters.remove(character1);
            characters.remove(character2);
        }

        return true;
    }
}
