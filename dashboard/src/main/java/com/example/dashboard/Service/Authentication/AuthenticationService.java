package com.example.dashboard.Service.Authentication;

import com.example.dashboard.dto.request.AuthenticationRequest;
import com.example.dashboard.dto.request.IntrospectRequest;
import com.example.dashboard.dto.response.AuthenticationResponse;
import com.example.dashboard.dto.response.IntrospectResponse;
import com.nimbusds.jose.JOSEException;

import java.text.ParseException;


public interface AuthenticationService {

    String generateToken(String username);

    AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest);

    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;
}
