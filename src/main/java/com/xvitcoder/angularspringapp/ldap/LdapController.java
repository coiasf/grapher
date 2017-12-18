package com.xvitcoder.angularspringapp.ldap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xvitcoder.angularspringapp.ldap.Connection;

public class LdapController {
	
	
	@Autowired
    private Connection ldapConnection;

    @RequestMapping("ldap/connect")
    public @ResponseBody boolean getCarList() {
    	Connection ldapConnection = Connection.ConnectToLdap();
        if (ldapConnection == null)
        	return false;
        return true;
    }

}
