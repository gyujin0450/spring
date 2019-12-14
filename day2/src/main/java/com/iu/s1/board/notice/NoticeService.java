package com.iu.s1.board.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s1.board.BoardService;
import com.iu.s1.board.BoardVO;
import com.iu.s1.files.FileDAO;
import com.iu.s1.files.FileVO;
import com.iu.s1.util.FileSave;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;	// Service는 DAO에 의존성이 있음!!

	@Autowired
	private ServletContext servletContext; // ???
	
	@Autowired
	private FileSave fileSave;
	
	@Autowired
	private FileDAO fileDAO;
	
	@Override
	public int boardWrite(BoardVO boardVO, MultipartFile [] files) throws Exception {
		
		String realPath = servletContext.getRealPath("resources/upload");
		System.out.println(realPath);
		
		int result = noticeDAO.boardWrite(boardVO);
		
		for(MultipartFile multipartFile : files) {
			if(multipartFile != null) {
				String filename = fileSave.save2(realPath, multipartFile);
				FileVO fileVO = new FileVO();
				fileVO.setNum(boardVO.getNum());
				fileVO.setFname(filename);
				fileVO.setOname(multipartFile.getOriginalFilename());
				
				result=fileDAO.fileWriter(fileVO);
				
			}
		}
		
		return result; // noticeDAO.boardWrite(boardVO);
	}

	@Override
	public int boardUpdate(BoardVO boardVO) throws Exception {
		return noticeDAO.boardUpdate(boardVO);
	}

	@Override
	public int boardDelete(BoardVO boardVO) throws Exception {
		return noticeDAO.boardDelete(boardVO);
	}

	@Override
	public List<BoardVO> boardList() throws Exception {
		return noticeDAO.boardList();
	}

	@Override
	public BoardVO boardSelect(BoardVO boardVO) throws Exception {
		return noticeDAO.boardSelect(boardVO);
	}

}
