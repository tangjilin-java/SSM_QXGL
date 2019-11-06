package ab.tjl.service;


import ab.tjl.domain.Permission;
import ab.tjl.domain.Role;

import java.util.List;
/**
 * @author:tangjilin
 * @Description:服务层角色接口
 * @Modified By:
 */
public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws  Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;

    void deleteRoleById(String roleId) throws Exception;
}
