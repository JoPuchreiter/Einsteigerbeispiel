import java.util.HashMap;

public class Einsteigerbeispiel {

    public static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 7, 8, 8, 9};

        System.out.println(getRepetitions(array));

    }

    public static HashMap<Integer, Integer> getRepetitions(int[] array) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int a=1;


        for (int i = 1; i < array.length; i++) {


                if (array[i] == array[i-1]) {
                    a++;

                }

            hashMap.put(array[i],a);

                if (array[i] != array[i-1]){
                    a=1;
                }

            hashMap.put(array[i],a);

        }

        return hashMap;

    }
}
