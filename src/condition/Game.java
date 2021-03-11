package condition;

public class Game {

    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equalsIgnoreCase("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equalsIgnoreCase("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
