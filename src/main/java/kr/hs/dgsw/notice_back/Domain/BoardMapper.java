package kr.hs.dgsw.notice_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<Board> getKind(String kind);
    List<Board> getSortLike_Kind(String kind);
    List<Board> getSortView_Kind(String kind);
    List<Board> getList();
    List<Board> getSortLike();
    List<Board> getSortView();
    Long addPost(Board board);
    Board getView(Long id);
    int updateLike(Board board);
    int updateView(Board board);
    int updatePost(Board board);
    int deletePost(Long id);
    List<Board> getListByUser(Long id);
}
