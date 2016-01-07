package com.pojo;

public class Message {

	private String message_text;
	private int message_Id;
	
	public Message(String message_text, int message_Id) {
		super();
		this.message_text = message_text;
		this.message_Id = message_Id;
	}
	
	@Override
	public String toString() {
		return "Message [message_text=" + message_text + ", message_Id="
				+ message_Id + "]";
	}


}
