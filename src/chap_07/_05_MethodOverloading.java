package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(true,true,10);
        b1.record();

        //String
        String s= "BlackBox";
        System.out.println(s.indexOf("a" ));
    }
}
