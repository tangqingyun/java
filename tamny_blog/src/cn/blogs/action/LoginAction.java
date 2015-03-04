package cn.blogs.action;

import java.util.Date;

import cn.blogs.dao.UserDao;
import cn.blogs.models.User;

public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private UserDao userdao;

	public LoginAction() {
		userdao = new UserDao();
	}

	@Override
	public String execute() {
		System.out.println();
		return SUCCESS;
	}

	/**
	 * 用户登陆
	 * @return
	 */
	public String login() {
		User userModel = userdao.login(user.getUsername(), user.getUserpwd());
		if (userModel == null) {
			System.out.println("用户不存在，登陆失败！");
			return SUCCESS;
		}
		this.session().setAttribute("usermodel", userModel);
		return SUCCESS;
	}

	/**
	 * 用户注册
	 * @return
	 */
	public String reg() {
		user.setRegdate(new Date());
		String message = userdao.regUser(user);
		if (message == null) {
			System.out.println("添加成功！");
		} else {
			System.out.println("注册失败！");
		}
		return SUCCESS;
	}

	/*
	 * @Override public void validate() {
	 * 
	 * if (user.getUserName() == null || user.getUserName().trim().length() < 1)
	 * { addFieldError("no.username", "must input username"); } if
	 * (user.getUserPwd() == null || user.getUserPwd().trim().length() < 1) {
	 * addFieldError("no.password", "must intpu password"); }
	 * 
	 * }
	 */

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
