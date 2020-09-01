package com.cube.txdemo.service;

import java.math.BigDecimal;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/9/1 11:38
 * @DESC
 */
public interface SysLogService {

    void addLog(String userName, BigDecimal amount);
}
