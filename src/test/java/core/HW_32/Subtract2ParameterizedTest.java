package core.HW_32;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Subtract2ParameterizedTest {
       @Parameters(name = "Parameter # {index}: {1} + {2} = {0}")
       public static Collection<Double[]> addNumbers() {
              return Arrays.asList(new Double[][] {
                           { 0.0, 2.0, 2.0 },  
                           { 6.0, 9.0, 3.0 },   
                           { 2.0, 10.0, 8.0 },  
                           { 6.0, 12.0, 6.0 },  
              });}
       @Parameter(value = 0) public Double expected;
       @Parameter(value = 1) public Double first;
       @Parameter(value = 2) public Double second;
       @Test
       public void subtract() {
              System.out.println(first + " - " + second + " = " + expected);
              assertEquals("Not correct", Calculator.subtract(first, second), expected, 0.09);
}}
 