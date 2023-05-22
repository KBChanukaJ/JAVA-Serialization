package calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator {
    public MyCalculator() throws RemoteException {
    }

    @Override
    public int Add(int x, int y) throws RemoteException {
        return (x+y);
    }

    @Override
    public int Sub(int x, int y) throws RemoteException {
        return (x-y);
    }

    @Override
    public int Div(int x, int y) throws RemoteException {
        return (x/y);
    }

    @Override
    public int Multi(int x, int y) throws RemoteException {
        return (x*y);
    }
}
