package com.example.adapter_patterns.MainTest;

import com.example.adapter_patterns.Adapter.Adapter;
import com.example.adapter_patterns.InterfasePackage.Working;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainTest(){

        Working working = new Adapter();
        working.doing();

    }
}
