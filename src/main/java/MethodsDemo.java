public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo d = new MethodsDemo();
        String name = d.getData();
        System.out.println(name);
        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();
        getData2();

    }
    public String getData() {
        System.out.println("Hello world");
        return "Milan Ilic";
    }

    public static String getData2() {
        System.out.println("hello world");
        return "Milan Ilic";
    }

    //Finished section 3 and 4, moving on to the section 5:
    //Locator Techniques&Tools used to identify objects



}
