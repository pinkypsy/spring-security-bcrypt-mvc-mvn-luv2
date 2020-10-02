package trial;

import java.util.*;

public class Parent {

    public static void main(String[] args) {

        List<? super Number> list = new ArrayList<>();

        Long b = 4000000000000000000L;

        list.add(555);
        list.add(5.1);
        list.add(2_000_000_000);
        list.add(b);

        System.out.println(list);

        List<? extends Number> list1 = new ArrayList<>(Arrays.asList(545, 56.435, 3434, 65));


        System.out.println(list1);

        System.out.println();

//        String aa = new String("bla");
//        String bb = new String("bla");
//        System.out.println(aa.equals(bb));
//        System.out.println(aa == bb);
//        System.out.println(aa.hashCode() + " " + bb.hashCode());
//        System.out.println(aa.intern() == bb.intern());

//        System.out.println(stringX("sven"));
//        System.out.println(stringX("xvideo"));
//        System.out.println(stringX("traxarx"));


        HashMap<Integer, Integer> map1 = new HashMap<>();

        String a = "Sven";
        String c = "Samsung";
        String d = "Philips";
        String e = "Alcatel";
        String f = "Mia";
//        System.out.println(map.size());
        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());

        char m = 'm';

        System.out.println(Character.getNumericValue(m));

        map1.put(10, 1); //10
        map1.put(3, 2); //3
        map1.put(4, 3); //4
        map1.put(2, 4); //2
        map1.put(17, 4); //1
        map1.put(16, 4); //1
        map1.put(98, 4); //2
        map1.put(73, 4); //9

        System.out.println(map1);


    }

    }
