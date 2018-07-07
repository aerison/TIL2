package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.NewsDAO;
import model.vo.NewsVO;

@WebServlet("/news.do")
public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("newsid")!=null) {//newsid 있는 쿼리문자열 -> 읽기 또는 삭제 기능 추가.
			NewsDAO dao = new NewsDAO();
			if(request.getParameter("action").equals("read")) {
				NewsVO vo = dao.listOne(Integer.parseInt(request.getParameter("newsid")));
				//listOne 메소드에 원하는 뉴스의 id값 넣어주기.
				request.setAttribute("read", vo);
			}
			else if(request.getParameter("action").equals("delete")) {
				dao.delete(Integer.parseInt(request.getParameter("newsid")));
				//delete 메소드에 원하는 뉴스의 id값 넣어주기.
			}
		}
		else if(request.getParameter("write")!=null) {
			request.setAttribute("write", true);
		}
		ArrayList<NewsVO> list = new NewsDAO().listAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jspexam/news.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		NewsVO vo = new NewsVO();
		NewsDAO dao = new NewsDAO();
		vo.setWriter(request.getParameter("writer"));
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		if(request.getParameter("action").equals("insert")) {//새로작성
			dao.insert(vo);
		}
		else if(request.getParameter("action").equals("update")) {//업데이트
			vo.setId(Integer.parseInt(request.getParameter("newsid")));
			dao.update(vo);
		}
		ArrayList<NewsVO> list = new NewsDAO().listAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jspexam/news.jsp").forward(request, response);
	}
}
