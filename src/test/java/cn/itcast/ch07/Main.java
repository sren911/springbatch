package cn.itcast.ch07;

import java.math.BigDecimal;

/**
 * Created by sren on 2017/6/13.
 */
public class Main {
    public static void main(String[] args) {
        double d = 12.1;
        double d2 = 12.2;
        System.out.println(new BigDecimal(d2-d).abs().doubleValue());
        System.out.println(new BigDecimal(d-d2).abs().doubleValue());
    }
}
