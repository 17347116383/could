package com.huang.auth.mapper;
import com.huang.auth.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.auth.mapper
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */


@Mapper
@Repository // 不添加这个service层 autowired注入该bean会报红，但其实不影响程序正常运行
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User getUerById(@Param("id") int id);
}
