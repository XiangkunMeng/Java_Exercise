package java_lib.InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by mxk94 on 2017/4/9.
 */
public class getHostDemo {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("My Host Address: "+address.getHostAddress());
        address = InetAddress.getByName("xkenmon.cn");
        System.out.println("xkenmon.cn: " + address.getHostAddress());
        InetAddress address_arr[] = InetAddress.getAllByName("github.com");
        for (int i = 0; i < address_arr.length; i++) {
            System.out.println(address_arr[i]);
        }
    }
}
