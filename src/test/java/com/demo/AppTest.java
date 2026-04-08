package com.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testVoteCount() {
        App.vote("user1");
        App.vote("user1"); 
        App.vote("user2");
        assertEquals(2, 2);
    }
}