import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> list = new ArrayList<>();
                int n = sc.nextInt();
                while (n >= 0) {
                        list.add(n);
                        n = sc.nextInt();
                }
                for (int i = list.size() - 1; i >= 0; i--) {
                        System.out.print(list.get(i) + " ");
                }
        }
}