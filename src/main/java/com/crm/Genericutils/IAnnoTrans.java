package com.crm.Genericutils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.*;

public class IAnnoTrans implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(com.crm.Genericutils.RetryImpClass.class);
	}
  	
}

	

	
	
	


