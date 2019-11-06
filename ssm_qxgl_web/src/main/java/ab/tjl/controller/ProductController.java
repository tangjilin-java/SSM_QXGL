package ab.tjl.controller;

import ab.tjl.domain.Product;
import ab.tjl.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * @author:tangjilin
 * @Description:web层：产品控制
 * @Date:Created in 17:44 2019/7/23
 * @Modified By:
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    /**
     * Descrption:查询所有产品
     * @Param: []
     * @Return: org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/findAll.do")
    @RolesAllowed("ADMIN")//表示用户必须具有admin权限的这样的角色才可以访问
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> list = productService.findAll();
        mv.addObject("productList",list);
        mv.setViewName("product-list");
        return mv;
    }

    /**
     * Descrption: 添加产品
     * @Param: [product]
     * @Return: void
     */
    @RequestMapping("/save.do")
    public String save(@RequestBody Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }
}
