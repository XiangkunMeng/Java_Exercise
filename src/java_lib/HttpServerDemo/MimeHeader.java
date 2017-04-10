package java_lib.HttpServerDemo;

import com.sun.deploy.net.HttpResponse;
import com.sun.deploy.net.MessageHeader;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.*;
class MimeHeader extends Hashtable{
	void parse(String data) {
		StringTokenizer st = new StringTokenizer(data, "\r\n");
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			int tok = str.indexOf(':');
			String key = str.substring(0, tok);
			String val = str.substring(tok + 2);
			put(key, val);

		}
	}
	public String toString(){
	    String ret = "";
	    Enumeration e = keys();

	    while (e.hasMoreElements()){
	        String key = (String)e.nextElement();
	        String val = (String)get(key);
	        ret+= key + ":" + val + "\r\n";
        }
        return ret;
    }
    private String fix (String str){
		str = str.toLowerCase();
		char arr[] = str.toCharArray();
		boolean upNext = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if(upNext && 'a' < arr[i] && 'z' > arr[i]){
				arr[i] = (char)(arr[i] - ('a' - 'z'));
				upNext = false;
			}
//			if (arr[i] == '-'){
//				upNext = true;
//			}
/*		And the next line is similar but simpler	*/
            upNext = arr[i] == '-';
		}
		return new String(arr);
	}
	MimeHeader(){};
	MimeHeader(String data){
		parse(data);
	}
	public String get(String key){
		return (String)super.get(fix(key));
	}
	public void put(String key,String val){
		super.put(fix(key),val);
	}
}

