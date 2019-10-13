import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.List;

public class HelloOtus {

    public static void main (String[] args){
        List<Integer> countUp = Ints.asList(1, 2, 3, 4, 5);
        List<Integer> reverse = Lists.reverse(countUp);
        for (Integer item : reverse){
            System.out.println(item);
        }

    }

}
