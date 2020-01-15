package com.example.rest_template.controller;


import com.example.rest_template.controller.json.JsonBean;
import com.example.rest_template.eumn.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import java.util.Map;

@Controller
public class infoController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getToken")
    @ResponseBody
    public JsonBean getToken(){
        JsonBean jsonBean = new JsonBean();
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add(Constant.GRANT_TYPE.getKeyValue(),Constant.GRANT_TYPE.getStrValue());
        requestHeaders.add(Constant.CLIENT_ID.getKeyValue(),Constant.CLIENT_ID.getStrValue());
        requestHeaders.add(Constant.CLIENT_SECRET.getKeyValue(),Constant.CLIENT_SECRET.getStrValue());
        String url = Constant.GET_TOKEN_URL.getStrValue();
        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
        HttpEntity<MultiValueMap> requestEntity = new HttpEntity<MultiValueMap>(requestBody);
        HttpEntity<String> formEntity = new HttpEntity<String>(requestBody);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntitys = restTemplate.postForEntity(url, requestEntity, String.class);
        HttpStatus statusCode = responseEntitys.getStatusCode();
        int statusCodeValue = responseEntitys.getStatusCodeValue();
        String str = responseEntitys.getBody();
        Map body = JSON.parseObject(str);
        System.out.println("status:"+statusCode );
        System.out.println("statusCodeValue:"+statusCodeValue);
        System.out.println("str:"+str);
        System.out.println("--*--");
        System.out.println(body.get("access_token"));
        System.out.println("--*--");
        responseEntitys.toString();
        jsonBean.setData(responseEntitys);
        return jsonBean;
    }


    @PostMapping("/sendSNS")
    @ResponseBody
    public JsonBean sendSNS(){
        JsonBean jsonBean = new JsonBean();
        String url = "http://dmzesbhttp.zj.chinamobile.com:20520/http";

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("appCode","app_1578547537115");
        requestHeaders.add("accessToken","570a3a90-a9a1-4a4f-b3fb-0a2f07eca81f");
        requestHeaders.add("apiVersion","1.0.1");
        requestHeaders.add("apiCode","smsSend");
        requestHeaders.add("format","application/json");
        requestHeaders.setContentType(MediaType.APPLICATION_STREAM_JSON);

        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();

        HttpEntity<String> formEntity = new HttpEntity<String>("6BEB21CEC11AB23C8BBC8EB0DE1CEE712CB00E7DAE129F771866584C3C1533B4E1B149006D00D920F3359C346F3A5697417B0A5244453FC1FDA6F77FDEEEDF82AA0776F3382BC7C9928E04B6BF4B296E6222572EC4F7045C7B8774D0632372ADE86C35B45260A655DD7167B9F10538A40A8516619D6FB525A5015FF4F006D6DCD8CB70ABDE7C88E4B730EACC27ACBB86B75C803D553422B21D00E87C1CC453A83D3FB0DAB9CC2DBAE2D802E7E7E2848A7F3FD824245BF37AEF5A3FF26D07CD599D03960653DECC4088D782C5A2E252891D49D3DC18995391C9F6076D6D80D59A", requestHeaders);

        HttpEntity<MultiValueMap> requestEntity = new HttpEntity<MultiValueMap>(requestBody,requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntitys = restTemplate.postForEntity(url, formEntity, String.class);
        HttpStatus statusCode = responseEntitys.getStatusCode();
        int statusCodeValue = responseEntitys.getStatusCodeValue();
        jsonBean.setData(responseEntitys);
        System.out.println(responseEntitys);
        return jsonBean;
    }

    @PostMapping("/sendEmail")
    @ResponseBody
    public JsonBean sendEmail(){
        JsonBean jsonBean = new JsonBean();
        String url = "http://dmzesbhttp.zj.chinamobile.com:20520/http";

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("appCode","app_1578547537115");
        requestHeaders.add("accessToken","570a3a90-a9a1-4a4f-b3fb-0a2f07eca81f");
        requestHeaders.add("apiVersion","1.0.1");
        requestHeaders.add("apiCode","emailSend");
        requestHeaders.add("format","application/json");
        requestHeaders.setContentType(MediaType.APPLICATION_STREAM_JSON);

        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();

        HttpEntity<String> formEntity = new HttpEntity<String>("F4002A63A60314CB46A225390BF367B27C09528FC447339FE42203E50E580E3D40700E5BDBE3F46E7FFCFDB092070C182254702B4714BD6F29A19F98D7F165AB0ECF5C731A0DE66919B0840F1871CC2E25BADAA3E9F95E411CFBC1C9C4B9D422D65942E1E5279BDEBA47BC1D994B18FA5102E4BD4400F25B9A9FED592BB4389B5FC08813DEC22287FAB8B2F41414B037A17BC8682E5072AF0AC65C02360992E2804F6E6A440E476A2E2E7F957224AB7F", requestHeaders);

        HttpEntity<MultiValueMap> requestEntity = new HttpEntity<MultiValueMap>(requestBody,requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntitys = restTemplate.postForEntity(url, formEntity, String.class);
        HttpStatus statusCode = responseEntitys.getStatusCode();
        int statusCodeValue = responseEntitys.getStatusCodeValue();
        jsonBean.setData(responseEntitys);
        System.out.println(responseEntitys);
        return jsonBean;
    }


}
