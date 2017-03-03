package dev9;

import java.io.*;
import java.util.*;

/**
 * Class PropIni contains methods for check, write and read
 * of .ini files
 */
public class PropIni {
    private String FileName;

    /**
      *
      * @param FileName
      */
    public PropIni(String FileName) {
        this.FileName = FileName;
    }

    /**
      * Check exist of file
      * @throws IOException
      */
    public void ExistsFile()throws IOException {
        File f = new File(FileName);
        if(f.exists()==false){
            f.createNewFile();
        }
    }

    /**
     * 
     * @param key
     * @param value
     */
    public void WriteString(String key, String value){
        try{
           Properties p = new Properties();
           ExistsFile();
           p.load(new FileInputStream(FileName));
           p.put(key, value);
           FileOutputStream out = new FileOutputStream(FileName);
           p.save(out, "/*properties update*/");
        }
        catch(Exception e){
             
        }
    }
    
    /**
     * Method read the key if it's string
     * @param key
     * @return
     */
    public String ReadString(String key){
        String value=null;
        try{
            
            Properties p = new Properties();
            ExistsFile();
            p.load(new FileInputStream(FileName));
            value = p.getProperty(key);
            
        }
        catch(Exception e){
          
           
        }
        return value;
    }

    /**
     * Method read the key if it's string
     * @param key
     * @return value
     */
    public int ReadInt(String key){
         int value=0;
        try {
            ExistsFile();
            Properties p = new Properties();
            p.load(new FileInputStream(FileName));
            value = Integer.valueOf(p.getProperty(key)!=null?p.getProperty(key):Integer.toString(0));
        } catch (IOException ex) {

        }
         return value;
    }
     
}