package anjun.zdd.service.impl;

import anjun.zdd.entity.TItem;
import anjun.zdd.mapper.TItemMapper;
import anjun.zdd.service.ITItemService;
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
public class TItemServiceImpl extends ServiceImpl<TItemMapper, TItem> implements ITItemService {

}
