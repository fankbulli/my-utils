package page;

import java.util.Arrays;
import java.util.List;

public class PageTest {
    public static void main(String[] args) {
        int page=1;
        int size=5;
        List<String> stringList= Arrays.asList ("1","2","3","4","5","6","7","8","9","10","11","12","13","14");
        List<Integer> integerList=Arrays.asList (1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        PageUtil<String> stringPageUtil=new PageUtil<> ();
        stringPageUtil.pageUtil (page,size,stringList);
        PageUtil<Integer> integerPageUtil=new PageUtil<> ();
        integerPageUtil.pageUtil (page,size,integerList);
        System.out.println (stringPageUtil);
        System.out.println ("==========================================");
        System.out.println (integerPageUtil);
    }
}
