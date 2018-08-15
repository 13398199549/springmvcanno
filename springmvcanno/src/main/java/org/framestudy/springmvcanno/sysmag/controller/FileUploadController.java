package org.framestudy.springmvcanno.sysmag.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
/**
 * 文件上传
 * @author DELL
 *
 */
@RequestMapping(value="/files")
@Controller
public class FileUploadController {
	
	/**
	 * springmvc框架的单文件上传
	 * @param file 临时文件对象
	 * @return
	 */
	@RequestMapping(value="/upload",method= {RequestMethod.POST})
	public String fileUpload(@RequestParam("fileName")CommonsMultipartFile file,String fileDescrible) {
		String fileName = file.getOriginalFilename();
		System.out.println(fileName);
		System.out.println(fileDescrible);
		
		String path = "d:\\files";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		path = path + File.separator + fileName;
		//将临时文件写入到真实文件中去
		try {
			file.getFileItem().write(new File(path));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}
	
	/**
	 * springmvc框架的多文件上传
	 * @param file 临时文件对象
	 * @return
	 */
	@RequestMapping(value="/multi/upload",method= {RequestMethod.POST})
	public String fileUpload(@RequestParam("fileName")CommonsMultipartFile[] files,String fileDescrible) {
		for (CommonsMultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			System.out.println(fileDescrible);
			
			
		}
		
		return "index";
	}
	
}
