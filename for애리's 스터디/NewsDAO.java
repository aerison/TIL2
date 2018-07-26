package model.dao;
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.vo.NewsVO;

public class NewsDAO {
	private Connection connectDBCP() {
		try {
			return ((DataSource)new InitialContext().lookup("java:comp/env/jdbc/oraDB")).getConnection();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean insert(NewsVO vo) {
		boolean result = true;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = connectDBCP();//conn객체 null이면 널포인터 예외 발생.
			pstmt = conn.prepareStatement("insert into news values(news_seq.nextval,?,?,?,sysdate,0)");
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			result = false;
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if( conn!=null)
					conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;//insert 성공여부
	}
	public boolean update(NewsVO vo) {
		boolean result = true;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = connectDBCP();//conn객체 null이면 널포인터 예외 발생.
			pstmt = conn.prepareStatement("UPDATE news SET writer=?, title=?, content=? where id = ?");
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setInt(4, vo.getId());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			result = false;
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if( conn!=null)
					conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;//update 성공여부
	}
	public boolean delete(int id) {
		boolean result = true;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = connectDBCP();//conn객체 null이면 널포인터 예외 발생.
			pstmt = conn.prepareStatement("DELETE from news where id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			result = false;
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if( conn!=null)
					conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;//delete 성공여부
	}
	public ArrayList<NewsVO> listAll(){
		ArrayList<NewsVO> list = new ArrayList<NewsVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = connectDBCP();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news");
			while(rs.next()) {
				NewsVO vo = new NewsVO();
				vo.setId(Integer.parseInt(rs.getString("id")));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriteDate(rs.getString("writedate"));
				vo.setCnt(Integer.parseInt(rs.getString("cnt")));
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if( conn!=null)
					conn.close();			
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public NewsVO listOne(int id){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		NewsVO vo = new NewsVO();
		try {
			conn = connectDBCP();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news where id="+id);
			while(rs.next()) {
			vo.setId(Integer.parseInt(rs.getString("id")));
			vo.setWriter(rs.getString("writer"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("content"));
			vo.setWriteDate(rs.getString("writedate"));
			vo.setCnt(Integer.parseInt(rs.getString("cnt")));
			stmt.executeQuery("UPDATE news SET cnt="+(vo.getCnt()+1)+"where id = "+id);
			//하나씩 눌러서 볼 때마다 조회수 +1
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if( conn!=null)
					conn.close();			
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}
}
