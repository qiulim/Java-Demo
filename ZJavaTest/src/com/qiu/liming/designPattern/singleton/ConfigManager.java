package com.qiu.liming.designPattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {

	/**
	 * file name
	 */
	private static final String PFILE = System.getProperty("user.dir") + File.pathSeparatorChar + "singleton.properites";
	
	private File mFile = null;
	
	private long mLastModifiedTime = 0;
	
	private Properties mProps = null;
	
	private static ConfigManager mInstance = new ConfigManager();
	
	private ConfigManager() {
		mFile = new File(PFILE);
		mLastModifiedTime = mFile.lastModified();
		if(mLastModifiedTime == 0){
			System.err.println(PFILE+"file does not exits");
			
		}
		
		mProps = new Properties();
		try{
			mProps.load(new FileInputStream(PFILE));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public static ConfigManager getInstance() {
		return mInstance;
	}
	
	final public Object getConfigItem(String name, Object defaultVal) {
		long newTime = mFile.lastModified();
		if (newTime == 0) {
			if (mLastModifiedTime == 0) {
				System.out.println(PFILE+"does not exist!");
				
			} else {
				System.out.println(PFILE + "was deleted!");
			}
			
			return defaultVal;
		} else {
			if (newTime > mLastModifiedTime) {
				mProps.clear();
				
				try{
					mProps.load(new FileInputStream(PFILE));
					
				}catch(Exception e) {
					System.out.println("error");
				}
				
			} 
		}
		mLastModifiedTime = newTime;
		Object val = mProps.getProperty(name);
		if(val == null) {
			return defaultVal;
		} else {
			
			return val;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
