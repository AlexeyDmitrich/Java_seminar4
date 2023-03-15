import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.io.IOException;
import java.util.Stack;

public class HomeTask3 {
    public static void main(String[] args) throws IOException {
        double starter = input.Double("Введите число");
        Memory memory = new Memory();
        memory.in(starter);
        calc(memory);
    }

//    public static double calculator (){
//        while (true) {
//            double result = calc();
//            System.out.println(result);
//            return result;
//        }
//    }

    public static void calc (Memory memory){


            String operation = "";
            double num2 = 0;
        try {
            while (!operation.contains("q")) {
//            double num1 = (double) memory.get();
                double res = memory.get();
                System.out.println(res);

                operation = input.Str("Введите действие");
                if (!(operation.equals("+")||operation.equals("-")||operation.equals("*")||operation.equals("/")||operation.equals("r")||operation.equals("q"))){
                    throw new ValueException("Некорректное действие");
                }
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
                        memory.in(res);
                        res = memory.out();
                        throw new RuntimeException("Запрашиваемое действие не найдено");
                }
            }

        } catch (Exception e) {
            System.out.println("Ошибочный ввод, попробуйте снова");
            calc(memory);
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
