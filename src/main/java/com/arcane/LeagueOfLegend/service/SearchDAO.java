package com.arcane.LeagueOfLegend.service;

import com.arcane.LeagueOfLegend.domain.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "SearchDAO")
public class SearchDAO {

    private final SqlSessionTemplate sqlSession;

    public SearchDAO(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Map<String, Object>> getSummonerInfo(SearchVO searchVO){
        return sqlSession.selectList("champion.getSummonerInfo", searchVO) ;
    }



}
