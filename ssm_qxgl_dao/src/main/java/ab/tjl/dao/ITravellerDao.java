package ab.tjl.dao;

import ab.tjl.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/**
 * @author:tangjilin
 * @Description:旅客持久层操作接口
 * @Date:Created in 17:16 2019/7/23
 * @Modified By:
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
