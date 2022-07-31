/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.client;


//short cut to implement imports: right click and select Fix Imports
import java.io.IOException;
import java.net.Socket;        //reads report from server
import java.util.Scanner;      //reads report from server
import java.util.concurrent.Callable;

/**
 *
 * @author thlok
 */
public class NetworkClientCallable implements Callable<RequestResponse> {

    private final RequestResponse lookup;

    public NetworkClientCallable(RequestResponse lookup) {   //Uses the notation for generics to define the Callable as of type RequestResponse

        this.lookup = lookup;
    }

    @Override
    public RequestResponse call() throws IOException {
        try ( Socket sock = new Socket(lookup.host, lookup.port);  Scanner scanner = new Scanner(sock.getInputStream())) {
            lookup.response = scanner.next();
            return lookup;
        }
    }
}
