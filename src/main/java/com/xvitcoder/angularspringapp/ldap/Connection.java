package com.xvitcoder.angularspringapp.ldap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

public class Connection {
	@Value("${url}")
    private static String ldapServerUrl;	
	
	@Value("${base}")
    private static String ldapBase;
	
	@Value("${userDsn}")
    private static String ldapuserDsn;
	
	@Value("${password}")
    private static String ldapPassword;
	
	private static Connection connection = null;
	
	
	public static Connection ConnectToLdap() {
		
		if (connection == null) {
			try {
				LdapContextSource ctxLdap =  new LdapContextSource();
				ctxLdap.setUrl(ldapServerUrl);
				ctxLdap.setBase(ldapBase);
				ctxLdap.setUserDn(ldapuserDsn);
				ctxLdap.setPassword(ldapPassword);
				ctxLdap.afterPropertiesSet();				
				LdapTemplate lt = new LdapTemplate(ctxLdap);	
				
			} catch (Exception e) {
				return null;
			}
		}
		
		return connection;	
	}

}
