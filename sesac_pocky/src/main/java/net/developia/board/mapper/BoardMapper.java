package net.developia.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.developia.board.vo.BoardVO;
import net.developia.board.vo.ClubVO;
import net.developia.util.page.PageObject;

@Repository
public interface BoardMapper {
	
	// 게시판 글 리스트
	public List<BoardVO> list(PageObject pageObject);
	
	// 게시판 리스트 페이지 처리를 위한 전체 데이터 개수
	public Long getTotalRow(PageObject pageObject);
	
	// 글보기 조회수 1증가
	public Integer increase(Long no);
	
	// 글보기
	public BoardVO view(Long no); 
	
	// 글등록
	public Integer write(BoardVO vo);
	
	// 글수정
	public Integer update(BoardVO vo);
	
	//글삭제
	public Integer delete(BoardVO vo);
	
	//getClubId
	 public List<ClubVO> getListClubid();
}