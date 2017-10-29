package cn.itcast.ch06;

import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.JsonLineMapper;

import java.util.Map;

/**
 * Created by sren on 2017/6/11.
 */
public class WrappedJsonLineMapper implements LineMapper<CreditBill> {
    private JsonLineMapper delegate;
    @Override
    public CreditBill mapLine(String line, int lineNumber) throws Exception {
        CreditBill result = new CreditBill();
        Map<String, Object> creditBillMap = delegate.mapLine(line, lineNumber);
        result.setAccountID((String) creditBillMap.get("accountID"));
        result.setAddress((String) creditBillMap.get("address"));
        result.setAmount((Double) creditBillMap.get("amount"));
        result.setDate((String) creditBillMap.get("date"));
        result.setName((String) creditBillMap.get("name"));
        return result;
    }

    public JsonLineMapper getDelegate() {
        return delegate;
    }

    public void setDelegate(JsonLineMapper delegate) {
        this.delegate = delegate;
    }
}
