package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Board;
import kr.hs.dgsw.notice_back.Domain.BoardMapper;
import kr.hs.dgsw.notice_back.Domain.User;
import kr.hs.dgsw.notice_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper boardMapper;


    @Override
    public List<Board> getList(String kind) {

        if (kind != null){
            return this.boardMapper.getKind(kind);
        }else{
            return this.boardMapper.getList();
        }

    }

    @Override
    public List<Board> getSortLike(String kind) {
        if (kind != null){
            return this.boardMapper.getSortLike_Kind(kind);
        }else{
            return this.boardMapper.getSortLike();
        }
    }

    @Override
    public List<Board> getSortView(String kind) {
        if (kind != null){
            return this.boardMapper.getSortView_Kind(kind);
        }else{
            return this.boardMapper.getSortView();
        }
    }

    @Override
    public Long addPost(Board board) {
        return this.boardMapper.addPost(board);
    }

    @Override
    public Board getView(Long id) {
        return this.boardMapper.getView(id);
    }

    @Override
    public int updateLike(Board board) {
        return this.boardMapper.updateLike(board);
    }

    @Override
    public int updateView(Board board) {
        return this.boardMapper.updateView(board);
    }

    @Override
    public int updatePost(Board board) {
        return this.boardMapper.updatePost(board);
    }

    @Override
    public int deletePost(Long id) {
        return this.boardMapper.deletePost(id);
    }

    @Override
    public List<Board> getListByUser(Long id) {
        return this.boardMapper.getListByUser(id);
    }

}
