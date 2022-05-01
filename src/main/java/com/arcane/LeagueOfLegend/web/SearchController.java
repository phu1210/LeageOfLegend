package com.arcane.LeagueOfLegend.web;


import com.arcane.LeagueOfLegend.domain.SearchVO;
import com.arcane.LeagueOfLegend.service.SearchService;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping(value="/")
    public String mainPage() {
        return "index";
    }

    @RequestMapping(value="/search")
    public ModelAndView getSummonerInfo(@ModelAttribute SearchVO searchVO) throws Exception {
        ModelAndView mav = new ModelAndView();

        List<Map<String, Object>> summonList = searchService.search(searchVO);
        mav.setViewName("index");
        mav.addObject(summonList);
        return mav;
    }



}
