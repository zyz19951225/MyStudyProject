package com.example.rest_template.eumn;

public enum Constant {
    CLIENT_ID("client_id","app_1573728925569"),
    CLIENT_SECRET("client_secret","71a73c0ef5cb60dd03cd40d8d891fa1a"),
    GRANT_TYPE("grant_type","client_credentials"),
    GET_TOKEN_URL("url","http://dmzesbhttp.zj.chinamobile.com:20520/oauth2/oauth/token");

    private final String keyValue;
    private final String strValue;

    public String getStrValue(){
        return strValue;
    }

    public String getKeyValue(){
        return keyValue;
    }

    Constant(String keyValue,String strValue) {
        this.keyValue = keyValue;
        this.strValue = strValue;
    }
}
