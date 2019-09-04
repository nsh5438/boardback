package kr.hs.dgsw.notice_back.Domain;

import lombok.Data;

@Data
public class Like {

    private Long id;
    private Long userid;
    private Long authorid;
    private Long boardid;
}
