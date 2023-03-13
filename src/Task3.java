import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan_line = new Scanner(System.in);
        Stack<String> arr_list = new Stack<>();
        String text = "";
        while (!text.contains("print")) {
            System.out.println(arr_list);
            System.out.print("Введите текст: ");
            text = scan_line.next();
            if (text.contains("print")) {
                while (!arr_list.isEmpty()) {
                    System.out.print(arr_list.pop());
                }
            } else {
                arr_list.push(text);
            }
        }
    }
}
