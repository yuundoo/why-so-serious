package com.yedam.java.ch01_02;

public class Chatting {
	void startChat(String chatId) {
		String nickname = chatId;
		
		class Chat{
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickname + "]" + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}
