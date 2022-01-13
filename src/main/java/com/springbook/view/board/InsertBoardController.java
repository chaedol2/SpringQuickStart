//package com.springbook.view.board;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAOSpring;
//
//@Controller
//public class InsertBoardController{
//	
//	@RequestMapping(value="/insertBoard.do")//value는 생략가능
//	public String insertBoard(BoardVO vo, BoardDAOSpring boardDAO) {
//		System.out.println("글 등록 처리");
//		
//		// 1. 사용자 입력 정보 추출
//		//request.setCharacterEncoding("EUC-KR");
////		String title = request.getParameter("title");
////		String writer = request.getParameter("writer");
////		String content = request.getParameter("content");
//		
//		// 2. DB 연동 처리
////		BoardVO vo = new BoardVO();
////		vo.setTitle(title);
////		vo.setWriter(writer);
////		vo.setContent(content);
//		
//		boardDAO.insertBoard(vo);
//		
//		// 3. 화면 네비게이션
//		return "redirect:getBoardList.do";
//		
////		ModelAndView mav = new ModelAndView();
////		mav.setViewName("redirect:getBoardList.do");
////		return mav;
//		
//	}
//}
