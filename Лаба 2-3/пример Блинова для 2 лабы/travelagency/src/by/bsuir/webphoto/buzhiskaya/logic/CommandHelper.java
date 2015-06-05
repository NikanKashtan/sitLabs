package by.bsuir.webphoto.buzhiskaya.logic;

import by.bsuir.webphoto.buzhiskaya.logic.impl.LogInCommand;
import by.bsuir.webphoto.buzhiskaya.logic.impl.NoSuchCommand;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Veronika on 24.03.2015.
 */
public class CommandHelper {
    private static CommandHelper requestHelper;
    Map<CommandName,Command> commands = new EnumMap<CommandName,Command>(CommandName.class);

    private CommandHelper(){
        commands.put(CommandName.LOGIN, new LogInCommand());
        commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
    }
    public static CommandHelper getInstance(){
        if(requestHelper == null )
            requestHelper = new CommandHelper();
        return requestHelper;
    }

    public Command getCommand(String commandName){
        CommandName action = CommandName.valueOf(commandName.toUpperCase());
        Command command;
        if(action==null) {
             command = commands.get(CommandName.NO_SUCH_COMMAND);
        }
        else {
            command = commands.get(action);
        }
        return command;

    }
}
