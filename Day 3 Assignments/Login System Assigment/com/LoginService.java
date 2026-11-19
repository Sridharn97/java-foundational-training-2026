package com;

import java.util.*;

public class LoginService {
    Map<String,String> mp=new HashMap<>();
    public LoginService(){
        mp.put("severus","snape");
        mp.put("albus","dumbledore");
        mp.put("draco","malfoy");
    }
    public boolean validate(String username,String password){
        if(mp.containsKey(username)){
            String pass=mp.get(username);
            if(pass.equals(password)){
                return true;
            }
        }
        return false;
    }
    
}
