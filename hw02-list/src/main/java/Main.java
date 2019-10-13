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


        System.out.println("validating collections.copy()...");
        DIYarrayList<Integer> newList = new DIYarrayList<Integer>(list.size());
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

    }

}
