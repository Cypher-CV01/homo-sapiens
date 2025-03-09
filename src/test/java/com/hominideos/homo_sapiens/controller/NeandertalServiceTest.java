package com.hominideos.homo_sapiens.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.hominideos.homo_sapiens.model.Neandertal;
import com.hominideos.homo_sapiens.repository.NeandertalRepository;
import com.hominideos.homo_sapiens.service.NeandertalService;

@ExtendWith(MockitoExtension.class)
public class NeandertalServiceTest {

    @Mock
    private NeandertalRepository repository;

    @InjectMocks
    private NeandertalService service;

    @Test
    void testAtualizarNeandertal() {
        // Create a sample Neandertal object for testing
        Neandertal neandertal = new Neandertal();
        neandertal.setId(1L);
        neandertal.setNome("John");
        // Set other fields as needed

        // Mocking repository behavior
        when(repository.findOneById(neandertal.getId())).thenReturn(neandertal);
        when(repository.save(any())).thenReturn(neandertal);

        // Call the method to be tested
        Neandertal updatedNeandertal = service.atualizarNeandertal(neandertal);

        // Verify that the save method was called with the updated Neandertal object
        verify(repository).save(neandertal);

        // Assert that the returned Neandertal object matches the one saved
        assertEquals(neandertal, updatedNeandertal);
    }
}
