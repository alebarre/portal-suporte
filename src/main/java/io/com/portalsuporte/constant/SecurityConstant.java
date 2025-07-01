package io.com.portalsuporte.constant;

public class SecurityConstant {

    public static final Long EXPIRATION_TIME = 432_000_000L; //5 DAYS IN MILISECONDS
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token ";
    public static final String TOKEN_CANNOT_BE_VEIRFIED = "Token cannot be verified.";
    public static final String PORTAL_SUPORTE_LLC = "Portal Suporte, LLC.";
    public static final String PORTAL_SUPORTE_ADMIN = "User management Portal.";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to login to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You are not allowed to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {"/user/login", "/user/register", "/user/resetpassword/**"};



}
