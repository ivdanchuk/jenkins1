package com.example.jenkins1.service;

import com.example.jenkins1.model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class UserConfigServiceTest {
    private User user;
    private UserConfigService userConfigService;
    private Logger logger;

    @BeforeEach
    public void setUp() {
        user = new User();
        userConfigService = new UserConfigService();
        logger = Logger.getLogger("UserConfigServiceTest.class");
    }

    @Test
    public void UserIdBeforeUserConfig() {
        assertEquals(user.getId(), 0L);
    }

    @Test
    public void UserIdAfterUserConfig() {
        userConfigService.configUser(user);
        assertTrue(user.getId() != 0L);
        logger.info(user.toString());
    }

}