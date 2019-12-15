package com.iu.s1.util;

public class Pager {
	
	private Integer curPage;
	
	private int startRow;
	private int lastRow;
	
	private int totalBlock;
	private int curBlock;
	
	private int startNum;
	
	// getter 수정 및 메소드 추가 부분
	
    public void makeRow()throws Exception{
		this.startRow=(this.getCurPage()-1)*10+1;
		this.lastRow = this.getCurPage()*10;
	}
	
	public void makePage(int count)throws Exception{
		//1. count 전체 페이지의 갯수
		int totalPage=count/10;
		if(count%10 != 0) {
			totalPage++;
		}
		
		//totalPage로 totalBlock 구하기
		this.totalBlock = totalPage/5;
		if(totalPage%5 != 0) {
			totalBlock++;
		}
		
		//curPage로 현재 블럭 번호 찾기
		this.curBlock = this.getCurPage()/5;
		if(this.getCurPage()%5 != 0) {
			curBlock++;
		}
		
		//curBlock으로 시작번호와 마지막 번호 계산
		this.startNum = (this.curBlock-1)*5+1;
		this.lastNum = (this.curBlock)*5;
	}
	
	public Integer getCurPage() {
		
		if(this.curPage==null) {
			this.curPage=1;
		}
		
		return curPage;
	}
	
	// setter/getter 자동 생성
	
	public int getTotalBlock() {
		return totalBlock;
	}

	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}

	public int getCurBlock() {
		return curBlock;
	}

	public void setCurBlock(int curBlock) {
		this.curBlock = curBlock;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getLastNum() {
		return lastNum;
	}

	public void setLastNum(int lastNum) {
		this.lastNum = lastNum;
	}

	private int lastNum;
	

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getLastRow() {
		return lastRow;
	}

	public void setLastRow(int lastRow) {
		this.lastRow = lastRow;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	

}

