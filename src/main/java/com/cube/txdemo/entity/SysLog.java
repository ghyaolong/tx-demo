package com.cube.txdemo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sys_log
 * @author 
 */
@Data
public class SysLog implements Serializable {
    private Integer id;

    private String userName;

    private String operate;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}