package com.xdbigdata.cxcy.web.controller;

import com.xdbigdata.cxcy.model.domain.*;
import com.xdbigdata.cxcy.model.vo.EntryFormVO;
import com.xdbigdata.cxcy.service.*;
import com.xdbigdata.framework.common.model.PageResult;
import com.xdbigdata.framework.web.model.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/competition")
public class CompetitionController {
    @Autowired
    public CompetitionService competitionService;

    @Autowired
    public CompetitionNewsService competitionNewsService;

    @Autowired
    public EntryFormService entryFormService;

    @Autowired
    public CompetitionEntryService competitionEntryService;

    @Autowired
    public EntryReviewService entryReviewService;

    @Autowired
    public CompetitionStudentAwardService studentAwardService;

    @Autowired
    public CompetitionStuAwardToEntryFormService stuAwardToEntryFormService;

    @Autowired
    public CompetitionTeacherAwardService teacherAwardService;

    @Autowired
    public CompetitionTeaAwardToEntryFormService teaAwardToEntryFormService;

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
        competitionService.apply(name, typeId, levelId, categoryId, formId, limit, unit, address, eBeginDate, eEndDate, cBeginDate, cEndDate, files);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public JsonResponse checkCompetition(@RequestParam(value = "res") String res,
                                         @RequestParam(value = "opinion") String opinion,
                                         @RequestParam(value = "id") Integer id) {
        competitionService.check(id, res, opinion);
        return JsonResponse.success(null);
    }

    //发布竞赛公告
    @RequestMapping(value = "/post_comp_notice", method = RequestMethod.POST)
    public JsonResponse postCompetitionNotice(@RequestParam(value = "title") String title,
                                              @RequestParam(value = "content") String content,
                                              @RequestParam(value = "files") List<String> files) {
        competitionNewsService.addNotice(title, content, files);
        return JsonResponse.success(null);
    }

    //发布竞赛报名
    @RequestMapping(value = "/post_comp_entry", method = RequestMethod.POST)
    public JsonResponse postCompetitionEntry(@RequestParam(value = "title") String title,
                                             @RequestParam(value = "content") String content,
                                             @RequestParam(value = "comp_id") Integer compId,
                                             @RequestParam(value = "files") List<String> files) {
        competitionNewsService.addEntry(title, content, compId, files);
        return JsonResponse.success(null);
    }

