package ab.tjl.service;

import ab.tjl.domain.Product;

import java.util.List;

/**
 * @author:tangjilin
 * @Description:服务层产品接口
 * @Date:Created in 17:22 2019/7/23
 * @Modified By:
 */
public interface IProductService {

    /**
     * Descrption:查询所有产品
     * @Param: []
     * @Return: java.util.List<Product>
     */
    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
