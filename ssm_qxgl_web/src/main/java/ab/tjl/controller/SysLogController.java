package ab.tjl.controller;

import ab.tjl.domain.SysLog;
import ab.tjl.service.ISysLogService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sysLog")
/**
 * @author:tangjilin
 * @Description:web层：日志控制
 * @Modified By:
 */
public class SysLogController {

    @Autowired
    private ISysLogService sysLogService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) throws Exception {
        ModelAndView mv=new ModelAndView();
       List<SysLog> sysLogList= sysLogService.findAll(page,size);
        //PageInfo就是一个分页Bean
        PageInfo pageInfo = new PageInfo(sysLogList);
       mv.addObject("pageInfo",pageInfo);
       mv.setViewName("syslog-list");
        return mv;
    }
}
