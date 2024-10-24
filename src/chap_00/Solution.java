package chap_00;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int l = 5;
        int r = 10000000;
        String sl = String.valueOf(l);
        String sr = String.valueOf(r);
        List<String> list = new ArrayList<>();

        String a ="5";
        String b = "5";
        for (int i = 0; i < sl.length()-1; i++) {
            a += "0";
        }
        list.add(a);
        for (int i = sl.length(); i < sr.length(); i++) {
            a = b+"0";
            b = b + "5";
            list.add(a);
            list.add(b);
        }
        for(String i : list) {
            System.out.println(i);
        }
    }
}
