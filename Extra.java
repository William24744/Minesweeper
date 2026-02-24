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
                if (game.space[1] == 0) {
                    autoClear(1, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(10);
                if (game.space[10] == 0) {
                    autoClear(10, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(11);
                if (game.space[11] == 0) {
                    autoClear(11, game);
                }
            } catch (IllegalArgumentException e) {

            }
        } else if (position == 9) {
            try {
                game.revealSpace(8);
                if (game.space[8] == 0) {
                    autoClear(8, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(19);
                if (game.space[19] == 0) {
                    autoClear(19, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(18);
                if (game.space[18] == 0) {
                    autoClear(18, game);
                }
            } catch (IllegalArgumentException e) {

            }
        } else if (position == 99) {
            try {
                game.revealSpace(98);
                if (game.space[98] == 0) {
                    autoClear(98, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(89);
                if (game.space[89] == 0) {
                    autoClear(89, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(88);
                if (game.space[88] == 0) {
                    autoClear(88, game);
                }
            } catch (IllegalArgumentException e) {

            }
        } else if (position == 90) {
            try {
                game.revealSpace(91);
                if (game.space[91] == 0) {
                    autoClear(91, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(80);
                if (game.space[80] == 0) {
                    autoClear(80, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(81);
                if (game.space[81] == 0) {
                    autoClear(81, game);
                }
            } catch (IllegalArgumentException e) {

            }
        } else if (position % 10 == 0) { // left side
            try {
                game.revealSpace(position - 10);
                if (game.space[position - 10] == 0) {
                    autoClear(position - 10, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 9);
                if (game.space[position - 9] == 0) {
                    autoClear(position - 9, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 1);
                if (game.space[1] == 0) {
                    autoClear(position + 1, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 10);
                if (game.space[10] == 0) {
                    autoClear(position + 10, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 11);
                if (game.space[11] == 0) {
                    autoClear(position + 11, game);
                }
            } catch (IllegalArgumentException e) {

            }
        } else if (position < 10) { // ceiling
            try {
                game.revealSpace(position - 1);
                if (game.space[1] == 0) {
                    autoClear(position - 1, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 1);
                if (game.space[1] == 0) {
                    autoClear(position + 1, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 9);
                if (game.space[9] == 0) {
                    autoClear(position + 9, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 10);
                if (game.space[10] == 0) {
                    autoClear(position + 10, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 11);
                if (game.space[11] == 0) {
                    autoClear(position + 11, game);
                }
            } catch (IllegalArgumentException e) {

            }
        } else if (position % 10 == 9) { // right side
            try {
                game.revealSpace(position - 11);
                if (game.space[11] == 0) {
                    autoClear(position - 11, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 10);
                if (game.space[10] == 0) {
                    autoClear(position - 10, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 1);
                if (game.space[1] == 0) {
                    autoClear(position - 1, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 9);
                if (game.space[9] == 0) {
                    autoClear(position + 9, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 10);
                if (game.space[10] == 0) {
                    autoClear(position + 10, game);
                }
            } catch (IllegalArgumentException e) {

            }
        } else if (position > 89) { // floor
            try {
                game.revealSpace(position - 11);
                if (game.space[11] == 0) {
                    autoClear(position - 11, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 10);
                if (game.space[10] == 0) {
                    autoClear(position - 10, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 9);
                if (game.space[9] == 0) {
                    autoClear(position - 9, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 1);
                if (game.space[1] == 0) {
                    autoClear(position - 1, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 1);
                if (game.space[1] == 0) {
                    autoClear(position + 1, game);
                }
            } catch (IllegalArgumentException e) {

            }
        } else {
            try {
                game.revealSpace(position - 11);
                if (game.space[11] == 0) {
                    autoClear(position - 11, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 10);
                if (game.space[10] == 0) {
                    autoClear(position - 10, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 9);
                if (game.space[9] == 0) {
                    autoClear(position - 9, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position - 1);
                if (game.space[1] == 0) {
                    autoClear(position - 1, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 1);
                if (game.space[1] == 0) {
                    autoClear(position + 1, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 9);
                if (game.space[9] == 0) {
                    autoClear(position + 9, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 10);
                if (game.space[10] == 0) {
                    autoClear(position + 10, game);
                }
            } catch (IllegalArgumentException e) {

            }
            try {
                game.revealSpace(position + 11);
                if (game.space[11] == 0) {
                    autoClear(position + 11, game);
                }
            } catch (IllegalArgumentException e) {

            }
        }
    }
}
