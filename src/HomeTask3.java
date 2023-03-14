import java.io.IOException;
import java.util.Stack;

public class HomeTask3 {
    public static void main(String[] args) throws IOException {
        calc();
    }

//    public static double calculator (){
//        while (true) {
//            double result = calc();
//            System.out.println(result);
//            return result;
//        }
//    }

    public static void calc (){
        Memory memory = new Memory();
        String operation = "";
        double num2 = 0;
        while (!operation.contains("q")) {
//            double num1 = (double) memory.get();
            double res = memory.get();
            System.out.println(res);

            operation = input.Str("Введите действие");

            if (!(operation.contains("r") || operation.contains("q")))
            num2 = input.Double("Введите число");

            switch (operation) {
                case "+":
                    res = res + num2;
                    memory.in(res);
                    continue;
                case "-":
                    res = res - num2;
                    memory.in(res);
                    continue;
                case "*":
                    res = res * num2;
                    memory.in(res);
                    continue;
                case "/":
                    res = res / num2;
                    memory.in(res);
                    continue;
                case "r":
                    res = memory.out();
                    continue;
                case "q":
                    return;
                default:
                    throw new RuntimeException("Запрашиваемое действие не найдено");
            }
        }


    }

    private static class Memory {
        Stack <Double> results;

        public Memory() {
            this.results = new Stack<Double>();
        }

        public void in (Double put) {
            results.push(put);
        }

        public double out (){
            if (results.size()>0) {
                return (double)results.pop();
            }
            else return 0;
        }

        public double get (){
            if (results.size()>0) {
                return (double)results.lastElement();
            }
            else return 0;
        }

    }

}
