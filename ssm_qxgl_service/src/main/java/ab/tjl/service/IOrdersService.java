package ab.tjl.service;

import ab.tjl.domain.Orders;

import java.util.List;
/**
 * @author:tangjilin
 * @Description:服务层订单接口
 * @Modified By:
 */
public interface IOrdersService {


    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
