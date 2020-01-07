package com.example.adapter_patterns.Adapter;

import com.example.adapter_patterns.InterfasePackage.Working;
import com.example.adapter_patterns.OldWorking.OldWorking;

public class Adapter extends OldWorking implements Working {
    @Override
    public void doing() {
        super.doSomeThing();
    }
}
