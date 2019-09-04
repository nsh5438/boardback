package kr.hs.dgsw.notice_back.Controller;

import kr.hs.dgsw.notice_back.Domain.Board;
import kr.hs.dgsw.notice_back.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@CrossOrigin(origins = "*")
public class BoardController {

    @Autowired
    BoardService boardService;


    @GetMapping(value = "/getList/updated")
    public List<Board> getList(@RequestParam(value="kind", required = false) String kind) { return this.boardService.getList(kind); }

    @GetMapping(value = "/getList/like_num")
    public List<Board> getSortLike(@RequestParam(value="kind", required = false) String kind) {return this.boardService.getSortLike(kind);}

    @GetMapping(value = "/getList/view_num")
    public List<Board> getSortView(@RequestParam(value="kind", required = false) String kind) {return this.boardService.getSortView(kind);}

    @PostMapping(value = "/addPost")
    public Long addPost(@RequestBody Board board) { return this.boardService.addPost(board); }

    @GetMapping(value = "/getView/{id}")
    public Board getView(@PathVariable Long id) { return this.boardService.getView(id); }

    @PutMapping(value = "/updateLike")
    public int updateLike(@RequestBody Board board) { return this.boardService.updateLike(board); }

    @PutMapping(value = "/updateView")
    public int updateView(@RequestBody Board board) { return this.boardService.updateView(board); }

    @PutMapping(value = "/updatePost")
    public int updatePost(@RequestBody Board board) { return this.boardService.updatePost(board); }

    @DeleteMapping(value = "/deletePost/{id}")
    public int deletePost(@PathVariable Long id) {return this.boardService.deletePost(id);}

    @GetMapping(value = "/getListByUser/{id}")
    public List<Board> getListByUser (@PathVariable Long id) { return this.boardService.getListByUser(id); }


}
