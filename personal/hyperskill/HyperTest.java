package hyperskill;

import java.util.*;

public class HyperTest {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();
        int[] obj1 = {x1, y1, z1};
        int[] obj2 = {x2, y2, z2};
        Arrays.sort(obj1);
        Arrays.sort(obj2);
        int vol1 = x1 * y1 * z1;
        int vol2 = x2 * y2 * z2;
        if (vol1 == vol2 && obj1 == obj2) {
            System.out.println("Box 1 = Box 2");
        } else if (vol1 < vol2 && Arrays.stream(obj1).max().getAsInt() <= Arrays.stream(obj2).max().getAsInt()) {
            System.out.println("Box 1 < Box 2");
        } else if (vol2 < vol1 && Arrays.stream(obj2).max().getAsInt() <= Arrays.stream(obj1).max().getAsInt()) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}