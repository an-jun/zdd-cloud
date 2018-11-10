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
public class TItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "itme_id", type = IdType.AUTO)
    private Long itmeId;

    private Integer categoryId;

    private String name;

    private String sellPoint;

    private BigDecimal price;

    private Double stock;

    private String image;

    private String unit;

    private String desc;

    private LocalDateTime created;

    private LocalDateTime updated;


}
