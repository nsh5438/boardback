package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.User;

public interface UserService {

    User login(User user);
    Long register(User user);
    int update(User user);

    User findByAccount(String account);

    User findById(Long id);

    int insertImage(User user);
}
