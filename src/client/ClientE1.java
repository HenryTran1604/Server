/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author QuangHuy
 */
public class ClientE1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("20.198.242.126", 1605);
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("b00dccn000;FiBqZn2X");
        
        int a = dis.readInt();
        int b = dis.readInt();
        System.out.println(a + " " + b);
//                Thread.sleep(6000);

        dos.writeInt(a + b);
        dos.writeInt(a - b);
        dos.writeInt(a * b);
        
        dis.close();
        dos.close();
        socket.close();
        
    }
}
