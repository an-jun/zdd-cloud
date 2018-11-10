package anjun.zdd.service.impl;

import anjun.zdd.entity.TOrder;
import anjun.zdd.mapper.TOrderMapper;
import anjun.zdd.service.ITOrderService;
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
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements ITOrderService {

}
