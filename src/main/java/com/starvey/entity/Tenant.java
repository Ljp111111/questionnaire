package com.starvey.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 *
 * @author LiJiaPeng
 * @email 2741956649@qq.com
 * @date 2022-11-05 15:01:06
 */
@Data
@TableName("tenant")
public class Tenant implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @TableId
    private String id;
    /**
     *
     */
    private Double cost;
    /**
     *
     */
    @TableLogic
    private Integer isDeleted;

}
