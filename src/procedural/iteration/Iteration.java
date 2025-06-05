package src.procedural.iteration;

public class Iteration {

    public void loop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("(i = " + i + " j = " + j + ") ");
            }
            System.out.println();
        }
    }

    public void loopPyramid(int[] arr) {
        // input --> int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    public void loopPyramidBack(int[] arr) {
        // input --> int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

}
