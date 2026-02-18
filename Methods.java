import java.util.Random;
public class Methods {
    char[] space = new char[100];
    boolean[] flag = new boolean[100];
    // ▲

    public Methods() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            flag[i] = false;
            space[i] = ' ';
        }
        for (int i = 0; i < 10; i += 0) {
            int random = rand.nextInt(100);
            if (flag[random] = false) {
                flag[random] = true;
                i++;
            }
        }
    }

    public void showMap() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int o = 0; o < 10; o++) {
                result.append(space[(10*i + o)]);
            }
            result.append("\n");
        }
        System.out.println(result);
    }

    public boolean revealSpace(int position) throws IllegalArgumentException {
        if (flag[position] == true) {
            return true;
        } else {
            if (space[position] == '▲') {
                throw new IllegalArgumentException("A flag is placed there.");
            }
            if (space[position] > 99) {
                throw new IllegalArgumentException("Space does not exist.");
            }
            if (space[position] != ' ') {
                throw new IllegalArgumentException("Space has already been revealed.");
            }
            space[position] = (char) (Extra.numberFlags(position, this.flag));
            return false;
        }
    }

    public void flag(int position) {

    }
}
