package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Like;

public interface LikeService {

    Long addLike(Like like);

    Long getTotalLike(Long id);
}
