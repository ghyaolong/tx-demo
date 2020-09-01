package com.cube.txdemo.service.impl;

import com.cube.txdemo.dao.SysBalanceDao;
import com.cube.txdemo.dao.SysLogDao;
import com.cube.txdemo.entity.SysBalance;
import com.cube.txdemo.entity.SysLog;
import com.cube.txdemo.service.SysBalanceService;
import com.cube.txdemo.service.SysLogService;
import com.cube.txdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.SQLException;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/9/1 11:18
 * @DESC
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysBalanceService sysBalanceService;

    @Autowired
    private SysLogService sysLogService;

    @Transactional
    @Override
    public void transfer(BigDecimal amount) throws SQLException{
        sysBalanceService.updateBalance(amount);
        sysLogService.addLog("zhangsan",amount);
        if(true) throw new SQLException("sql异常");
        //if(true) throw new RuntimeException("RunTime异常");
    }
}
