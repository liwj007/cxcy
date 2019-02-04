package com.xdbigdata.cxcy.web.controller;

import com.xdbigdata.cxcy.model.domain.Competition;
import com.xdbigdata.cxcy.service.CompetitionNewsNoticeService;
import com.xdbigdata.cxcy.service.CompetitionService;
import com.xdbigdata.framework.web.model.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/competition")
public class CompetitionController {
    @Autowired
    public CompetitionService competitionService;

    @Autowired
    public CompetitionNewsNoticeService noticeService;

    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    public JsonResponse applyCompetition(@RequestParam(value = "name") String name,
                                         @RequestParam(value = "type") Integer typeId,
                                         @RequestParam(value = "level") Integer levelId,
                                         @RequestParam(value = "category") Integer categoryId,
                                         @RequestParam(value = "form") Integer formId,
                                         @RequestParam(value = "limit") Integer limit,
                                         @RequestParam(value = "unit") String unit,
                                         @RequestParam(value = "address") String address,
                                         @RequestParam(value = "ebdate") Date eBeginDate,
                                         @RequestParam(value = "eedate") Date eEndDate,
                                         @RequestParam(value = "cbdate") Date cBeginDate,
                                         @RequestParam(value = "cedate") Date cEndDate,
                                         @RequestParam(value = "files") List<String> files) {
        competitionService.apply(name,typeId,levelId,categoryId,formId,limit,unit,address,eBeginDate,eEndDate,cBeginDate,cEndDate,files);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public JsonResponse applyCompetition(@RequestParam(value = "res") String res,
                                         @RequestParam(value = "opinion") String opinion,
                                         @RequestParam(value = "id") Integer id) {
        competitionService.check(id,res,opinion);
        return JsonResponse.success(null);
    }

    //发布竞赛公告
    @RequestMapping(value = "/post_comp_notice", method = RequestMethod.POST)
    public JsonResponse postCompetitionNotice(@RequestParam(value = "title") String title,
                                         @RequestParam(value = "content") String content,
                                         @RequestParam(value = "files") List<String> files) {
        noticeService.addNotice(title,content,files);
        return JsonResponse.success(null);
    }
}
