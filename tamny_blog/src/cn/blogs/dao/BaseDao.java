package cn.blogs.dao;

public class BaseDao {

	public void add(Object entity) {
		HibernateUtil.add(entity);
	}

	public void delete(Object entity) {
		HibernateUtil.delete(entity);
	}

	public void update(Object entity) {
		HibernateUtil.update(entity);
	}
	
}
