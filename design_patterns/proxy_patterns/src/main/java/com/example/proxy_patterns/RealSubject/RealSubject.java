package com.example.proxy_patterns.RealSubject;

import com.example.proxy_patterns.Subject.Subject;

public class RealSubject extends Subject {

    public void show() {
        System.out.println("RealSubject...");
    }
}
