import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class HomeTask1 {
    //Пусть дан LinkedList с несколькими элементами.
    // Реализуйте метод(не void), который вернет “перевернутый” список.
    public static void main(String[] args) {
        LinkedList starter = fiList();
        System.out.printf("Первичный список: \n%s\n", starter);
        ArrayList res = reverce(starter);  // тип списка не уточнен, так как он будет читаться, а не изменяться, я выбираю ArrayList
        System.out.printf("Итоговый список: \n%s\n", res);
    }
    public static LinkedList fiList (){
        LinkedList usersInputList = new LinkedList();
        while (true){
            String value = input.Str("Введите значение или < - > для выхода");
            if (value.contains("-")){
//                System.out.println(usersInputList);
                return usersInputList;
            }
            else {
                usersInputList.add(value); // Я сознательно не использую .add(0,value), т.к. заданный список должен быть прямым.
            }
        }
    }

    public static ArrayList reverce (LinkedList starterList){
        ArrayList resList = new ArrayList();
        while (starterList.size()>0){
            resList.add(starterList.removeLast());
        }
        return resList;
    }
}
