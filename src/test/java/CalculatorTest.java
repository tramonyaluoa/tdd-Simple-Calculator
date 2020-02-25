import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addMethodTwoNumbers() {
        Assert.assertEquals(1, Calculator.add(1,2));
    }

    @Test
    public void addMethodTwoMoreNumbers() {
        Assert.assertEquals(-2, Calculator.add(-1,-1));
    }

    @Test
    public void addMethodFiveNumbers() {
        Assert.assertEquals(15, Calculator.add(1,2,3,4,5));
    }

    @Test
    public void MultiplyMethodTwoNumbers() {
        Assert.assertEquals(3, Calculator.multiply(1,3));
    }

    @Test
    public void MultiplyMethodTwoMoreNumbers() {
        Assert.assertEquals(-3, Calculator.multiply(-1,3));
    }

    @Test
    public void MultiplyMethodFiveNumbers() {
        Assert.assertEquals(120, Calculator.multiply(1,2,3,4,5));
    }
}