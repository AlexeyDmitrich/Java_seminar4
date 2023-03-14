import java.lang.reflect.Constructor;
import java.util.LinkedList;

public class HomeTask2 {
//    Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.
    public static void main(String[] args) {
        LinkedList starter = HomeTask1.fiList();
        SpecialList myList = new SpecialList(starter);  // Реализовано на основе LinkedList - starter
        System.out.println(myList);
        myList.enqueue(input.Int("Какой элемент поместить в конец очереди?")); // метод принимает классический индекс
        System.out.println("Переместили:");
        System.out.println(myList);
        Object firstVSdel = myList.dequeue();
        System.out.println("Удаляем первый элемент с выводом: ");
        System.out.println(firstVSdel.toString());
        System.out.println(myList);
        System.out.println("Получаем первый элемент без удаления: ");
        Object first = myList.first();
        System.out.println(first);
        System.out.println(myList);
    }
private static class SpecialList {
        static LinkedList body = new LinkedList<>();   // всё честно - голый LinkedList

    public SpecialList(LinkedList body) {   // при создании объекта тоже задействуем только LL
        this.body = body;
    }

    public static void enqueue (int index){
        Object element = body.get(index);
        body.remove(index);
        body.addLast(element);
    }

    public static Object dequeue (){
        Object element = body.get(0);
        body.remove(0);
        return element;
    }

    public static Object first (){
        return (body.getFirst());
    }

    public static LinkedList getBody() {  // геттер здесь как бы и даром не нужен в этой задаче, но без него некрасиво.
        return body;
    }

    @Override
    public String toString() {
        StringBuilder mylist = new StringBuilder();
        for (Object el:
             body) {
            mylist.append(el.toString());
        }
        return mylist.toString();
    }
}
}
