package project.rest.service.controller;

import org.springframework.web.bind.annotation.*;
import project.rest.service.BaseResponse;
import project.rest.data.request.ClientInfoRequest;

@RestController
@RequestMapping("/client")
public class ClientInfoController {

    private final String sharedKey = "KEY";

    private final String SUCCESS_STATUS_NAME = "SUCCESS";
    private final String ERROR_STATUS_NAME = "ERROR";
    private final int HEALTH_OK_STATUS_CODE = 1;
    private final int SUCCESS_STATUS_CODE = 200;
    private final int ERROR_STATUS_CODE = 500;

    @GetMapping
    public BaseResponse health() {
        return new BaseResponse(SUCCESS_STATUS_NAME, HEALTH_OK_STATUS_CODE);
    }

    @PostMapping("/info")
    public BaseResponse getClientInfo(@RequestParam String key, @RequestBody ClientInfoRequest request) {
        if (!sharedKey.equalsIgnoreCase(key)) {
            return new BaseResponse(ERROR_STATUS_NAME, ERROR_STATUS_CODE);
        }

        processRequest(request);
        return new BaseResponse(SUCCESS_STATUS_NAME, SUCCESS_STATUS_CODE);
    }

    private void processRequest(ClientInfoRequest request) {
    }
}
