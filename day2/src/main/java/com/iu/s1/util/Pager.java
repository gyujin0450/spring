package com.iu.s1.util;

public class Pager {
	
	private Integer curPage;

	public Integer getCurPage() {
		
		if(this.curPage==null) {
			this.curPage = 1;
		}
		
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

}
