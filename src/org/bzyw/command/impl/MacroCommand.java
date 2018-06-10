package org.bzyw.command.impl;

import org.bzyw.command.Command;

import java.util.Stack;

/**
 * Created by bzyw on 2018/6/3.
 */
public class MacroCommand implements Command {
    /**
     * 命令的集合
     */
    private Stack<Command> commands = new Stack<Command>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    /**
     * 添加命令
     *
     * @param command 命令
     */
    public void append(Command command) {
        commands.push(command);
    }

    /**
     * 删除最后一个命令
     */
    public void undo() {
        commands.pop();
    }

    /**
     * 清除所有命令
     */
    public void clear() {
        commands.clear();
    }
}
