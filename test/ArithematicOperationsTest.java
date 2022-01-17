import org.junit.jupiter.api.BeforeAll;

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
}