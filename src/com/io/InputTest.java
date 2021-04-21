package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        //设置FileInputStream，先用BufferedInputStream装饰它，
        // 再用我们崭新的Lower CaseInputStream过滤器装饰它。
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")));
            while((c = in.read()) >= 0) {
                //只用流来读取字符，一直到文件尾端。
                // 每读一个字符，就马上将它显示出来。
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
