package ab.tjl.dao;

import ab.tjl.domain.Member;
import org.apache.ibatis.annotations.Select;
/**
 * @author:tangjilin
 * @Description:会员持久层操作接口
 * @Date:Created in 17:16 2019/7/23
 * @Modified By:
 */
public interface IMemberDao {

    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
