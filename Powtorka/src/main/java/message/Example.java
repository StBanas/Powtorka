package message;

public class Example {

    public void test(Example obj) {
        System.out.println("test");
        System.out.println(obj);

    }
    public void test1() {
//        test(this);
        Example obj = new Example();
        test(obj);


    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.test1();
    }

}
