package cn.coder.service;

import cn.coder.domain.Account;

import java.util.List;

/**
 * 账户业务层
 */
public interface AccountService {

    /**
     * 查询所有
     *
     * @return
     */
    List<Account> findAll();


    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    List<Account> findById(Integer id);


    /**
     * 更新账户
     * @param account
     * @return
     */
    void updateAccount(Account account);

    /**
     * 转账业务
     *
     * @param outAccount
     * @param targetAccount
     * @param money
     */
    void transfer(Integer outAccount, Integer targetAccount, Integer money);
}
