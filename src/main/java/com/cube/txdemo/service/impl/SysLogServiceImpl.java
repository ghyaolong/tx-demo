package com.cube.txdemo.service.impl;

import com.cube.txdemo.dao.SysLogDao;
import com.cube.txdemo.entity.SysLog;
import com.cube.txdemo.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/9/1 11:39
 * @DESC
 */
@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public void addLog(String userName, BigDecimal amount) {
        SysLog log = new SysLog();
        log.setCreateTime(new Date());
        log.setOperate("转账");
        log.setUserName(userName);
        sysLogDao.insertSelective(log);
    }
}
