package com.wxm;

import org.springframework.stereotype.Service;

import com.wxm.user.UserActionGrpc.UserActionBlockingStub;
import com.wxm.user.UserActionReply;
import com.wxm.user.UserActionRequest;
import com.wxm.user.UserActionsRequest;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class GrpcClientService {

    // @GrpcClient("local-grpc-server")
    // private SimpleBlockingStub simpleStub;

    @GrpcClient("local-grpc-server")
    private UserActionBlockingStub userActionBlockingStub;

    public String saveUserAction(String itemSetId, String user, String itemId, int action) {
        try {
            UserActionReply reply = userActionBlockingStub
                    .saveUserAction(UserActionRequest.newBuilder().setAction(action).setUser(user)
                            .setItemSetId(itemSetId).setItemId(itemId).build());
            return reply.getMessage();
        } catch (StatusRuntimeException ex) {
            return "FAILED with " + ex.getStatus().getCode();
        }
    }
    
    public String saveUserActions(String itemSetId, String user, String itemIds, int action) {
        try {
            UserActionReply reply = userActionBlockingStub
                    .saveUserActions(UserActionsRequest.newBuilder().setAction(action).setUser(user)
                            .setItemSetId(itemSetId).setItemIds(itemIds).build());
            return reply.getMessage();
        } catch (StatusRuntimeException ex) {
            return "FAILED with " + ex.getStatus().getCode();
        }
    }

    public String getUserActions(String itemSetId, String user, String itemIds, int action) {
        try {
            UserActionReply reply = userActionBlockingStub
                    .getUserAction(UserActionsRequest.newBuilder().setAction(action).setUser(user)
                            .setItemSetId(itemSetId).setItemIds(itemIds).build());
            return reply.getMessage();
        } catch (StatusRuntimeException ex) {
            return "FAILED with " + ex.getStatus().getCode();
        }
    }
}
