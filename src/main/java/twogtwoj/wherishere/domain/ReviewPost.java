package twogtwoj.wherishere.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class ReviewPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewPostId;

    private Long memberId;

    private Long companyId;

    private String reviewPostTitle;

    private String reviewPostContent;

    private String reviewPostImg;

    private LocalDate reviewPostDate;
}
