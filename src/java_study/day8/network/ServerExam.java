package java_study.day8.network;

import java.net.ServerSocket;
import java.util.Vector;

public class ServerExam {
	private Vector handlers;
	
	public ServerExam() {}
	
	public ServerExam(int port) {
		try {
			ServerSocket server = new ServerSocket(port);
			handlers = new Vector();
			System.out.println("chat server is ready");
			while(true) {
				HandlerExam handler = new HandlerExam(this, server.accept());
				handler.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Object getHandler(int index) {
		return handlers.elementAt(index);
	}
	
	public void register(HandlerExam c) {
		handlers.addElement(c);
	}
	
	public void unregister(Object o) {
		handlers.removeElement(o);
	}
	
	public synchronized void broadcast(String message) {
//		synchronized (message) {
			int n = handlers.size();
			for (int i = 0; i < n; i++) {
				HandlerExam h = (HandlerExam)handlers.elementAt(i);
				try {
					h.println(message);				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
//		}
	}
	
	public static void main(String[] args) {
		new ServerExam(7979);
	}

}
