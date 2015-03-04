package cn.blogs.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.blogs.models.User;

public class UserDao extends BaseDao {

	public UserDao() {

	}

	/**
	 * 用户登陆
	 * @param uname
	 * @param upwd
	 * @return 用户实体对象
	 */
	public User login(String uname, String upwd) {
		Session s = null;
		try {
			s = HibernateUtil.getSession();
			String hql = "from User where username=:uname and userpwd=:upwd";
			Query q = s.createQuery(hql);
			q.setString("uname", uname);
			q.setString("upwd", upwd);
			User user = (User) q.uniqueResult();
			return user;
		} finally {
			if (s != null)
				s.close();
		}
	}

	/**
	 * 根据用户名获取用户实体对象
	 * @param username
	 * @return 用户实体对象
	 */
	public User getUserByUsername(String username) {
		Session s = null;
		try {
			s = HibernateUtil.getSession();
			String hql = "from User where username=:uname";
			Query q = s.createQuery(hql);
			q.setString("uname", username);
			User user = (User) q.uniqueResult();
			return user;
		} finally {
			if (s != null)
				s.close();
		}
	}

	public String regUser(User user) {
		User model = this.getUserByUsername(user.getNickname());
		if (model != null)
			return "用户名已注册";
		this.add(user);
		return null;
	}

	public User getUserByid(int id) {
		return (User) HibernateUtil.getObjectByid(User.class, id);
	}

}
