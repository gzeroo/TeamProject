package twogtwoj.wherishere.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class EventPost { // 이벤트 게시판

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventPostId;

    private Long companyId;

    private String eventPostTitle;

    private String eventPostContent;

    private String eventPostImg;

    private LocalDate eventPostWriteDate;
}
