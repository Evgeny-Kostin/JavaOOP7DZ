public class Calculator {
    private double result;
    private OperationCalculator operationsCalculator;

    public double getResult(){
        return result;
    }
    public void setOperationsCalculator(OperationCalculator operationsCalculator){
        this.operationsCalculator = operationsCalculator;
    }
    public void doOperation (double num1,double num2){
        result = operationsCalculator.doOperation(num1,num2);
    }

}
