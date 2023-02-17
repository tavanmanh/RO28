package copy;

import com.reupneverdie.model.AppParam;
import lombok.Data;

import java.util.Date;

@Data
public class AppParamDto extends PaginationDto {

    private Long id;
    private String parType;
    private String parCode;
    private String parName;
    private String parValue;
    private Date createdDate;
    private Date updatedDate;
    private String description;
    private Long status;

    public AppParam toModel() {
        AppParam bo = new AppParam();

        bo.setId(this.id);
        bo.setParType(this.parType);
        bo.setParCode(this.parCode);
        bo.setParName(this.parName);
        bo.setParValue(this.parValue);
        bo.setCreatedDate(this.createdDate);
        bo.setUpdatedDate(this.updatedDate);
        bo.setDescription(this.description);
        bo.setStatus(this.status);

        return bo;
    }

}
