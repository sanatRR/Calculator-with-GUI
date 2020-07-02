package application;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller1 {
	@FXML
	private Label screen;
	private Button b1;
	private Button be;
	
	public String memory="";
	public void fun1(ActionEvent e1)
	{
		String s=((Button)e1.getSource()).getText();
		memory=memory+s;
		screen.setText(memory);
	}
	public void fun2(ActionEvent e2) throws ScriptException
	{
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result = engine.eval(memory);
		System.out.println(result);
		screen.setText(String.valueOf(result));
	}
	public void fun3(ActionEvent e3) 
	{
		memory="";
		screen.setText(memory);
	}
	
}
