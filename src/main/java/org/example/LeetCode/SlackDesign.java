package org.example.LeetCode;

public class SlackDesign {
    public static void main(String[] args) {

        //Design db:
            //users : id, name, email, password
            //channels : id, channel_name, channel_type(DirectMessage, ChannelMessage)
            //messages : id, sender_id, message, channel_id, created_at
            //membership : id, channel_id, user_id, is_deleted, is_pinned, is_muted, is_left

        //Websockets
        //EdgeServers : deals only with realtime, like online/offline user status, user is typing, msg sending etc
        //Microservices
        //Redis PubSub : Push based model

        //MicroServices:
            //messageService
            //monolithService
            //connectionBalancerService
            //membershipSerive

        //connectionBalancerService:
            //getEdgeServerIp(orgId);

        //monolithService
            //authentication()
            //getAllChannels(userId)
            //createChannel(userId, channelId) : when user create new channel/starts new chat with user one-on-one

        //messageService:
            //saveMessage(senderId, message, channelId);
            //getMessage(channelId);
            //getHistoryOfUserChannel(channelId) : calls by cron job in every 2 mints
            //sendMessageToEdgeServers();


        //membershipService:
            //getUsers(channelId)


        //EdgeServers:
            //sendMessageToUser(message)
            //showOnlineOfflineUserStatus()
            //showUserIsTyping()

        //Redis PubSub:
            //all the edge servers will establish the connectin with redis pub sub, and subscribe the channels they want to listen



    }
}
