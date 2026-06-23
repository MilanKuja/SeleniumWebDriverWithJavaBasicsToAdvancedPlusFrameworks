import java.util.ArrayList;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        // TODO auto-generated method stub

        int myNum = 5;
        String website = "Rahul Shetty Acedemy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum + "is the value stored in the myNum variable");
        System.out.println(website);

        //ARRAYS
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------");

        for (int i = 0; i <arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("-------------");

        String[] name = {"rahul","shetty","selenium"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("-------------");

        for (String s : name) {
            System.out.println(s);
        }
        System.out.println("-------------");

        for (int i = 4; i >= 0; i--){
            System.out.println(arr[i]);
        }
        System.out.println("-------------");

        int zbir = 0;
        for (int number : arr){
            zbir = zbir + number;
            System.out.println(zbir);
        }
        System.out.println("-------------");




    }
}
