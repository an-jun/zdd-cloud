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
public class TSysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sys_user_id", type = IdType.AUTO)
    private Integer sysUserId;

    private String username;

    private String password;

    /**
     * 级别:1最高
     */
    private Integer level;

    private String name;

    private String mobile;

    private String email;

    private String job;

    private LocalDateTime created;

    private LocalDateTime updated;


}
