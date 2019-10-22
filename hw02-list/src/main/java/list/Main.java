package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        DIYarrayList<Integer> list = new DIYarrayList<Integer>();
        int itemsCount = 40;

        System.out.println("inserting records...");
        for (int index = 0; index < itemsCount; index++) {
            list.add((int) (Math.random() * 100));
        }


        System.out.println("printing records with for loop...");
        for (int index = 0; index < itemsCount; index++) {
            Integer inserted = list.get(index);
            System.out.println(inserted);
        }


        System.out.println("printing records with iterator...");
        for (Integer item : list) {
            System.out.println(item);
        }

        System.out.println("removing first record...");
        Integer nextVal = list.get(1);
        Integer removed = list.remove(0);
        System.out.println("removed : " + removed);
        assert nextVal.equals(list.get(0));
        System.out.println("new zero element " + list.get(0) + " width array size: " + list.size());
        assert list.size() == itemsCount - 1;


        System.out.println("validating collections.copy()...");
        DIYarrayList<Integer> newList = new DIYarrayList<>(list.size());
        Collections.copy(newList, list);

        assert newList.size() == list.size();

        for (int index = 0; index < list.size(); index++) {
            assert list.get(index).equals(newList.get(index));
        }

        System.out.println("validating collections.sort()...");

        Collections.sort(list);

        Integer prevItem = null;
        for (int index = 0; index < list.size(); index++) {

            if(index == 0) {
                prevItem = list.get(index);
                continue;
            }

            assert list.get(index) > prevItem;
            prevItem = list.get(index);
        }

        System.out.println("validating collection.addAll()...");

        ArrayList<Integer> newList2 = new ArrayList<>(Arrays.asList(12, 14));
        int sizeBeforeAddAll = list.size();

        list.addAll(newList2);

        assert sizeBeforeAddAll + 2 == list.size();
        assert list.get(0) == 12;
        assert list.get(1) == 14;


        System.out.println("validating collection.addAll(index)...");

        ArrayList<Integer> newList3 = new ArrayList<>(Arrays.asList(18, 22));
        int sizeBeforeAddAllWithIndex = list.size();

        list.addAll(2, newList3);

        assert sizeBeforeAddAllWithIndex + 2 == list.size();
        assert list.get(2) == 18;
        assert list.get(3) == 22;

    }

}
