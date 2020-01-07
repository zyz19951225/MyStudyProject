package com.example.proxy_patterns.Proxy;

import com.example.proxy_patterns.RealSubject.RealSubject;
import com.example.proxy_patterns.Subject.Subject;
import org.junit.Test;

public class proxy extends Subject {

    RealSubject realSubject;

    @Test
    public void show()
    {
        if (realSubject==null)
        {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.show();
        postRequest();
    }
    public void preRequest()
    {
        System.out.println("访问真实主题之前的预处理。");
    }
    public void postRequest()
    {
        System.out.println("访问真实主题之后的后续处理。");
    }

}
