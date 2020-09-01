package com.cube.txdemo.service;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface UserService {

    void transfer(BigDecimal amount) throws SQLException;
}
