package com.mycompany.app;

import com.google.cloud.storage.Notification;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.util.List;

public class ListPubSubNotifications {

    public static void listPubSubNotifications(String bucketName) {

        Storage storage = StorageOptions.newBuilder().build().getService();
        List<Notification> notificationList = storage.listNotifications(bucketName);
        for (Notification notification : notificationList) {
            System.out.println(
                    "Found notification " + notification.getTopic() + " for bucket " + bucketName);
        }
    }
}