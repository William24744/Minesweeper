import java.util.InputMismatchException;
import java.util.Scanner;
public class Userinterface {
    public static void main(String[] args) {
        Methods game = new Methods();
        int x;
        int y;
        int z;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Minesweeper. Put a flag on all of the mines to win.");
        while (true) {
            game.showMap();
            try {
                System.out.println("Coordinates of where you want to place/remove flag or reveal space");
                System.out.println("Enter an x position");
                x = in.nextInt();
                if (x > 9 || x < 0) {
                    System.out.println("Error: Space does not exist.");
                }
                System.out.println("Enter a y position");
                y = in.nextInt();
                System.out.println("1:Place/Remove flag or 2:Reveal Space?");
                z = in.nextInt();
                int position = (10*y + x);
                if (z == 1) {
                    game.flag(position);
                } else if (z == 2) {
                    if (game.revealSpace(position) == true) {
                        System.out.println("You lost.");
                        break;
                    }
                } else {
                    System.out.println("Error: Invalid input.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            if (Extra.win(game) == true) {
                System.out.println("You win!");
                break;
            }
        }
        in.close();
        System.exit(0);
    }
}