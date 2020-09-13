package designpatterns.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Context {
	private String reg;
	
	private List<String> regList;
	
	private String content;
	
	private List<String> result = new ArrayList<String>();
	
	private List<String> chars = new ArrayList<String>();
	
	public Context(String reg, String content) {
		this.reg = reg;
		this.content = content;
		char[] charArray = content.toCharArray();
		charsToList(charArray);
		regList = new ArrayList<String>(Arrays.asList(reg.split("\\\\"))) ;
		if (regList.get(0).equals("")) {
			regList.remove(0);
		}
	}

	private void charsToList(char[] charArray) {
		for (Character c : charArray) {
			chars.add(c.toString());
		}
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getChars() {
		return chars;
	}

	public void setChars(List<String> chars) {
		this.chars = chars;
	}

	public List<String> getRegList() {
		return regList;
	}

	public void setRegList(List<String> regList) {
		this.regList = regList;
	}

	public List<String> getResult() {
		return result;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}
	
	
	
}
