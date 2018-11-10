package anjun.zdd.service.impl;

import anjun.zdd.entity.TUser;
import anjun.zdd.mapper.TUserMapper;
import anjun.zdd.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anjun
 * @since 2018-11-10
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
