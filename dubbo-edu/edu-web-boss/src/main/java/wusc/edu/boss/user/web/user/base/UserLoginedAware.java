package wusc.edu.boss.user.web.user.base;

import wusc.edu.facade.user.common.entity.PmsUser;



public interface UserLoginedAware {

	/**
	 * 取得登录的用户
	 * 
	 * @return
	 */
	public PmsUser getLoginedUser();
}
