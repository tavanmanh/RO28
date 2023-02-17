package copy;

import com.reupneverdie.common.Constant;
import com.reupneverdie.common.CustomException;
import com.reupneverdie.dto.AppParamDto;
import com.reupneverdie.dto.response.ResponseDto;
import com.reupneverdie.service.UseCase.AppParamServiceUC;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin()
@RestController
@RequestMapping(value = "/app_param")
@Api(tags = "AppParam CRUD")
public class AppParamCrudController {

    @Autowired
    AppParamServiceUC appParamServiceUC;

    @Operation(summary = "Get By ID")
    @GetMapping(path = {"/get-by-id/{id}"})
    public ResponseEntity<ResponseDto> getById(@PathVariable("id") Long id) {
        try {
            AppParamDto appParam = appParamServiceUC.getById(id);
            return ResponseEntity.ok(ResponseDto.success(Constant.ErrorCode.GET_BY_ID_SUCCESS, appParam));
        } catch (CustomException e) {
            return ResponseEntity.ok(ResponseDto.error(e.getErrorCode(), e.getErrorDesc()));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.ok(ResponseDto.error("500", Constant.ErrorCode.GET_BY_ID_FAILURE));
        }
    }

    @Operation(summary = "Delete")
    @DeleteMapping(path = {"/delete/{id}"})
    public ResponseEntity<ResponseDto> delete(@PathVariable("id") Long id) {
        try {
            appParamServiceUC.deleteById(id);
            return ResponseEntity.ok(ResponseDto.success(Constant.ErrorCode.DELETE_SUCCESS, "SUCCESS"));
        } catch (CustomException e) {
            return ResponseEntity.ok(ResponseDto.error("500",e.getErrorCode()));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.ok(ResponseDto.error("500",Constant.ErrorCode.DELETE_FAILURE));
        }
    }

    @Operation(summary = "Add or Edit")
    @PostMapping(path = {"/add-or-edit"})
    public ResponseEntity<ResponseDto> addOrEdit(@RequestBody AppParamDto dto) {
        try {
            AppParamDto result = appParamServiceUC.addOrEdit(dto);
            return ResponseEntity.ok(ResponseDto.success(Constant.ErrorCode.ADD_OR_EDIT_SUCCESS, result));
        } catch (CustomException e) {
            return ResponseEntity.ok(ResponseDto.error("500", e.getErrorDesc()));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.ok(ResponseDto.error("500", Constant.ErrorCode.ADD_OR_EDIT_FAILURE));
        }
    }

    @Operation(summary = "Search")
    @PostMapping(path = {"/search"})
    public ResponseEntity<ResponseDto> search(@RequestBody AppParamDto dto) {
        try {
            ResponseDto result = appParamServiceUC.search(dto);
            return ResponseEntity.ok(ResponseDto.success(Constant.ErrorCode.SEARCH_SUCCESS, result));
        } catch (CustomException e) {
            return ResponseEntity.ok(ResponseDto.error("500", e.getErrorDesc()));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.ok(ResponseDto.error("500", Constant.ErrorCode.SEARCH_FAILURE));
        }
    }


}
