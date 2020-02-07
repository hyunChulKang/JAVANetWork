package kr.or.ddit.basic;

import java.io.IOException;
import java.net.Socket;

public class T07_TcpClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 7777);
		System.out.println("서버에 연결되었습니다.");

		Sender sender = new Sender(socket);
		
		Receiver reciver = new Receiver(socket);
		
		sender.start();
		reciver.start();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
