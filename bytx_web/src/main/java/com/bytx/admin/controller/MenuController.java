package com.bytx.admin.controller;

import com.bytx.admin.entity.BasicInfo;
import com.bytx.admin.entity.CompanyInfo;
import com.bytx.admin.entity.Media;
import com.bytx.admin.service.BasicInfoQueryService;
import com.bytx.admin.service.CompanyInfoQueryService;
import com.bytx.admin.service.MediaQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController
{
    @Autowired
    private BasicInfoQueryService basicInfoQueryService;

    @Autowired
    private CompanyInfoQueryService companyInfoQueryService;

    @Autowired
    private MediaQueryService mediaQueryService;

    @RequestMapping("/companyBaseInfo")
    public String showCompanyBaseInfo(Map model)
    {
        BasicInfo basicInfo = basicInfoQueryService.selectBasicInfoByStatus();

        model.put("basicInfo", basicInfo);

        return "admin/companybaseinfo";
    }

    @RequestMapping("/companyInfo")
    public String showCompanyInfo(Map model)
    {
        List<CompanyInfo> companyInfoList = companyInfoQueryService.selectAllCompanyInfo();
        model.put("companyInfoList", companyInfoList);

        return "admin/companyinfo";
    }

    @RequestMapping("/companyMedia")
    public String showCompanyMedia(Map model)
    {
        List<Media> mediaList = mediaQueryService.selectAllMedia();
        model.put("mediaList", mediaList);
        
        return "admin/companymedia";
    }

    @RequestMapping("/companyMusic")
    public String showCompanyMusic(Map model)
    {
        return "admin/companymusic";
    }

    @RequestMapping("/companyNews")
    public String showCompanyNews(Map model)
    {
        return "admin/companynews";
    }

    @RequestMapping("/companyRotation")
    public String showCompanyRotation(Map model)
    {
        return "admin/companyrotation";
    }

    @RequestMapping("/companyVideo")
    public String showCompanyVideo(Map model)
    {
        return "admin/companyvideo";
    }

    @RequestMapping("/testFile")
    public String showTestUploadPage()
    {
        return "testUpload";
    }
}
