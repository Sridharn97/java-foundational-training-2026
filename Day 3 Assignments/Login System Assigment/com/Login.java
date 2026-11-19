package com;

import java.util.*;

public class Login {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Login System");
        System.out.print("Enter Username: ");
        String username=sc.nextLine();
        System.out.print("Enter Password: ");
        String password=sc.nextLine();
        LoginService loginService=new LoginService();
        boolean isValid=loginService.validate(username,password);
        if(isValid){
            System.out.println("Login Successful");
            System.out.println("Welcome "+username);
        }else{
            System.out.println("Login Failed");
            System.out.println("Invalid Username or Password");
        }
        sc.close();
        
    }
}
