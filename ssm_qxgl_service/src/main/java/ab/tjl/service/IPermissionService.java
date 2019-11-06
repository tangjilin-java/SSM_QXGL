package ab.tjl.service;


import ab.tjl.domain.Permission;

import java.util.List;
/**
 * @author:tangjilin
 * @Description:服务层权限管理接口
 * @Modified By:
 */
public interface IPermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;

    Permission findById(String id) throws Exception;

    void deleteById(String id) throws Exception;
}
