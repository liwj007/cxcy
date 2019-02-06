package com.xdbigdata.cxcy.web.controller;

import com.xdbigdata.cxcy.model.vo.StudentVO;
import com.xdbigdata.cxcy.model.vo.TeacherVO;
import com.xdbigdata.cxcy.service.UserService;
import com.xdbigdata.framework.web.enums.ResponseContentType;
import com.xdbigdata.framework.web.model.JsonResponse;
import com.xdbigdata.framework.web.utils.DownloadUtils;
import com.xdbigdata.framework.web.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

@RestController
@RequestMapping(value = "/util")
public class UtilController {

    String filePath = "/Users/liwenjun/Documents/files/";

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/upload_file", method = RequestMethod.POST)
    public JsonResponse uploadFile(@RequestParam(value = "file") MultipartFile file) {
        String contentType = file.getContentType();   //图片文件类型
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));


        String newName = generateRandomFilename();

        UploadUtils.save(filePath, fileName, file); //原文件名保存

//        UploadUtils.save(filePath, newName + suffixName, file); //随机名称保存

        return JsonResponse.success(newName);
    }

    @RequestMapping(value = "/download_file", method = RequestMethod.GET)
    public void downloadFile(@RequestParam(value = "file") String file, HttpServletResponse response) {
        DownloadUtils.download(file,null,filePath+file,response);
    }

    @RequestMapping(value = "/get_student_info", method = RequestMethod.GET)
    public JsonResponse getStudentInfo(@RequestParam(value = "no") String no) {
        StudentVO vo = userService.searchStudent(no);
        return JsonResponse.success(vo);
    }

    @RequestMapping(value = "/get_teacher_info", method = RequestMethod.GET)
    public JsonResponse getTeacherInfo(@RequestParam(value = "no") String no) {
        TeacherVO vo = userService.searchTeacher(no);
        return JsonResponse.success(vo);
    }

    private String generateRandomFilename() {
        String fourRandom = "";
        //产生4位的随机数(不足4位前加零)
        int randomNum = (int) (Math.random() * 10000);
        fourRandom = randomNum + "";
        int randLength = fourRandom.length();
        if (randLength < 4) {
            for (int i = 1; i <= 4 - randLength; i++)
                fourRandom = fourRandom + "0";
        }
        StringBuilder sb = new StringBuilder("");

        Calendar calendar = Calendar.getInstance();

        sb.append(calendar.get(Calendar.YEAR))
                .append(twoNumbers(calendar.get(Calendar.MONTH) + 1))
                .append(twoNumbers(calendar.get(Calendar.DAY_OF_MONTH)))
                .append(twoNumbers(calendar.get(Calendar.HOUR)))
                .append(twoNumbers(calendar.get(Calendar.MINUTE)))
                .append(twoNumbers(calendar.get(Calendar.SECOND)))
                .append(fourRandom);
        return sb.toString();
    }

    private String twoNumbers(int number) {
        String _number = number + "";
        if (_number.length() < 2) {
            _number = "0" + _number;
        }
        return _number;
    }
}
