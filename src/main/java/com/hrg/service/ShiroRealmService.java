/**
 *
 */
package com.hrg.service;

import java.util.List;
import java.util.Map;


public interface ShiroRealmService {
	 /**
     * 获取完整的身份信息对象<br>
     * @param principal:用户输入的身份信息<br>
     * @return 用户对象<br>
     */
    public Object getLoginUser(Object principal) throws Exception;

    /**
     * 获取用户凭证信息<br>
     * @param principal:用户输入的身份信息<br>
     * @return 用户凭证对象<br>
     */
    public Object getUserCredentials(Object principal) throws Exception;;

    /**
     * 方法说明：获取用户拥有的角色<br>
     * 
     * @param principal:用户<br>
     * @return 角色集合<br>
     */
    public List<String> getHaveRoleStringByUser(Object principal) throws Exception;;

    /**
     * 方法说明：获取用户拥有的角色<br>
     * @param principal:用户<br>
     * @return 角色对象集合<br>
     */
    public List<? extends Object> getHaveRoleByUser(Object principal) throws Exception;;


    /**
     * 方法说明：获取用户拥有的权限<br>
     * @author 杨应铭 2015年11月5日 上午10:42:13<br>
     * @param principal:用户<br>
     * @return 权限集合<br>
     */
    public List<String> getPermissionStringByUser(Object principal) throws Exception;;


    /**
     * 方法说明：获取用户拥有的权限<br>
     * @param principal:用户<br>
     * @return 权限对象集合
     */
    public List<? extends Object> getPermissionByUser(Object principal) throws Exception;;


    /**
     * 方法说明：获取所有有效权限<br>
     * 用于在ShiroPermissionFilter过滤器中进行地址过滤<br>
     * 返回数据格式：Map集合中key存储url地址信息，value存储需要的权限信息<br>
     * @author 杨应铭 2015年11月5日 上午10:42:04<br>
     * @return
     */
    public List<Map<String,String>> getAllPermission()throws Exception;;

    /**
     * 方法说明：用户是否被锁定<br>
     * @param principal:用户<br>
     * @return true:是　false:否<br>
     */
    public boolean isLocked(Object principal);

}
