import java.util.InputMismatchException;
import java.util.Scanner;
public class Userinterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int z;
        Methods game = null;
        boolean l = true;
        System.out.println("Welcome to Minesweeper. Put a flag on all of the mines to win.");
        while (l == true) {
            System.out.println("What difficulty would you like the game? Easy, Medium, Hard, or Extreme?");
            String difficulty = in.nextLine();
            try {
                game = new Methods(difficulty);
                l = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e);
                l = true;
            }
        }
        while (true) {
            game.showMap();
            try {
                System.out.println("Coordinates of where you want to place/remove flag or reveal space");
                System.out.println("Enter an x position");
                x = in.nextInt();
                if (x > 9 || x < 0) {
                    System.out.println("Error: Space does not exist.");
                } else {
                    System.out.println("Enter a y position");
                    y = in.nextInt();
                    in.nextLine();
                    System.out.println("1:Place/Remove flag or 2:Reveal Space?");
                    z = in.nextInt();
                    in.nextLine();
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
                        in.nextLine();
                    }
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