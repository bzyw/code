package org.bzyw.mediator.impl;

import org.bzyw.mediator.Colleague;
import org.bzyw.mediator.Mediator;

import java.awt.Button;

/**
 * Created by bzyw on 2018/5/19.
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
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
