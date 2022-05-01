package com.arcane.LeagueOfLegend.service;

import com.arcane.LeagueOfLegend.domain.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class searchServiceImpl implements SearchService{

    @Autowired
    SearchDAO searchDAO;

    @Override
    public List<Map<String, Object>> search(SearchVO searchVO) {
        return searchDAO.getSummonerInfo(searchVO);
    }



}
