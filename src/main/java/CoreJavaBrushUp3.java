public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        //String in an object
        //String literal

        String s1 = "Milan Ilic";
        String s2 = "Hello";

        //new

        String s3 = new String("Welcome");
        String s4 = new String("Welcome");

        String s = "Milan Kuja Ilic";
        String[] splittedString = s.split("Kuja");
        System.out.println(splittedString[0].trim());
        System.out.println(splittedString[1].trim());
        System.out.println(splittedString[1].trim());

        System.out.println("----------");
        for (int i = 0; i < s.length();i++){
            System.out.println(s.charAt(i));
        }

        System.out.println("----------");
        for (int i = s.length()-1; i >= 0;i--){
            System.out.println(s.charAt(i));
        }
    }
}
