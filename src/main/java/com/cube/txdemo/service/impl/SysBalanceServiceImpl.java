package com.cube.txdemo.service.impl;

import com.cube.txdemo.dao.SysBalanceDao;
import com.cube.txdemo.entity.SysBalance;
import com.cube.txdemo.service.SysBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/9/1 11:35
 * @DESC
 */
@Service
public class SysBalanceServiceImpl implements SysBalanceService {
    @Autowired
    private SysBalanceDao sysBalanceDao;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateBalance(BigDecimal amount) {
        SysBalance balance = sysBalanceDao.selectByPrimaryKey(1);
        balance.setBalance(balance.getBalance().subtract(amount));
        sysBalanceDao.updateByPrimaryKeySelective(balance);
        balance = sysBalanceDao.selectByPrimaryKey(2);
        balance.setBalance(balance.getBalance().add(amount));
        sysBalanceDao.updateByPrimaryKeySelective(balance);
    }
}
