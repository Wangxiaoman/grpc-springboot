package com.wxm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import com.wxm.log.CommonLogger;
import com.wxm.user.UserActionGrpc.UserActionImplBase;
import com.wxm.user.UserActionReply;
import com.wxm.user.UserActionRequest;
import com.wxm.user.UserActionsRequest;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcServerService extends UserActionImplBase {

    private ConcurrentHashMap<String, Integer> cMap = new ConcurrentHashMap<>();
    
    @Override
    public void saveUserAction(UserActionRequest req,StreamObserver<UserActionReply> responseObserver) {
        String user = req.getUser();
        String itemSetId = req.getItemSetId();
        String itemId = req.getItemId();
        int action = req.getAction();
        String result = "OK";
        try{
            String key = itemSetId + ":" + user + ":" + itemId;
            cMap.put(key, action);
        }catch(Exception ex){
            CommonLogger.error("save action error, ex:",ex);
            result = "FAIL";
        }
        UserActionReply reply = UserActionReply.newBuilder().setMessage(result).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void saveUserActions(UserActionsRequest req,StreamObserver<UserActionReply> responseObserver) {
        String user = req.getUser();
        String itemSetId = req.getItemSetId();
        String itemIds = req.getItemIds();
        int action = req.getAction();
        String result = "OK";
        try{
            if(StringUtils.isNotBlank(itemIds)){
                List<String> itemIdList = Splitter.on(",").splitToList(itemIds); 
                for(String itemId : itemIdList){
                    String key = itemSetId + ":" + user + ":" + itemId;
                    cMap.put(key, action);
                }
            }
        }catch(Exception ex){
            CommonLogger.error("save actions error, ex:",ex);
        }
        UserActionReply reply = UserActionReply.newBuilder().setMessage(result).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    
    @Override
    public void getUserAction(UserActionsRequest req,StreamObserver<UserActionReply> responseObserver) {
        String user = req.getUser();
        String itemSetId = req.getItemSetId();
        String itemIds = req.getItemIds();
        int action = req.getAction();
        List<String> result = new ArrayList<>();
        try{
            if(StringUtils.isNotBlank(itemIds)){
                List<String> itemIdList = Splitter.on(",").splitToList(itemIds); 
                for(String itemId : itemIdList){
                    String key = itemSetId + ":" + user + ":" + itemId;
                    Integer a = cMap.get(key);
                    if(Objects.equal(action,a)){
                        result.add(key);
                    }
                }
            }
        }catch(Exception ex){
            CommonLogger.error("get actions error, ex:",ex);
        }
        String value = Joiner.on(",").join(result);
        UserActionReply reply = UserActionReply.newBuilder().setMessage(value).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
