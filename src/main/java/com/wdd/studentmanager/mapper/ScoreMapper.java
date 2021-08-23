package com.wdd.studentmanager.mapper;

import com.wdd.studentmanager.domain.Score;
import com.wdd.studentmanager.domain.ScoreStats;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Classname ScoreMapper
 * @Description None
 */
@Repository
public interface ScoreMapper {
    List<Score> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addScore(Score score);

    Score isScore(Score score);

    int editScore(Score score);

    int deleteScore(Integer id);

    List<Score> getAll(Score score);

    ScoreStats getAvgStats(Integer courseid);
}
