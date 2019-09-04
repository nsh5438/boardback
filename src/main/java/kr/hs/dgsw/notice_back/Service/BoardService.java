package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Board;
import kr.hs.dgsw.notice_back.Domain.User;

import java.util.List;

public interface BoardService {


    List<Board> getList(String kind);
    List<Board> getSortLike(String kind);
    List<Board> getSortView(String kind);
    Long addPost(Board board);
    Board getView(Long id);
    int updateLike(Board board);
    int updateView(Board board);
    int updatePost(Board board);
    int deletePost(Long id);
    List<Board> getListByUser(Long id);


}
