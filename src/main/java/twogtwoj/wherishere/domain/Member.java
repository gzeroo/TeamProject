package twogtwoj.wherishere.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;


    @Range(min = 5, max = 15)
    private String memberLoginId;

    @Range(min = 8, max = 20)
    private String memberLoginPw;

    @Range(min = 2, max = 100)
    private String memberName;

    private LocalDate memberBirthday;

}
