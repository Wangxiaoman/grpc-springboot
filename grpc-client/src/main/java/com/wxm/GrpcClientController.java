package com.wxm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @PostMapping("/action")
    public String saveAction(
            @RequestParam(name="user") String user,
            @RequestParam(name="itemSetId") String itemSetId,
            @RequestParam(name="itemId") String itemId,
            @RequestParam(name="action") int action) {
        return grpcClientService.saveUserAction(itemSetId, user, itemId, action);
    }
    
    @PostMapping("/actions")
    public String saveActions(
            @RequestParam(name="user") String user,
            @RequestParam(name="itemSetId") String itemSetId,
            @RequestParam(name="itemIds") String itemIds,
            @RequestParam(name="action") int action) {
        return grpcClientService.saveUserActions(itemSetId, user, itemIds, action);
    }
    
    @GetMapping("/actions")
    public String getActions(@RequestParam(name="user") String user,
            @RequestParam(name="itemSetId") String itemSetId,
            @RequestParam(name="itemIds") String itemIds,
            @RequestParam(name="action") int action) {
        return grpcClientService.getUserActions(itemSetId, user, itemIds, action);
    }

}
