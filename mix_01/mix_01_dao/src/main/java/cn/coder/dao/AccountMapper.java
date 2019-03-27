package cn.coder.dao;


import cn.coder.domain.Account;

import java.util.List;


public interface AccountMapper {
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
     *
     * @param account
     * @return
     */
    int updateAccount(Account account);
}
