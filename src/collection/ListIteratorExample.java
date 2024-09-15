package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "alata";
        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (reverseIterator.hasPrevious()&& iterator.hasNext())  {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("palindrom");
        }
        else {
            System.out.println("not palindrom");
        }
    }


}
