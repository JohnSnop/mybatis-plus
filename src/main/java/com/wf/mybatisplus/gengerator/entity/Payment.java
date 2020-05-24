package com.wf.mybatisplus.gengerator.entity;

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
 * @author wf
 * @since 2020-05-24
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Payment implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 支付id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

    private String serial;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer version;

    private Integer status;


}
