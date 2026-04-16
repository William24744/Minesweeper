public class Powerup {
    public static void UsePowerup(int position, Methods game) {
        if (game.space[position - 11] == '|') {
            if (game.revealSpace(position - 11) == true) {
                game.flag(position - 11);
            }
        }
        if (game.space[position - 10] == '|') {
            if (game.revealSpace(position - 10) == true) {
                game.flag(position - 10);
            }
        }
        if (game.space[position - 9] == '|') {
            if (game.revealSpace(position - 9) == true) {
                game.flag(position - 9);
            }
        }
        if (game.space[position - 1] == '|') {
            if (game.revealSpace(position - 1) == true) {
                game.flag(position - 1);
            }
        }
        if (game.space[position] == '|') {
            if (game.revealSpace(position) == true) {
                game.flag(position);
            }
        }
        if (game.space[position + 1] == '|') {
            if (game.revealSpace(position + 1) == true) {
                game.flag(position + 1);
            }
        }
        if (game.space[position + 9] == '|') {
            if (game.revealSpace(position + 9) == true) {
                game.flag(position + 9);
            }
        }
        if (game.space[position + 10] == '|') {
            if (game.revealSpace(position + 10) == true) {
                game.flag(position + 10);
            }
        }
        if (game.space[position + 11] == '|') {
            if (game.revealSpace(position + 11) == true) {
                game.flag(position + 11);
            }
        }
    }
}