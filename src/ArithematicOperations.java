public class ArithematicOperations {

    private final int firstnumber;
    private final int secondnumber;

    public ArithematicOperations(int firstnumber, int secondnumber) {
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
    }

    public int addTwoNumbers(){
        return (firstnumber+secondnumber);
    }

    public int subtractTwoNumbers() {
        return(firstnumber-secondnumber);
    }

    public int multiplyTwoNumbers() {
        return(firstnumber*secondnumber);
    }
}