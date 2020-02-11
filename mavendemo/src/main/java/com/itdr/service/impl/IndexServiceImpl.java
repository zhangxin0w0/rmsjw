package com.itdr.service.impl;

import com.itdr.dao.IndexDao;
import com.itdr.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.wiring.BeanWiringInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * ClassName: IndexServiceImpl
 * 日期: 2020/2/7 10:58
 *
 * @author Air张
 * @since JDK 1.8
 */

@Service
@Transactional
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexDao indexDao;

    @Autowired
    private TransactionTemplate tt;


    @Override
    public String tm(String aname, String bname, int money) {
        //参数合法性判断，金额不能为负数和0

        //判断B账户是否存在

        //从A账户扣钱
        int i = indexDao.updateByName(aname, money);

        int m = 1 / 0;

        //给B账户加钱
        int i2 = indexDao.updateByName2(bname, money);

        if (i < 0 || i2 < 0) {
            return "转账失败！";
        }
        return "转账成功！";
    }

    @Override
    public void tm2(String aname, String bname, int money) {
        tt.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                //从A账户扣钱
                int i = indexDao.updateByName(aname, money);

//                int m = 1/0;

                //给B账户加钱
                int i2 = indexDao.updateByName2(bname, money);
            }
        });
    }
}
