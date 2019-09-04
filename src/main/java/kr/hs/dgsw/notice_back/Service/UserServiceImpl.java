package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.User;
import kr.hs.dgsw.notice_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user) {
        return this.userMapper.login(user);
    }

    @Override
    public Long register(User user) {
        return this.userMapper.register(user);
    }

    @Override
    public int update(User user) {
        return this.userMapper.update(user);
    }

    @Override
    public User findByAccount(String account) {
        return this.userMapper.findByAccount(account);
    }

    @Override
    public User findById(Long id) {
        return this.userMapper.findById(id);
    }

    @Override
    public int insertImage(User user) {
        return this.userMapper.insertImage(user);
    }
}
