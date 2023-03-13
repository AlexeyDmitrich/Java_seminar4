import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        /*1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
          2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.
*/


        ArrayList<Integer> arr = new ArrayList();
        long time = System.currentTimeMillis();
        for (int i = 0; i <= 1000000; i++) {
            arr.add(0, i);

        }
        long time2 = System.currentTimeMillis();
        int result = (int)(time2 - time);

        System.out.println("Time for ArrayList: " + result + "ms.");

        LinkedList<Integer> list = new LinkedList<>();
        long timeList = System.currentTimeMillis();

        for (int i = 0; i <= 1000000; i++) {
            list.add(0, i);

        }

        long timeList2 = System.currentTimeMillis();
        long resultList = timeList2 - timeList;

        System.out.println("Time is for LinkedList: " + resultList + "ms.");
    }
}
