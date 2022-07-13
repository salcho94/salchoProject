package com.salcho.project.good.dao;

import com.salcho.project.good.dto.ReviewDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface ReviewDAO {
    void saveReview(ReviewDTO reviewDTO);
    List<ReviewDTO> getReviews();
    void deleteReview(@Param("id") String id);
}
