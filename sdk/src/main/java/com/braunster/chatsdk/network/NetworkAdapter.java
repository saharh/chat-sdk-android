package com.braunster.chatsdk.network;

import com.braunster.chatsdk.dao.BMessage;
import com.braunster.chatsdk.dao.BThread;
import com.braunster.chatsdk.dao.BUser;
import com.braunster.chatsdk.interfaces.CompletionListener;
import com.braunster.chatsdk.interfaces.CompletionListenerWithData;
import com.braunster.chatsdk.interfaces.NetworkInterface;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by itzik on 6/9/2014.
 */
public class NetworkAdapter extends AbstractNetworkAdapter {
    @Override
    public void syncWithProgress(CompletionListener completionListener) {

    }

    @Override
    public void getFriendsListWithListener(CompletionListenerWithData completionListener) {

    }

    @Override
    public BUser currentUser() {
        return null;
    }

    @Override
    public void sendMessage(BMessage message, CompletionListener completionListener) {

    }

    @Override
    public void createThreadWithUsers(ArrayList<BUser> users, CompletionListener completionListener) {

    }

    @Override
    public void createPublicThreadWithName(String name, CompletionListener completionListener) {

    }

    @Override
    public void setLastOnline(Date lastOnline) {

    }

    @Override
    public void deleteThreadWithEntityID(String entityId, CompletionListener completionListener) {

    }

    // FIXME fix type
    @Override
    public ArrayList<BThread> threadsWithType(BThread type) {
        return null;
    }

    @Override
    public void deleteThread(BThread thread, CompletionListener completionListener) {

    }

    @Override
    public String serverURL() {
        return null;
    }
}
