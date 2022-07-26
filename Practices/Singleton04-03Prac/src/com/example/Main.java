package com.example;

public class Main {

    public static void main(String[] args) {

        //PeerSingleton references created and initialised using the getInstance method
        PeerSingleton peerList01 = PeerSingleton.getInstance();
        PeerSingleton peerList02 = PeerSingleton.getInstance();

        //Host names displayed  by invoking getHostNames on peerList01 in a for loop
        for (String hostName : peerList01.getHostNames()) {
            System.out.println("Host name: " + hostName);
        }
        //Host names displayed  by invoking getHostNames on peerList02 in a for loop
            System.out.println();
            for (String hostName : peerList02.getHostNames()) {
                System.out.println("Host name: " + hostName);
            }
        }
    }

