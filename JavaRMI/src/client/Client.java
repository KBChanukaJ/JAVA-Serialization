package client;

import calculator.Calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry myReg = LocateRegistry.getRegistry("localhost" , 54321);
            Calculator cal =(Calculator) myReg.lookup("MyCalServ");

            int add = cal.Add(12,10);
            System.out.println("Answer is: "+add);

            int sub = cal.Sub(12,10);
            System.out.printf("Answer is: "+sub);

            int multi = cal.Multi(12,10);
            System.out.println("Answer is: "+multi);

            int div = cal.Div(12 , 2);
            System.out.println("Answer is: "+div);


        }
        catch (RemoteException e){
            e.printStackTrace();
        }
        catch (NotBoundException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
