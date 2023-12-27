package com.ubei.http.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerRunner {

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(7777);
             Socket socket = serverSocket.accept();
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream())) {
            System.out.println("Client request: " + inputStream.readUTF());
            outputStream.writeUTF("Hello from server!");
        }
    }
}
