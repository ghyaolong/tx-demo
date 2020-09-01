package com.cube.txdemo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * sys_balance
 * @author 
 */
@Data
public class SysBalance implements Serializable {
    private Integer id;

    private String userName;

    private BigDecimal balance;

    private static final long serialVersionUID = 1L;
}