package com.telecom.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AllInterceptor extends HandlerInterceptorAdapter {

	/**
	 * 在业务处理器处理请求之前被调�?如果返回false 从当前的拦截器往回执行所有拦截器的afterCompletion(),再�?出拦截器�?
	 * 如果返回true 执行下一个拦截器,直到�?��的拦截器都执行完�?再执行被拦截的Controller 然后进入拦截器链,
	 * 从最后一个拦截器�?��执行�?��的postHandle() 接着再从�?���?��拦截器往回执行所有的afterCompletion()
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		/*HttpSession session = request.getSession();
		if (session.getAttribute("info") != null) {
			return true;
		}
		if (request.getRequestURI().contains("login")) {
			return true;
		}
//		request.getRequestDispatcher("/web/jsp/login.jsp").forward(request, response);
		response.sendRedirect("/exam/");
		return false;*/
		return true;
	}

	/**
	 * 在业务处理器处理请求执行完成�?生成视图之前执行的动�?可在modelAndView中加入数据，比如当前时间
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	/**
	 * 在DispatcherServlet完全处理完请求后被调�?可用于清理资源等
	 * 
	 * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}