package com.xdbigdata.cxcy.web.controller;

import com.xdbigdata.cxcy.model.domain.CompetitionLevel;
import com.xdbigdata.cxcy.model.vo.CompetitionLevelVO;
import com.xdbigdata.cxcy.service.CompetitionLevelService;
import com.xdbigdata.framework.web.model.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value = "/setting")
public class SettingController {

    @Autowired
    public CompetitionLevelService competitionLevelService;

    @RequestMapping(value = "/add_comp_level", method = RequestMethod.POST)
    public JsonResponse addCompetitionLevel(@RequestParam(value = "name") String name) {
        competitionLevelService.addNewCompetitionLevel(name);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/del_comp_level", method = RequestMethod.POST)
    public JsonResponse delCompetitionLevel(@RequestParam(value = "id") Integer id) {
        competitionLevelService.deleteCompetitionLevel(id);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/edit_comp_level", method = RequestMethod.POST)
    public JsonResponse editCompetitionLevel(@RequestParam(value = "id") Integer id,
                                            @RequestParam(value = "name") String name) {
        competitionLevelService.updateCompetitionLevel(id,name);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/get_comp_levels", method = RequestMethod.GET)
    public JsonResponse getCompetitionLevels() {
        List<CompetitionLevelVO> lst = competitionLevelService.loadCompetitionLevels();
        return JsonResponse.success(lst);
    }

    @RequestMapping(value = "/upper_comp_level", method = RequestMethod.POST)
    public JsonResponse upperCompetitionLevel(@RequestParam(value = "id") Integer id) {
        competitionLevelService.moveUpCompetitionLevel(id);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/down_comp_level", method = RequestMethod.POST)
    public JsonResponse downCompetitionLevel(@RequestParam(value = "id") Integer id) {
        competitionLevelService.moveDownCompetitionLevel(id);
        return JsonResponse.success(null);
    }
}
