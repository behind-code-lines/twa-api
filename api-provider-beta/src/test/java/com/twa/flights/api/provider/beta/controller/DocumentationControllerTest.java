package com.twa.flights.api.provider.beta.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class DocumentationControllerTest {

    private DocumentationController controller;
    private HttpServletResponse response;

    @BeforeEach
    public void setUp() {
        response = mock(HttpServletResponse.class);
        controller = new DocumentationController();
    }

    @Test
    void should_redirect_documentation_without_error() {
        controller.redirectToDocumentation(response);
    }

    @Test
    void should_redirect_documentation_error() throws IOException {
        doThrow(new IOException()).when(response).sendRedirect(anyString());
        controller.redirectToDocumentation(response);
    }

    @Test
    void should_redirect_documentation_error_message() throws IOException {
        doThrow(new IOException("as")).when(response).sendRedirect(anyString());
        controller.redirectToDocumentation(response);
    }

}
