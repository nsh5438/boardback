package kr.hs.dgsw.notice_back.Protocol;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class AttachmentPro {

    private Long userid;
    private String savepath;
    private String originalname;

    public AttachmentPro(Long userid, String savepath, String originalname) {
        this.userid = userid;
        this.savepath = savepath;
        this.originalname = originalname;

    }
}