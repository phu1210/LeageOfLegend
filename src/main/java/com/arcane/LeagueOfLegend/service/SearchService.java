package com.arcane.LeagueOfLegend.service;

import com.arcane.LeagueOfLegend.domain.SearchVO;

import java.util.List;
import java.util.Map;

public interface SearchService {
    List<Map<String, Object>> search (SearchVO searchVO) throws Exception;
}
