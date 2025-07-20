import org.testng.TestNG;

public class TestRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            TestNG testng = new TestNG();
            testng.setTestClasses(new Class[] { GoogleTest.class,SampleTest.class });
            testng.run();
        }
    }
}
