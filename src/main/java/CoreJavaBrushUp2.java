import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122};

        for (int i = 0; i < arr2.length;i++ ) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                break;
            } else {
                System.out.println(arr2[i] + " Is not multiple of 2");
        }
        }
        System.out.println("-------------");

        ArrayList<String> a = new ArrayList();
        a.add("rahul");
        a.add("shetty");
        a.add("academy");
        a.add("selenium");
        //create object of the class - object.method
        System.out.println(a.get(3));
        System.out.println("-------------");

        for (int i = 0;i < a.size();i++) {
            System.out.println(a.get(i));
        }
        System.out.println("-------------");

        for (String val : a){
            System.out.println(val);
        }
        System.out.println("-------------");

        //Item is present in ArrayList
        System.out.println(a.contains("selenium"));

        //List to ArrayList
        String[] name = {"rahul", "shetty", "selenium"};
        List<String> nameArrayList = Arrays.asList(name);
        System.out.println(nameArrayList.contains("selenium"));
        System.out.println("-------------");


    }
}
