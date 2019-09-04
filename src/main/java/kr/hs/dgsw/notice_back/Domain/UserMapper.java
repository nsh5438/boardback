package kr.hs.dgsw.notice_back.Domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User login(User user);

    Long register(User user);

    int update(User user);

    User findByAccount(String account);

    User findById(Long id);

    int insertImage(User user);

}
