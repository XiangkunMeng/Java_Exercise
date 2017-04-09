package java_lib.RandomAccessFileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by mxk94 on 2017/4/9.
 */
class RandomAccessFileDemo{
    public static void main(String[] args) throws IOException{
        write();
        myRead();
        randomWrite();
    }
    //随机写入数据，可以实现已有数据的修改。
    public static void randomWrite()throws IOException {
        RandomAccessFile raf = new RandomAccessFile("random.txt","rw");
        raf.seek(8*4);
        System.out.println("pos :"+raf.getFilePointer());
        raf.write("小呜呜呜呜".getBytes());
        raf.writeInt(102);
        raf.close();
    }
    public static void read()throws IOException{
        RandomAccessFile raf = new RandomAccessFile("random.txt","r");//只读模式。
        //指定指针的位置。
        raf.seek(0);//实现随机读取文件中的数据。注意：数据最好有规律。
        System.out.println("pos1 :"+raf.getFilePointer());
        byte[] buf = new byte[8];
        raf.read(buf);
        String name = new String(buf);
        raf.seek(9);
        int age = raf.readInt();
        System.out.println(name+"::"+age);
        System.out.println("pos2 :"+raf.getFilePointer());
        raf.close();
    }
    public static void write()throws IOException{
        //rw：当这个文件不存在，会创建该文件。当文件已存在，不会创建。所以不会像输出流一样覆盖。
        RandomAccessFile raf = new RandomAccessFile("random.txt","rw");//rw读写模式
        //往文件中写入人的基本信息，姓名，年龄。
        raf.write("站衫张三".getBytes());
        raf.seek(9);
        raf.writeInt(97);
        raf.close();
    }
    public static void myRead() throws IOException{
        File f= new File("random.txt");
        FileInputStream fis = new FileInputStream(f);
        byte buf[] = new byte[8];
        while((fis.read(buf))!= -1){
            String str = new String(buf);
            System.out.print(str);
        }
        System.out.println();
    }
}

