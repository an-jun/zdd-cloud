package anjun.zdd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author anjun
 * @since 2018-11-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "addr_id", type = IdType.AUTO)
    private Long addrId;

    private Long userId;

    private String receiverName;

    private String receiverPhone;

    private String receiverMobile;

    private String receiverCity;

    private String receiverAddress;

    private LocalDateTime created;

    private LocalDateTime updated;


}
