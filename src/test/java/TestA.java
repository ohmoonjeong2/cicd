import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestA {
    @Test
    void test1(){
        System.out.println("단위테스트");
        int expect = 1;
        Assertions.assertTrue(expect == 1);
    }
}
