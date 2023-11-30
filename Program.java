/*
Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.
*/
/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        Calculator calkCalculator = new Calculator();
        CalculatorShow show = new CalculatorShow();
        CalculatorController controller = new CalculatorController(calkCalculator, show);

        String operation = show.enterOperation();
        int num1 = show.enterOperand();
        int num2 = show.enterOperand();
        controller.doOperation(operation, num1, num2);
    }

    
}

