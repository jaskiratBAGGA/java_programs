import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(3, 54);
//        list.set(0, 99);
//        list.remove(2);
          for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
          for(int i = 0; i<5;i++){
              System.out.println(list.get(i));
          }
    }
}
