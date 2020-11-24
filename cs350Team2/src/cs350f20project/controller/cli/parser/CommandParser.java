package cs350f20project.controller.cli.parser;

import cs350f20project.controller.command.A_Command;
import cs350f20project.controller.command.meta.CommandMetaDoExit;
import cs350f20project.datatype.Angle;
public class CommandParser {

	private MyParserHelper parserHelper;
	private String commandText;

	private Angle parseAngle(String command) {
        double value = Double.parseDouble(command);
        Angle angle = new Angle(value);
        return angle;
    }
	
	private 

    public CommandParser(MyParserHelper parserHelper, String commandText){
        this.parserHelper = parserHelper;
        this.commandText = commandText;

        System.out.println("HI USING OUR PARSER");
    }
    
    public void parse(){

        if (this.commandText.equalsIgnoreCase("@exit"))
        {
        	A_Command command = new CommandMetaDoExit();
        	this.parserHelper.getActionProcessor().schedule(command);
        }


    }


}
