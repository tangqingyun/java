package cn.blogs.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.blogs.models.Blog;

public class BlogDao extends BaseDao {

	public BlogDao() {

	}

	public Blog getBlogByid(int id) {
		return (Blog) HibernateUtil.getObjectByid(Blog.class, id);
	}

	/**
	 * 根据用户Id与博客Id获取博客实体对象
	 * @param blogId
	 * @param userId
	 * @return
	 */
	public Blog getBlogByUserIdAndBlogId(int blogId, int userId) {
		Session s = null;
		try {
			s = HibernateUtil.getSession();
			String hql = "from Blog where blogId=:blogId and userId=:userId";
			Query q = s.createQuery(hql);
			q.setInteger("blogId", blogId);
			q.setInteger("userId", userId);
			Blog model = (Blog) q.uniqueResult();
			return model;
		} finally {
			if (s != null)
				s.close();
		}
	}

}
