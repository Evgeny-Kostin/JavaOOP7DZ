public class CalculatorController {
    private Calculator mod;
    private CalculatorShow show;

    public CalculatorController(Calculator mod, CalculatorShow show){
        this.mod = mod;
        this.show =show;
    }
    public void doOperation(String operation, double num1, double num2){
        switch (operation) {
            case "+":
                mod.setOperationsCalculator(new PlusOperation());
                break;
            case "-":
                mod.setOperationsCalculator(new MinusOperation());
                break;
            case "*":
                mod.setOperationsCalculator(new MultiOperation());
                break;
            case "/":
                mod.setOperationsCalculator(new DivideOperation());
                break;
            default:
                System.out.println("Ввод некорректной операции");

        }
        mod.doOperation(num1, num2);
        show.showResult(mod.getResult());
    }
}

