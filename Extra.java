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
}
