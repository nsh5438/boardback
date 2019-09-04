package kr.hs.dgsw.notice_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {

    private Long id;
    private Long userid;
    private String author;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;
    private int like_num;
    private int view_num;
    private String kind;

}
