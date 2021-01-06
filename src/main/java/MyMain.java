public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] shuffled = new int[arr.length];

        int k = 0;

        for (int j = 0; j < arr.length/2; j++) {
            shuffled[k] = arr[j];
            k+=2;
        }

        k = 1;

        for (int j = arr.length/2; j < arr.length; j++) {
            shuffled[k] = arr[j];
            k+=2;
        }

        return shuffled;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        for (int i = 0; i < arr.length; i++) {
            int swap = (int) (arr.length * Math.random());
            int x = arr[i];
            arr[i] = arr[swap];
            arr[swap] = x;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
