import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /////34702
        int[] myIntArray = {3,4,7, 2, 9,1, 0};
        selectionSort(myIntArray);
    }

    public static void selectionSort(int[] ints){


                for (int i = 0; i<ints.length-1; i++){
                    int minValue = i;

                    for (int j = i+1; j<ints.length; j++){
                        if (ints[minValue] > ints[j]){
                            minValue = j;
                        }
                    }

                    if (minValue != i){
                        int k = ints[minValue];
                        ints[minValue] = ints[i];
                        ints[i] = k;
                    }

                }

        System.out.println(Arrays.toString(ints));
    }
}
