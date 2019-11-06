package ab.tjl.dao;

import ab.tjl.domain.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/**
 * @author:tangjilin
 * @Description:权限持久层操作接口
 * @Date:Created in 17:16 2019/7/23
 * @Modified By:
 */
public interface IPermissionDao {
    //查询与role关联的所有的权限
    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id} )")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;


    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    @Insert("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission) throws Exception;

    @Select("select * from permission where id=#{id}")
    Permission findById(String id) throws Exception;

    @Delete("delete from role_permission where permissionId=#{id}")
    void deleteFromRole_Permission(String id) throws Exception;

    @Delete("delete from permission where id=#{id}")
    void deleteById(String id) throws Exception ;
}
