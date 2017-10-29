package cn.itcast.ch2;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by admin on 2016/11/17.
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill>{
    
    public CreditBill process(CreditBill item) throws Exception {
        System.out.println(item.toString());
        return item;
    }
}
