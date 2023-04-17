package com.a_cup_of_tea.bll;

/**
 *user业务逻辑接口
 * @author Isa Huang
 */
public interface UserBll {
    /**
     *
     * @param username
     * @param password
     * @return 返回是否登陆成功
     */
    boolean login(String username, String password);

    /**
     *
     * @param username
     * @param password
     * @return 返回是否修改成功
     */
    boolean changePassword(String username, String password);

    /**
     *
     * @param username
     * @param password
     * @param remark
     * @return 返回是否注册成功
     */
    boolean register(String username, String password, String remark);
}
