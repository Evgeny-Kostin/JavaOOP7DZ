/**
 * DivideOperation
 */
public class DivideOperation implements OperationCalculator {
    @Override
    public double doOperation(double num1, double num2){
        if (num2 ==0){
            throw new RuntimeException("Нельзя на 0 делить!");
        }
        else{
            return num1/num2;
        }
    }

}