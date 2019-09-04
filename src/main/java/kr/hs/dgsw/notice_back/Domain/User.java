package kr.hs.dgsw.notice_back.Domain;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String account;
    private String password;
    private String name;
    private String email;
    private String gender;
    private int age;
    private String profile_url;
    private String imagename;
}
