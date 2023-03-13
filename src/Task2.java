import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку
2. сохранить text в связный список.
3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

        Scanner scan_line = new Scanner(System.in);
        LinkedList<String> arr_list = new LinkedList<>();

        while (true) {
            System.out.println(arr_list);
            System.out.print("Введите текст: ");
            String text = scan_line.next();
            if (text.contains("print~")) {
                int remove_idx = Integer.parseInt(text.split("~")[1]);
                try {
                    System.out.println(arr_list.get(remove_idx));
                    arr_list.remove(remove_idx);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
            }
            else {
                arr_list.add(text);
            }
        }
    }
}
