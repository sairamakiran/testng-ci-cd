public class ChildClass extends AbsClass {

    @Override
    public void m2() {
        System.out.println("m2 implemented in ChildClass");
    }

    @Override
    public void m3() {
        System.out.println("m3 implemented in ChildClass");
    }

    @Override
    public void m4() {
        System.out.println("m4 implemented in ChildClass");
    }

    @Override
    public void x2() {
        System.out.println("x2 implemented in ChildClass");
    }


        public static void main(String[] args) {
            ChildClass obj = new ChildClass();

            obj.m1();  // overridden
            obj.m2();
            obj.m3();
            obj.m4();
            obj.x1();  // from abstract class
            obj.x2();
        }


}


