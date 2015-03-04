package cn.blogs.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HttpServletRequest request = ServletActionContext.getRequest();

	public HttpServletResponse response = ServletActionContext.getResponse();

	public void write(String content) throws IOException {
		response.getWriter().write(content);
	}

	public ServletContext application = ServletActionContext
			.getServletContext();

	public HttpSession session() {
		return ServletActionContext.getRequest().getSession();
	}

}