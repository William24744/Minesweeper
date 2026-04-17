import java.util.InputMismatchException;
import java.util.Scanner;
public class Userinterface {
    public static void main(String[] args) {
        boolean powerup = true;
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int z;
        int hints = 5;
        Methods game = null;
        boolean l = true;
        System.out.println("Welcome to Minesweeper. Put a flag on all of the mines to win.");
        while (l == true) {
            System.out.println("What difficulty would you like the game? Easy, Medium, or Hard?");
            String difficulty = in.nextLine();
            try {
                game = new Methods(difficulty);
                l = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e);
                l = true;
            }
        }
        System.out.println("You have one powerup you can use which will clear a 3x3 area of your choosing, and five hints that will reveal the space.");
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
                    System.out.println("1:Place/Remove flag, 2:Reveal Space?, 3:Use Powerup, or 4:Use Hint?");
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
                    } else if (z == 3) {
                        if (position > 99 || position < 0) {
                            System.out.println("Error: Space does not exist.");
                        } else {
                            if (powerup == true) {
                                if (position % 10 == 0 || position % 10 == 9 || position < 10 || position > 89) {
                                    System.out.println("Don't use a powerup on the sides or corners!");
                                } else {
                                    Powerup.UsePowerup(position, game);
                                }
                            } else {
                                System.out.println("Error: You have no more powerups.");
                            }
                        }
                    } else if (z == 4) {
                        if (hints < 1) {
                            System.out.println("Error: You have no more hints.");
                        } else {
                            if (position > 99 || position < 0) {
                            System.out.println("Error: Space does not exist.");
                            } else {
                                if (game.revealSpace(position) == true) {
                                    game.flag(position);
                                }
                                hints -= 1;
                            }
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