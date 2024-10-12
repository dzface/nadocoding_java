package chap_10;

import chap_10.converter.Convertable;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        converter.convert(2);
    }
    public static void convertUSD (Convertable converter, int USD) {

    };

}
