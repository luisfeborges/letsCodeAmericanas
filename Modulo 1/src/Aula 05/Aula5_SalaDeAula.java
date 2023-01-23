public class Aula5_SalaDeAula {

public static void main(String[] args) {
    int[] my_array1 = {
        1789, 2035, 1899, 1456, 2013,
        1458, 2458, 1254, 1472, 2365,
        1456, 2265, 1457, 2456};

    System.out.println(contains(my_array1, 1));

    System.out.println("________");

    printMatriz();

}
    
public static boolean contains(int[] arr, int item) {
    for(int i = 0; i < arr.length; i++) {
        if (arr[i] == item) {
            return true;
        }
    }
    return false;
}

public static void printMatriz() {
    int matriz[][] = new int[10][10];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("  " + matriz[i][j]);
        }
        System.out.println();
    }
}

}
