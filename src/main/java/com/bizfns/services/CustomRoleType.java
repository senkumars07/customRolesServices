package com.bizfns.services;
import java.util.Map;
import java.util.List;
 
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.ServiceUtil;
import org.apache.ofbiz.entity.util.EntityUtil;
import org.apache.ofbiz.entity.util.EntityUtilProperties;

import org.apache.ofbiz.party.party.PartyServices;

 
public class CustomRoleType {
 
    public static final String module = CustomRoleType.class.getName();
 
    public static String createRoleTypeCustom(DispatchContext dctx, Map<String, ? extends Object> context) {
//        Map<String, Object> result = ServiceUtil.returnSuccess();
        Delegator delegator = dctx.getDelegator();
    	
    	GenericValue ofbizDemo = delegator.makeValue("CustomRoleServices");
        
    	String s = ofbizDemo.getString("roleTypeId");
        
        return s;
    }
    
    // Very Simple SOAP Web Service
    // Takes on INPUT parameters and returns a List of product names.
    // What makes this a web service? The Service Definition
    // and a controller.xml request-map setting using the 
    // "soap" engine type 
    public static Map<String, Object> soapWebService(DispatchContext dctx, Map<String, ? extends Object> context)
    {
    	
    	Map<String, Object> result = ServiceUtil.returnSuccess();
    	Delegator delegator = dctx.getDelegator();
		
		return result; 
	} 

} 