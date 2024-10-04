package com.securityAssignment.service;


import com.securityAssignment.dto.JwtAuthenticationResponse;
import com.securityAssignment.dto.SignInRequest;
import com.securityAssignment.dto.SignUpRequest;
import com.securityAssignment.model.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signIn(SignInRequest signInRequest);


}
