package Utilitario;

public class ArrayString {

    public void ArraysFull() {
        String[] aS = new String[4];
        int[] edad = { 45, 23, 11, 9 };

        edad[0] = 10;
        edad[1] = 10;

        for (int i = 0; i < aS.length; i++) {
            aS[i] = "String " + i;

        }

        for (String s : aS) {
            System.out.println(s.toUpperCase());
        }

        for (int i = 0; i < aS.length; i++) {
            System.out.println(aS[i].toUpperCase());
        }

        int m[][] = new int[4][4];

        int matriz[][] = { { 0, 1, 3 }, { 0, 1, 3, 4, 5 }, { 0, 1, 3, 4, 5, 6, 7 }, { 0, 1, 3 }
        };

        for (int[] arr : matriz) {
            for (int i : arr) {
                System.out.println(i + " ");
            }
            System.out.println("");
        }
    }

}
