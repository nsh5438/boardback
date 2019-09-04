package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Like;
import kr.hs.dgsw.notice_back.Domain.LikeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeMapper likeMapper;
    @Override
    public Long addLike(Like like) {
        return this.likeMapper.addLike(like);
    }

    @Override
    public Long getTotalLike(Long id) {
        return this.likeMapper.getTotalLike(id);
    }
}
