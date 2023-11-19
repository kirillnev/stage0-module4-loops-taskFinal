package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength + i; j++) {
                if (j >= (cathetusLength - i - 1) && (j <= cathetusLength + i - 1)) {
                    System.out.print(Math.abs(j - cathetusLength + 1) + 1);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
