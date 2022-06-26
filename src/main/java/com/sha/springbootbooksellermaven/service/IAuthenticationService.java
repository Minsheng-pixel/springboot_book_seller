package com.sha.springbootbooksellermaven.service;

import com.sha.springbootbooksellermaven.model.User;

public interface IAuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
