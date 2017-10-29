package cn.itcast.ch07;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by sren on 2017/6/12.
 */
class DestinationItemPreparedStatementSetter implements ItemPreparedStatementSetter<DestinationCreditBill> {
    @Override
    public void setValues(DestinationCreditBill item, PreparedStatement ps) throws SQLException {
        ps.setString(1, item.getId());
        ps.setString(2, item.getAccountID());
        ps.setString(3, item.getName());
        ps.setDouble(4, item.getAmount());
        ps.setString(5, item.getDate());
        ps.setString(6, item.getAddress());
    }
}
