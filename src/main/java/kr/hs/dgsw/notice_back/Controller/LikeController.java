package kr.hs.dgsw.notice_back.Controller;

import kr.hs.dgsw.notice_back.Domain.Like;
import kr.hs.dgsw.notice_back.Service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/like")
@CrossOrigin(origins = "*")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @PostMapping(value = "/addLike")
    public Long addLike(@RequestBody Like like){
        return this.likeService.addLike(like);
    }

    @GetMapping(value = "/getTotalLike/{id}")
    public Long getTotalLike(@PathVariable Long id){
        return this.likeService.getTotalLike(id);
    }

}
