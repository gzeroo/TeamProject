package twogtwoj.wherishere.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Range(min = 5, max = 15)
    private String companyLoginId;

    @Range(min = 8, max = 20)
    private String companyLoginPw;

    private Long companyBusinessId; // 사업자 번호

    @Range(min = 2, max = 100)
    private String companyName;

    private String companyImg;

    private String companyIntroduction;

    private String companyCategory;

    private String companyAddress;

}
