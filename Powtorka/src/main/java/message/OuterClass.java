package message;

public class OuterClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
    }

    OuterClass() {
        InnerClass ic = new InnerClass(this);
    }

    class InnerClass {
        InnerClass(OuterClass oc) {
            System.out.println("Enclosing class: " + oc + " / " + oc.getClass());
            System.out.println("This class: " + this + " / " + this.getClass());
            System.out.println("Parent of this class: " + this.getClass().getEnclosingClass());
            System.out.println("Other way to parent: " + OuterClass.this);
        }
    }
}