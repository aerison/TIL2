<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "model.vo.NewsVO" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<h1>뉴스 게시판</h1>
<table>
	<tr>
		<th>번호</th> <th>제목</th> <th>작성자</th> <th>작성일</th> <th>조회수</th>
	</tr>
	
	<% for(NewsVO vo : (ArrayList<NewsVO>)request.getAttribute("list")){
		%>
		<tr>
			<td><%=vo.getId()%></td> <td><a href="/mvc/news.do?action=read&newsid=<%=vo.getId()%>"><%=vo.getTitle()%></a></td>
			<td><%=vo.getWriter()%></td><td><%=vo.getWriteDate()%></td> <td><%=vo.getCnt()%></td>
		</tr>
		<%
	} %>
</table><br>
<button onclick="location.href='/mvc/news.do?write=true'">뉴스작성</button><br>
<% if(request.getAttribute("read")!=null){
		NewsVO vo = (NewsVO)request.getAttribute("read");
%>		<h1>뉴스 내용</h1>
		<form method="post" action="/mvc/news.do">
		<input type="text" name="writer" value="<%=vo.getWriter()%>" required/><br>
		<input type="text" name="title" value="<%=vo.getTitle()%>"required/><br>
		<textarea name="content" rows="10" cols="40" required><%=vo.getContent()%></textarea><br>
		<button type="button" onclick="location.href='/mvc/news.do'">확인</button>
		<input type="hidden" name="action" value="update"/>
		<input type="hidden" name="newsid" value="<%=vo.getId()%>"/>
		<input type="submit" value="수정">
		<button type="button" onclick="location.href='/mvc/news.do?action=delete&newsid=<%=vo.getId()%>'">삭제</button>
		</form>
	<%
}
else if(request.getAttribute("write")!=null){
	%>
	<form method="post" action="/mvc/news.do">
		<input type="text" name="writer" placeholder="작성자 명을 입력해주세요." required/><br>
		<input type="text" name="title" placeholder="제목을 입력해주세요." required/><br>
		<textarea name="content" rows="10" cols="40" placeholder="내용을 입력해주세요." required></textarea><br>
		<input type="hidden" name="action" value="insert"/>
		<input type="submit" value="저장">
		<input type="reset" value="재작성">
		<button type="button" onclick="location.href='/mvc/news.do'">취소</button>
		</form>
	<%
}
%>
</body>
</html>