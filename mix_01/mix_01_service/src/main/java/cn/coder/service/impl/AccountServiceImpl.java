package cn.coder.service.impl;

import cn.coder.dao.AccountMapper;
import cn.coder.domain.Account;
import cn.coder.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: Surprise Mother Fucker
 * @Author: ZY
 * @CreateDate: 2019/3/21 16:40
 * @Version: 1.0
 */

/**
 * 账户业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Account> findAll() {
//        System.out.println("Service的findAll....");
        return accountMapper.findAll();
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public List<Account> findById(Integer id) {

//        System.out.println("Service的findById....");
        return accountMapper.findById(id);
    }

    /**
     * 更新账户
     *
     * @param account
     * @return
     */
    @Override
    public void updateAccount(Account account) {
        int count = accountMapper.updateAccount(account);
    }


    /**
     * 转账业务
     *
     * @param outAccount
     * @param targetAccount
     * @param money
     */
    @Override
    public void transfer(Integer outAccount, Integer targetAccount, Integer money) {
        //转出账户
        Account outAcc = (accountMapper.findById(outAccount)).get(0);
        if (outAcc == null) {
            throw new RuntimeException("用户不存在");
        }
        if (outAcc.getMoney() < money) {
            throw new RuntimeException("余额不足");
        }
        //转入账户
        Account targetAcc = accountMapper.findById(targetAccount).get(0);
        if (targetAcc == null) {
            throw new RuntimeException("用户不存在");
        }

        outAcc.setMoney(outAcc.getMoney() - money);

        targetAcc.setMoney(targetAcc.getMoney() + money);

//        int i = 10 / 0;
        accountMapper.updateAccount(outAcc);

        accountMapper.updateAccount(targetAcc);
    }
}
