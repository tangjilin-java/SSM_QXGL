package ab.tjl.service.impl;

import ab.tjl.dao.IProductDao;
import ab.tjl.domain.Product;
import ab.tjl.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:tangjilin
 * @Description:业务层产品实现类
 * @Date:Created in 17:24 2019/7/23
 * @Modified By:
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    /**
     * Descrption:查询所有方法实现类
     * @Param: []
     * @Return: java.util.List<ab.tjl.domain.Product>
     */
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    /**
     * Descrption: 添加产品方法实现类
     * @Param: [product]
     * @Return: void
     */
    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }
}
