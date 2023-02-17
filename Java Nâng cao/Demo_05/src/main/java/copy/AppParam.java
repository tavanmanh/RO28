package copy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "UHR_APP_PARAM")
@Data
public class AppParam {

    @Id
//    @GeneratedValue(generator = "sequence")
//    @GenericGenerator(name = "sequence", strategy = "sequence", parameters = {@Parameter(name = "sequence", value = "UHR_APP_PARAM_SEQ")})
    @Column(name = "id")
    private Long id;

    @Column(name = "par_type")
    private String parType;

    @Column(name = "par_code")
    private String parCode;

    @Column(name = "par_name")
    private String parName;

    @Column(name = "par_value")
    private String parValue;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Long status;

    public AppParamDto toDto() {
        AppParamDto dto = new AppParamDto();

        dto.setId(this.id);
        dto.setParType(this.parType);
        dto.setParCode(this.parCode);
        dto.setParName(this.parName);
        dto.setParValue(this.parValue);
        dto.setCreatedDate(this.createdDate);
        dto.setUpdatedDate(this.updatedDate);
        dto.setDescription(this.description);
        dto.setStatus(this.status);

        return dto;
    }

}
