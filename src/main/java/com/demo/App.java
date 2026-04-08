package com.demo;

import java.util.HashSet;
import java.util.Set;

public class App {

    private static Set<String> votedUsers = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("Voting System Started...");

        while (true) {
            try {

                vote("user1");
                vote("user2");
                vote("user1"); 
                System.out.println("Total Votes Counted: " + votedUsers.size());

                // wait 5 seconds
                Thread.sleep(5000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void vote(String userId) {

        if (votedUsers.contains(userId)) {
            System.out.println("Duplicate vote rejected for: " + userId);
        } else {
            votedUsers.add(userId);
            System.out.println("Vote accepted for: " + userId);
        }
    }
}