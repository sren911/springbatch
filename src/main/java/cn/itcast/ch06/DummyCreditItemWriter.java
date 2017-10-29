package cn.itcast.ch06;

import org.springframework.batch.item.ItemWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sren on 2017/6/11.
 */
public class DummyCreditItemWriter implements ItemWriter<CreditBill> {

    public List<CreditBill> creditBills = new ArrayList<CreditBill>();

    public void write(List<? extends CreditBill> items) throws Exception {
        creditBills.addAll(items);
    }

    public List<CreditBill> getCredits() {
        return creditBills;
    }
}
