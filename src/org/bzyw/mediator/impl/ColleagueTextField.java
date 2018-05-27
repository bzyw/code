package org.bzyw.mediator.impl;

import org.bzyw.mediator.Colleague;
import org.bzyw.mediator.Mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Created by bzyw on 2018/5/19.
 */
public class ColleagueTextField extends TextField implements Colleague, TextListener {
    private Mediator mediator;

    public ColleagueTextField(String text, int cloumns) {
        super(text, cloumns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
        setBackground(enable ? Color.white : Color.lightGray);
    }

    public void textValueChanged(TextEvent textEvent) {
        mediator.colleagueChanged(this);
    }
}
