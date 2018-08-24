import org.junit.Assert;
import org.junit.Test;
public class MathFunctionsTest {
    MathFunctions m = new MathFunctions();

    @Test
    public void addNumbers() {

        Assert.assertEquals(6, m.addNumber(4, 2));

    }

    @Test
    public void SubtractNumbers() {
        Assert.assertEquals(2, m.subtractNumber(4, 2));

    }

    @Test
    public void MultiplyNumbers() {

        Assert.assertEquals(8, m.multiplyNumber(4, 2));

    }

    @Test
    public void DivideNumbers() {
        Assert.assertEquals(9, m.divideNumber(4, 2));


    }
}
