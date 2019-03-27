package cn.coder.controller;

import cn.coder.domain.Account;
import cn.coder.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Description: Surprise Mother Fucker
 * @Author: ZY
 * @CreateDate: 2019/3/21 16:41
 * @Version: 1.0
 */

/**
 * 账户控制层
 */
@Controller("accountController")
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有
     *
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView mv) {
//        System.out.println("Controller的findAll....");
        List<Account> accounts = accountService.findAll();
        mv.addObject("list", accounts);
        mv.setViewName("success");
        return mv;
    }

    /**
     * 根据ID查询
     *
     * @param
     * @return
     */
    @RequestMapping("/findById")
    public ModelAndView findById(ModelAndView mv, Integer findId) {
//        System.out.println("Controller的findById...");
        List<Account> account = accountService.findById(findId);
        mv.addObject("account", account);
        mv.setViewName("success");
        return mv;
    }


    /**
     * 转账
     * @param outAccount        转出账户
     * @param targetAccount     转入账户
     * @param money             转账金额
     * @return
     */
    @RequestMapping("/transfer")
    public String transfer(Integer outAccount, Integer targetAccount, Integer money) {
//        System.out.println("Controller的findById...");
        accountService.transfer(outAccount, targetAccount, money);
        return "success";
    }
}
