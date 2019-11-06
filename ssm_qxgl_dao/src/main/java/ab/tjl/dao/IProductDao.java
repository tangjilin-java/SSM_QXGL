package ab.tjl.dao;

import ab.tjl.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author:tangjilin
 * @Description:产品操作接口
 * @Date:Created in 17:16 2019/7/23
 * @Modified By:
 */
public interface IProductDao {

    /**
     * Descrption查询所有产品信息:
     * @Param: []
     * @Return: java.util.List<Product>
     */
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    /**
     * Descrption: 添加产品
     * @Param: [product]
     * @Return: void
     */
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);

    //根据id查询产品
    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;
}
