<%@ page import="com.springbook.biz.board.impl.BoardDAOSpring"%>
<%@ page import="com.springbook.biz.board.BoardVO"%>
<%@ page contentType="text/html; charset=EUC-KR"%>

<%
	/* // 1. 사용자 입력 정보 추출
	request.setCharacterEncoding("EUC-KR");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String seq = request.getParameter("seq");
	
	// 2. DB 연동 처리
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setContent(content);
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAOSpring boardDAO = new BoardDAOSpring();
	boardDAO.updateBoard(vo);
	
	// 3. 화면 네비게이션
	response.sendRedirect("getBoardList.jsp"); */
%>