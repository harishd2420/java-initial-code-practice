import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class ArraylistRemoveDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of the list:");
        int size = s.nextInt();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < size; i++) {
            int a = s.nextInt();
            list.add(a);
        }
        Set<Integer> tree = new LinkedHashSet<>(list);
        System.out.println("Sorted and duplicate-free list:");
        for (int num : tree) {
            System.out.println(num);
        }
    }
}