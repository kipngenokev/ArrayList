package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items ={"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");

        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("mazda","toyota","honda"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
        System.out.println("Third element :"+groceries.get(4));

        if(groceries.contains("mazda")) {
            System.out.println("List contains Mazda");
        }

        groceries.add("yogurt");
        System.out.println("first :"+ groceries.indexOf("yogurt"));
        System.out.println("last :"+ groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(2);
        System.out.println(groceries);
        groceries.add(2,"pineapple");
        System.out.println(groceries);
        groceries.remove("pineapple");
        System.out.println(groceries);

        groceries.removeAll(List.of("mazda","toyota","honda"));
        System.out.println(groceries);

        groceries.retainAll(List.of("eggs","yogurt"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("Is Empty:"+groceries.isEmpty());

        groceries.addAll(List.of("apples","milk", "mustard","cheese"));
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
