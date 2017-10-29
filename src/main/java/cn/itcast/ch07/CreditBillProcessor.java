package cn.itcast.ch07;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by admin on 2016/11/17.
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill>{

    public CreditBill process(CreditBill creditBill) throws Exception {
        System.out.println(creditBill.toString());
        return creditBill;
    }
}


