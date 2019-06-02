package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.domain.Photo;
import com.service.PhotoService;
import com.util.Base;
import com.util.ToBean;

@Controller
@RequestMapping("/photo")
public class PhotoController extends Base{
    @Autowired
    private PhotoService photoservice;
    
/*    @RequestMapping("/")
    public String index() {
    	return "system/photo";
    }*/
    @RequestMapping("/a")
    @ResponseBody
    public String index1() {
    	System.out.println("-----");
    	return "testUpload";
    }
    
    @RequestMapping("/")
    public String list(Model model){
    	List<Photo> list=photoservice.listAll();
    	model.addAttribute("photos", list);
    	return "system/photo";
    }
    //private String path="D:/Spai/picture/";
    @RequestMapping(value="/insert")
    @ResponseBody    
    public String insert(@RequestParam("file") MultipartFile file ,String photo) {
    	System.out.println("photo---"+photo);
    	String path="/Spai/picture/";
    	try {
			if(file.isEmpty()) {
				System.out.println("文件为空");
				return "fail";
			}
			String filename=file.getOriginalFilename();
			System.out.println("文件名字："+filename);
			path=path+filename;
			String lastName=file.getOriginalFilename().substring(filename.lastIndexOf("."));
			System.out.println("文件的后缀名为："+lastName);
			File filePath=new File(path);
			if(!filePath.getParentFile().exists()) {//判断这个文件夹 是否存在在
				filePath.getParentFile().mkdir();//不存在就创建这个文件夹
			}
			file.transferTo(filePath);//传输到指定的路径
			return "suss";
		} catch (Exception e) {
			// TODO: handle exception
		}
        return "fail";  
    }
    
    @RequestMapping(value="/insertInfo",method=RequestMethod.POST)
    @ResponseBody
    public String insertInfo(@RequestBody String photo) {
    	System.out.println("收到的位置： :"+photo.toString());
    	Photo photoA=ToBean.stringtobean_Photo(photo);
		return isOK(photoservice.insert(photoA));
    	
    }
    /**
             * 根据用户id查询上传的照片
     * */
    @ResponseBody
    @RequestMapping("listPhotoByid")
    public  List<Photo> listPhotoByid(@RequestBody String id) {
    	
    	List<Photo> list=photoservice.listPhotoByid(Integer.parseInt(id));
    	return list;
    }
    @RequestMapping("/upload2")    
    @ResponseBody    
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {    
        if (!file.isEmpty()) {    
            try {    
                /*   
                 * 这段代码执行完毕之后，图片上传到了工程的跟路径； 大家自己扩散下思维，如果我们想把图片上传到   
                 * d:/files大家是否能实现呢？ 等等;   
                 * 这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如： 1、文件路径； 2、文件名；   
                 * 3、文件格式; 4、文件大小的限制;   
                 */    
                BufferedOutputStream out = new BufferedOutputStream(    
                        new FileOutputStream(new File(    
                                file.getOriginalFilename())));    
                System.out.println(file.getName());  
                out.write(file.getBytes());    
                out.flush();    
                out.close();    
            } catch (FileNotFoundException e) {    
                e.printStackTrace();    
                return "上传失败," + e.getMessage();    
            } catch (IOException e) {    
                e.printStackTrace();    
                return "上传失败," + e.getMessage();    
            }    
   
            return "上传成功";    
    
        } else {    
            return "上传失败，因为文件是空的.";    
        }    
    }    
}
