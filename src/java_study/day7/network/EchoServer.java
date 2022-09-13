package java_study.day7.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	private ServerSocket server;
	
	public EchoServer() {}
	
	public EchoServer(int port) throws IOException {
		server = new ServerSocket(port);
	}
	
	public void service () throws IOException {
		Socket client = server.accept();
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader in = new BufferedReader(isr);
		PrintWriter out = new PrintWriter(os,true);
		BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String msg = in.readLine();
			System.out.println(msg);
			if(msg.equals("bye")) {
				break;
			}
		}
	}
	
	public void close() throws IOException {
		server.close();
	}

	public static void main(String[] args) {
		try {
			EchoServer echoServer = new EchoServer(3333);
			echoServer.service();
			echoServer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
