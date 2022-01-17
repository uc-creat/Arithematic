import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithematicOperationsTest {

    private static ArithematicOperations bothpositive;
    private static ArithematicOperations bothnegative;
    private static ArithematicOperations firstpositivesecondnegative;
    private static ArithematicOperations firstnegativesecondpositive;

    @BeforeAll
    static void SetUp() {
        bothpositive = new ArithematicOperations(1, 1);
        bothnegative = new ArithematicOperations(-1, -1);
        firstpositivesecondnegative = new ArithematicOperations(1, -1);
        firstnegativesecondpositive = new ArithematicOperations(-1, 1);
    }

    @Nested
    class AddTwoNumbers{

        @Test
        void addTwoPositiveNumbers(){
            assertEquals(2,bothpositive.addTwoNumbers());
        }

        @Test
        void addTwoNegativeNumbers(){
            assertEquals(-2, bothnegative.addTwoNumbers());
        }

        @Test
        void addFirstPositiveNumberWithSecondNegativeNumber(){
            assertEquals(0, firstpositivesecondnegative.addTwoNumbers());
        }

        @Test
        void addFirstNegativeNumberWithSecondPositiveNumber(){
            assertEquals(0,firstnegativesecondpositive.addTwoNumbers());
        }
    }

    @Nested
    class SubtractTwoNumbers{

        @Test
        void subtractTwoPositiveNumbers(){
            assertEquals(0,bothpositive.subtractTwoNumbers());
        }

        @Test
        void subtractTwoNegativeNumbers(){
            assertEquals(0, bothnegative.subtractTwoNumbers());
        }

        @Test
        void subtractFirstPositiveNumberWithSecondNegativeNumber(){
            assertEquals(2, firstpositivesecondnegative.subtractTwoNumbers());
        }

        @Test
        void subtractFirstNegativeNumberWithSecondPositiveNumber(){
            assertEquals(-2,firstnegativesecondpositive.subtractTwoNumbers());
        }
    }

    @Nested
    class MultiplyTwoNumbers{

        @Test
        void multiplyTwoPositiveNumbers(){
            assertEquals(1,bothpositive.multiplyTwoNumbers());
        }

        @Test
        void multiplyTwoNegativeNumbers(){
            assertEquals(1, bothnegative.multiplyTwoNumbers());
        }

        @Test
        void multiplyFirstPositiveNumberWithSecondNegativeNumber(){
            assertEquals(-1, firstpositivesecondnegative.multiplyTwoNumbers());
        }

        @Test
        void multiplyFirstNegativeNumberWithSecondPositiveNumber(){
            assertEquals(-1,firstnegativesecondpositive.multiplyTwoNumbers());
        }
    }

    @Nested
    class DivideTwoNumbers{

        @Test
        void divideTwoPositiveNumbers(){
            assertEquals(1,bothpositive.divideTwoNumbers());
        }

        @Test
        void divideTwoNegativeNumbers(){
            assertEquals(1, bothnegative.divideTwoNumbers());
        }

        @Test
        void divideFirstPositiveNumberWithSecondNegativeNumber(){
            assertEquals(-1, firstpositivesecondnegative.divideTwoNumbers());
        }

        @Test
        void divideFirstNegativeNumberWithSecondPositiveNumber(){
            assertEquals(-1,firstnegativesecondpositive.divideTwoNumbers());
        }

        @Test
        void divideANumberWithZero(){
            ArithematicOperations dividebyzero = new ArithematicOperations(1,0);
            assertEquals(0, dividebyzero.divideTwoNumbers());
        }
    }


}