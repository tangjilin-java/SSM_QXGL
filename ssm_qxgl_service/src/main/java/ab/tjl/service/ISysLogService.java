package ab.tjl.service;


import ab.tjl.domain.SysLog;

import java.util.List;
/**
 * @author:tangjilin
 * @Description:服务层日志接口
 * @Modified By:
 */
public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll(int page, int size) throws Exception;
}
