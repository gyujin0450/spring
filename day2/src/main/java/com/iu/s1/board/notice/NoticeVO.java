package com.iu.s1.board.notice;

import java.util.ArrayList;

import com.iu.s1.board.BoardVO;
import com.iu.s1.files.FileVO;

public class NoticeVO extends BoardVO{
	// BoarVO를 그대로 상속 받음
	
	// FileVO 추가
	private FileVO fileVO;
	private ArrayList<FileVO> files;
	
	public FileVO getFileVO() {
		return fileVO;
	}
	public void setFileVO(FileVO fileVO) {
		this.fileVO = fileVO;
	}
	public ArrayList<FileVO> getFiles() {
		return files;
	}
	public void setFiles(ArrayList<FileVO> files) {
		this.files = files;
	}


}
