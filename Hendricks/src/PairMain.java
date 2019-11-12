public class PairMain {
}

class Pair{

    private double temp, numOne, numTwo;

    public Pair(double firstNum, double secondNum) {
        numOne = firstNum;
        numTwo = secondNum;
    }

    public double getDif(boolean fors) {

        if (fors) {
            return numOne - numTwo;
        } else {
            return numTwo - numOne;
        }
    }

    public double getProduct(){
        return numOne * numTwo;
    }

    public double distance(boolean fors){
        if (fors) {
            return Math.abs(numOne - numTwo);
        } else {
            return Math.abs(numTwo - numOne);
        }
    }

}

/*
• The sum
        • The difference
        • The product
        • The average
        • The distance (absolute value of the difference)
        • The maximum (the larger of the two)
        • The minimum (the smaller of the two)
*/
