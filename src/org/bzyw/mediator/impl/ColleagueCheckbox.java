package org.bzyw.mediator.impl;

import org.bzyw.mediator.Colleague;
import org.bzyw.mediator.Mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by bzyw on 2018/5/27.
 */
public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {
    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
    }
}
