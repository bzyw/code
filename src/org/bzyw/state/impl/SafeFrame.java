package org.bzyw.state.impl;

import org.bzyw.state.Context;
import org.bzyw.state.State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bzyw on 2018/5/31.
 */
public class SafeFrame extends Frame implements ActionListener, Context {
    /**
     * 输出现在时间
     */
    private TextField textClock = new TextField(60);
    /**
     * 输出保安中心
     */
    private TextArea textScreen = new TextArea(10, 60);
    /**
     * 使用金库按钮
     */
    private Button buttonUse = new Button("Use");
    /**
     * 警铃按钮
     */
    private Button buttonAlarm = new Button("Alarm");
    /**
     * 一般通话按钮
     */
    private Button buttonPhone = new Button("Call");
    /**
     * 退出按钮
     */
    private Button buttonExit = new Button("Exit");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);
        pack();
        show();
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("" + e);
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }

    }

    @Override
    public void setClock(int hour) {
        String clockString = "现在的时间是：";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("状态已经从" + this.state + "变成" + state + "。");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call!" + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record..." + msg + "\n");
    }
}
