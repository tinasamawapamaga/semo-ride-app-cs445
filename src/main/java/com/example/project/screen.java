import java.io.*; 
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class screen {
    private String name;
    private char menu[];
    private char option[];
    private String locations[];
    private double payment;
//Default constructor and all
   
    private static void makeScreen() {
        //Create and set up the window.
        JFrame frame = new JFrame("RedHawk Rides");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("semo.jpg").getImage());
        

        JLabel emptyLabel = new JLabel("RedHawk Rides Label");
        emptyLabel.setPreferredSize(new Dimension(480, 270));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        JButton login=new JButton("Login"); 
        JButton history=new JButton("History"); 
        JButton startRide=new JButton("Start Ride"); 
        JButton stopRide=new JButton("Stop Ride"); 
        JButton updateLocation=new JButton("Update Location"); 

        login.setBounds(50,50,95,30);  
        frame.add(login);
        history.setBounds(50,100,95,30);  
        frame.add(history);
        startRide.setBounds(50,150,95,30);  
        frame.add(startRide);
        stopRide.setBounds(150,50,95,30);  
        frame.add(stopRide);
        updateLocation.setBounds(150,100,130,30);  
        frame.add(updateLocation);
        
        
        frame.setSize(480,270);
        frame.setLayout(null);
        //Display the window.
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                makeScreen();
            }  
        });
    }
}
/*register(): void
login():void
rideRequest():void
history():void
startDrive(): void
stopDrive():void
updateLocation():void
public */