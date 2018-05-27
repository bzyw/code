package org.bzyw.mediator;

import org.bzyw.mediator.impl.ColleagueButton;
import org.bzyw.mediator.impl.ColleagueCheckbox;
import org.bzyw.mediator.impl.ColleagueTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bzyw on 2018/5/27.
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOK);
        add(buttonCancel);
        colleagueChanged(checkGuest);
        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("" + e);
        System.exit(0);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup group = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, false);

        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');

        buttonOK = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOK.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged(Colleague colleague) {
        if (colleague == checkGuest || colleague == checkLogin) {
            if (checkGuest.getState()) {
                textUser.setColleagueEnable(false);
                textPass.setColleagueEnable(false);
                buttonOK.setColleagueEnable(true);
            } else {
                textUser.setColleagueEnable(true);
                userpassChanged();
            }
        } else if (colleague == textUser || colleague == textPass) {
            userpassChanged();
        } else {
            System.out.println("colleagueChanged:unknown colleague=" + colleague);
        }
    }

    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnable(true);
            if (textPass.getText().length() > 0) {
                buttonOK.setColleagueEnable(true);
            } else {
                buttonOK.setColleagueEnable(false);
            }
        } else {
            textPass.setColleagueEnable(false);
            buttonOK.setColleagueEnable(false);
        }
    }
}
