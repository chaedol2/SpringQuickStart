<%@ page import="com.springbook.biz.board.impl.BoardDAOSpring"%>
<%@ page import="com.springbook.biz.board.BoardVO"%>
<%@ page contentType="text/html; charset=EUC-KR"%>

<%
	/* // 1. ����� �Է� ���� ����
	request.setCharacterEncoding("EUC-KR");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	// 2. DB ���� ó��
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	
	BoardDAOSpring boardDAO = new BoardDAOSpring();
	boardDAO.insertBoard(vo);
	
	// 3. ȭ�� �׺���̼�
	response.sendRedirect("getBoardList.jsp"); */
%>