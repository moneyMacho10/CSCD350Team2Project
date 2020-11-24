package cs350Team2;


import cs350f20project.controller.ActionProcessor;
import cs350f20project.controller.cli.parser.A_ParserHelper;
import cs350f20project.controller.command.A_Command;
import cs350f20project.controller.command.meta.CommandMetaDoExit;

//import cs350f20project.controller.ActionProcessor;
//import cs350f20project.controller.cli.parser.A_ParserHelper;

public class MyParserHelper extends A_ParserHelper {

	

	private MyParserHelper parserHelper; 
	private String commandText;
	

	public MyParserHelper(ActionProcessor actionProcessor) {
		super(actionProcessor);
		// TODO Auto-generated constructor stub
	}

	

	public void parse() {
		if(this.commandText.equalsIgnoreCase("@exit")) {
			A_Command command = new CommandMetaDoExit();
			
			this.parserHelper.getActionProcessor().schedule(command);	
			System.out.println("My parser was used");
		}
		
	}
	
	
	
	
}