    //发布竞赛公示
    @RequestMapping(value = "/post_comp_publicity", method = RequestMethod.POST)
    public JsonResponse postCompetitionPublicity(@RequestParam(value = "title") String title,
                                                 @RequestParam(value = "content") String content,
                                                 @RequestParam(value = "comp_id") Integer compId,
                                                 @RequestParam(value = "type") Integer type,
                                                 @RequestParam(value = "files") List<String> files) {
        competitionNewsService.addPublicity(title, content, compId, type, files);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/get_recent_news", method = RequestMethod.POST)
    public JsonResponse getRecentCompetitionNews(@RequestParam(value = "num") Integer num) {
        PageResult<CompetitionNews> res = competitionNewsService.loadNews(0, num);
        return JsonResponse.success(res);
    }

    @RequestMapping(value = "/get_news_list", method = RequestMethod.POST)
    public JsonResponse getRecentCompetitionNews(@RequestParam(value = "page") Integer page,
                                                 @RequestParam(value = "num") Integer num) {
        PageResult<CompetitionNews> res = competitionNewsService.loadNews(page, num);
        return JsonResponse.success(res);
    }


    @RequestMapping(value = "/entry_competition", method = RequestMethod.POST)
    public JsonResponse entryCompetition(@RequestBody EntryFormVO entryFormVO) {
        System.out.println(entryFormVO);
        entryFormService.entry(entryFormVO);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/entry_check", method = RequestMethod.POST)
    public JsonResponse checkEntryForm(@RequestParam(value = "res") String res,
                                         @RequestParam(value = "opinion") String opinion,
                                         @RequestParam(value = "id") Integer id) {
        entryFormService.check(id, res, opinion);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/entry_work", method = RequestMethod.POST)
    public JsonResponse addEntryWork(@RequestParam(value = "eid") Integer eid,
                                       @RequestParam(value = "file") String file) {
        EntryForm form = entryFormService.get(eid);
        if (form==null){
            return JsonResponse.failure("");
        }
        competitionEntryService.addWork(form,file);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/del_entry_work", method = RequestMethod.POST)
    public JsonResponse delEntryWork(@RequestParam(value = "ewid") Integer ewid) {
        competitionEntryService.deleteWork(ewid);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/add_review_final", method = RequestMethod.POST)
    public JsonResponse addReviewFinalPart(@RequestParam(value = "eid") Integer eid,
                                           @RequestParam(value = "res") String res,
                                     @RequestParam(value = "score") double score,
                                     @RequestParam(value = "opinion") String opinion) {
        entryReviewService.addReviewFinalPart(eid,res,score,opinion);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/add_review_file", method = RequestMethod.POST)
    public JsonResponse addReviewFilePart(@RequestParam(value = "eid") Integer eid,
                                           @RequestParam(value = "file") String file) {
        entryReviewService.addReviewFilePart(eid,file);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/add_review_opinion", method = RequestMethod.POST)
    public JsonResponse addReviewOpinionPart(@RequestParam(value = "eid") Integer eid,
                                             @RequestParam(value = "name") String name,
                                             @RequestParam(value = "score") double score,
                                             @RequestParam(value = "opinion") String opinion) {
        entryReviewService.addReviewOpinionPart(eid,name,score,opinion);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/add_student_award", method = RequestMethod.POST)
    public JsonResponse addStudentAward(@RequestParam(value = "compid") Integer compId,
                                             @RequestParam(value = "name") String name,
                                             @RequestParam(value = "desc") String desc) {
        Competition competition = competitionService.get(compId);
        if (competition==null){
            return JsonResponse.failure("");
        }
        studentAwardService.addAward(competition,name,desc);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/distribute_student_award", method = RequestMethod.POST)
    public JsonResponse distributeStudentAward(@RequestParam(value = "aid") Integer awardId,
                                        @RequestParam(value = "tids") List<Integer> teamIds) {
        CompetitionStudentAward studentAward = studentAwardService.get(awardId);
        if (studentAward==null){
            return JsonResponse.failure("");
        }

        stuAwardToEntryFormService.addStudentAward(studentAward,teamIds);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/add_teacher_award", method = RequestMethod.POST)
    public JsonResponse addTeacherAward(@RequestParam(value = "compid") Integer compId,
                                        @RequestParam(value = "name") String name,
                                        @RequestParam(value = "desc") String desc) {
        Competition competition = competitionService.get(compId);
        if (competition==null){
            return JsonResponse.failure("");
        }
        teacherAwardService.addAward(competition,name,desc);
        return JsonResponse.success(null);
    }


    @RequestMapping(value = "/distribute_teacher_award", method = RequestMethod.POST)
    public JsonResponse distributeTeacherAward(@RequestParam(value = "aid") Integer awardId,
                                               @RequestParam(value = "tids") List<Integer> teamIds) {
        CompetitionTeacherAward teacherAward = teacherAwardService.get(awardId);
        if (teacherAward==null){
            return JsonResponse.failure("");
        }

        teaAwardToEntryFormService.addTeacherAward(teacherAward,teamIds);
        return JsonResponse.success(null);
    }


    @RequestMapping(value = "/summary", method = RequestMethod.POST)
    public JsonResponse distributeTeacherAward(@RequestParam(value = "compid") Integer compId,
                                               @RequestParam(value = "content") String content,
                                               @RequestParam(value = "files") List<String> files) {

        competitionService.summary(compId,content,files);
        return JsonResponse.success(null);
    }

}
