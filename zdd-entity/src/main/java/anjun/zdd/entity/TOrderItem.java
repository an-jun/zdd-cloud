package anjun.zdd.entity;

import java.math.BigDecimal;
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
public class TOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_item_id", type = IdType.AUTO)
    private Long orderItemId;

    private Long orderId;

    private Integer itemId;

    private String itemName;

    private BigDecimal itemPrice;

    private Integer itemNum;

    private String itemUnit;

    private String itemImage;

    private Double payAmount;

    private LocalDateTime created;

    private LocalDateTime updated;


}
