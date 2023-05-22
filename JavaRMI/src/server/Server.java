package server;

import calculator.Calculator;
import calculator.MyCalculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry myReg = LocateRegistry.createRegistry(54321);
            Calculator myCal = new MyCalculator();

            myReg.rebind("MyCalServ" , myCal);
            System.out.println("Server Is Running ");
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
