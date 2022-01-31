package com.example.jenkins1.service;

import com.example.jenkins1.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.example.jenkins1.service.UserIdGeneratorService")
public class UserIdGeneratorServiceMockTest {
    private UserConfigService userConfigService;
    private User user;
    private long expectedId;

    @Before
    public void setUp() {
        userConfigService = new UserConfigService();
        user = new User();
        expectedId = 2l;
    }

    @Test
    public void test1() {
        mockStatic(UserIdGeneratorService.class);
        when(UserIdGeneratorService.generateId()).thenReturn(1l);
        //ok
        userConfigService.configUser(user);
        assertEquals(user.getId(), expectedId);
    }
}