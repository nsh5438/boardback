package kr.hs.dgsw.notice_back.Domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeMapper {

    Long addLike(Like like);

    Long getTotalLike(Long id);
}
