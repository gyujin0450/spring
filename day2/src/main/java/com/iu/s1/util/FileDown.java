package com.iu.s1.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

import com.iu.s1.files.FileVO;

@Component
public class FileDown extends AbstractView {

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// custom view 작성 
		FileVO fileVO = (FileVO)model.get("vo");
//		System.out.println(fileVO.getFname());
//		System.out.println(fileVO.getOname());

		String realPath = request.getSession().getServletContext().getRealPath("resources/upload");
		
		File file = new File(realPath, fileVO.getFname());
		
		// 한글
		response.setCharacterEncoding("UTF-8");
		
		// 다운시 파일이름을 인코딩
		String fileName = URLEncoder.encode(fileVO.getOname(), "UTF-8");
		
		// Header 설정
		response.setHeader("Content-Disposition", "attachment;fileName=\""+fileName+"\"");
		response.setHeader("Content-Transfer-Encoding", "binary");
		
		// Stream 설정
		FileInputStream fi = new FileInputStream(file);
		OutputStream os = response.getOutputStream();
		
		FileCopyUtils.copy(fi, os);
		
		os.close();
		fi.close();		
		
	}

}
