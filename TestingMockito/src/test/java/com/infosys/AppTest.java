package com.infosys;
import com.infosys.repo.UserRepo;
import com.infosys.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    @Mock
    private UserRepo userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserName() {
        when(userRepository.findNameById(1)).thenReturn("Alice");

        String name = userService.getUserName(1);

        assertEquals("Alice", name);
        verify(userRepository).findNameById(1);
    }
}
