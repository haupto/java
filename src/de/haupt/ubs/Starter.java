	package de.haupt.ubs;

public class Starter {

	private CommandLineWriter cmdWriter = new CommandLineWriter();
	
	private void run(String texts) {
		cmdWriter.write(texts);
	}

	
	public static void main(String[] args) {
		Starter me = new Starter();
		me.run("Hello World");
	}

}
