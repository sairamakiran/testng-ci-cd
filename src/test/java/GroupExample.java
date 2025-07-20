import org.testng.annotations.Test;

public class GroupExample {

    @Test(groups = {"sanity"})
    public void test1() {
        System.out.println("Sanity Test 1");
    }

    @Test(groups = {"regression"})
    public void test2() {
        System.out.println("Regression Test 2");
    }

    @Test(groups = {"sanity", "regression"})
    public void test3() {
        System.out.println("Common Test 3");
    }
}
