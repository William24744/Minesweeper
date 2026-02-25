public class Extra {
    public static int numberFlags(int position, boolean[] flag) {
        int number = 0;
        if (position == 0) { // corners
            if (flag[1] == true) {
                number++;
            }
            if (flag[10] == true) {
                number++;
            }
            if (flag[11] == true) {
                number++;
            }
        } else if (position == 9) {
            if (flag[8] == true) {
                number++;
            }
            if (flag[19] == true) {
                number++;
            }
            if (flag[18] == true) {
                number++;
            }
        } else if (position == 99) {
            if (flag[98] == true) {
                number++;
            }
            if (flag[89] == true) {
                number++;
            }
            if (flag[88] == true) {
                number++;
            }
        } else if (position == 90) {
            if (flag[91] == true) {
                number++;
            }
            if (flag[80] == true) {
                number++;
            }
            if (flag[81] == true) {
                number++;
            }
        } else if (position % 10 == 0) { // left side
            if (flag[position - 10] == true) {
                number++;
            }
            if (flag[position - 9] == true) {
                number++;
            }
            if (flag[position + 1] == true) {
                number++;
            }
            if (flag[position + 10] == true) {
                number++;
            }
            if (flag[position + 11] == true) {
                number++;
            }
        } else if (position < 10) { // ceiling
            if (flag[position - 1] == true) {
                number++;
            }
            if (flag[position + 1] == true) {
                number++;
            }
            if (flag[position + 9] == true) {
                number++;
            }
            if (flag[position + 10] == true) {
                number++;
            }
            if (flag[position + 11] == true) {
                number++;
            }
        } else if (position % 10 == 9) { // right side
            if (flag[position - 11] == true) {
                number++;
            }
            if (flag[position - 10] == true) {
                number++;
            }
            if (flag[position - 1] == true) {
                number++;
            }
            if (flag[position + 9] == true) {
                number++;
            }
            if (flag[position + 10] == true) {
                number++;
            }
        } else if (position > 89) { // floor
            if (flag[position - 11] == true) {
                number++;
            }
            if (flag[position - 10] == true) {
                number++;
            }
            if (flag[position - 9] == true) {
                number++;
            }
            if (flag[position - 1] == true) {
                number++;
            }
            if (flag[position + 1] == true) {
                number++;
            }
        } else {
            if (flag[position - 11] == true) {
                number++;
            }
            if (flag[position - 10] == true) {
                number++;
            }
            if (flag[position - 9] == true) {
                number++;
            }
            if (flag[position - 1] == true) {
                number++;
            }
            if (flag[position + 1] == true) {
                number++;
            }
            if (flag[position + 9] == true) {
                number++;
            }
            if (flag[position + 10] == true) {
                number++;
            }
            if (flag[position + 11] == true) {
                number++;
            }
        }
        return number;
    }
    public static void autoClear(int position, Methods game) {
        if (position == 0) { // corners
            try {
                game.revealSpace(1);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(10);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(11);
            } catch (IllegalArgumentException e) {

            }
        } else if (position == 9) {
            try {
                game.revealSpace(8);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(19);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(18);
            } catch (IllegalArgumentException e) {

            }
        } else if (position == 99) {
            try {
                game.revealSpace(98);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(89);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(88);
            } catch (IllegalArgumentException e) {

            }
        } else if (position == 90) {
            try {
                game.revealSpace(91);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(80);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(81);
            } catch (IllegalArgumentException e) {

            }
        } else if (position % 10 == 0) { // left side
            try {
                game.revealSpace(position - 10);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 9);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 1);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 10);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 11);
            } catch (IllegalArgumentException e) {

            }
        } else if (position < 10) { // ceiling
            try {
                game.revealSpace(position - 1);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 1);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 9);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 10);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 11);
            } catch (IllegalArgumentException e) {

            }
        } else if (position % 10 == 9) { // right side
            try {
                game.revealSpace(position - 11);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 10);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 1);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 9);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 10);
            } catch (IllegalArgumentException e) {

            }
        } else if (position > 89) { // floor
            try {
                game.revealSpace(position - 11);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 10);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 9);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 1);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 1);
            } catch (IllegalArgumentException e) {

            }
        } else {
            try {
                game.revealSpace(position - 11);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 10);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 9);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 1);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 1);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 9);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 10);
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 11);
            } catch (IllegalArgumentException e) {

            }
        }
    }
    public static boolean win(Methods game) {
        int[] mines = game.getMines();
        char[] spaces = game.getSpaces();
        boolean win = true;
        for (int i = 0; i < 10; i++) {
            if (spaces[mines[i]] != 'F') {
                win = false;
            }
        }
        return win;
    }
}
