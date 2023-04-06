package twogtwoj.wherishere.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Comment { // 업체 한줄평

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private Long memberId;

    private Long companyId;

    private String commentContent;

    private LocalDate commentWriteDate;
}
