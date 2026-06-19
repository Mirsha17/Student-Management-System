package com.java.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class WEBXMLReplacement extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
    protected Class<?>[] getRootConfigClasses(){
        return null;
    }
	@Override
    protected Class<?>[] getServletConfigClasses(){
		return new Class[]{
                ConfigurationClass.class
        };
	}
	@Override
    protected String[] getServletMappings(){
		return new String[]{ "/" };
    }
}