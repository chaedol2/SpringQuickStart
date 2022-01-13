//package com.springbook.view.board;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAOSpring;
//
//@Controller
//public class DeleteBoardController {
//
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo, BoardDAOSpring boardDAO) {
//		System.out.println("글 삭제 처리");
//		
//		// 1. 사용자 입력 정보 추출
////		String seq = request.getParameter("seq");
//		
//		// 2. DB 연동 처리
////		BoardVO vo = new BoardVO();
////		vo.setSeq(Integer.parseInt(seq));
////		
////		BoardDAOSpring boardDAO = new BoardDAOSpring();
//		boardDAO.deleteBoard(vo);
//		
//		// 3. 화면 네비게이션
////		return "getBoardList.do";
////		ModelAndView mav = new ModelAndView();
////		mav.setViewName("redirect:getBoardList.do");
//		return "getBoardList.do";
//	}
//
//}
