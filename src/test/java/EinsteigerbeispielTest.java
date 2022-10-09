import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import java.sql.SQLOutput;
import java.util.HashMap;

public class EinsteigerbeispielTest {

    HashMap<Integer, Integer> hashMap01 = new HashMap<>();


    @Test
    public void TestHashMap01() throws Exception {

        int[] array01 = {1, 1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};

        HashMap<Integer, Integer> Actual = Einsteigerbeispiel.getRepetitions(array01);
        HashMap<Integer, Integer> Expected = new HashMap<>();

        Expected.put(1, 3);
        Expected.put(2, 1);
        Expected.put(3, 2);
        Expected.put(4, 1);
        Expected.put(5, 1);
        Expected.put(6, 1);
        Expected.put(7, 1);
        Expected.put(8, 1);
        Expected.put(9, 4);


        Assertions.assertEquals(Expected, Actual);


    }


    @Test
    public void TestHashMap02() throws Exception {

        int[] array02 = {1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 7, 8, 8, 9, 10};

        HashMap<Integer, Integer> Actual = Einsteigerbeispiel.getRepetitions(array02);
        HashMap<Integer, Integer> Expected = new HashMap<>();

        Expected.put(1, 4);
        Expected.put(2, 1);
        Expected.put(3, 5);
        Expected.put(4, 4);
        Expected.put(5, 2);
        Expected.put(6, 3);
        Expected.put(7, 1);
        Expected.put(8, 2);
        Expected.put(9, 1);
        Expected.put(10, 1);

        Assertions.assertEquals(Expected, Actual);

    }

    @Test
    public void TestHashMap03() {

        int[] array03 = {1, 2, 3, 4, 5, 5, 5, 6, 7, -8, -9, -9, 10};

        for (int i = 0; i < array03.length; i++) {

            if(array03[i]<1){
                System.out.println("Alle eingegebenen Werte müssen positiv sein!");
                break;
            }

        }

    }

    @Test
    public void TestHashMap04() {

        int[] array04 = {};

        if(array04.length==0){
            System.out.println("Sie müssen Werte eingeben!");
        }
    }
}
