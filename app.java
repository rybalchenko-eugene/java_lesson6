import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

      ArrayList<Goods> list= new ArrayList<>();
      for (int i = 0; i < 3; i++) {

        System.out.println("Current number og good: " + i);
        System.out.println("Input name: ");
        String name = user_input();
        System.out.println("Input price: ");
        Double price = 0.0;
        try {
          price = Double.parseDouble(user_input());
        } catch (Exception e) {
          System.out.println("Price set to 0.00");
        }


        System.out.println("Input description: ");
        String description = user_input();

        list.add(new Goods(i, name, price, description));
        
      }
      user_close();
      for (Goods goods : list) {
        goods.print();
      }



      
    }

    public static String user_input() {
      Scanner in = new Scanner(System.in);
      String res = in.nextLine();
      return res;
    }
    public static void user_close() {  
      Scanner in = new Scanner(System.in);
      in.close();
    }

  }

