package ab.tjl.service;

import ab.tjl.domain.Role;
import ab.tjl.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
/**
 * @author:tangjilin
 * @Description:服务层用户信息接口
 * @Modified By:
 */
public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo) throws Exception;

    UserInfo findById(String id) throws Exception;

    List<Role> findOtherRoles(String userId) throws Exception;

    void addRoleToUser(String userId, String[] roleIds);
}
