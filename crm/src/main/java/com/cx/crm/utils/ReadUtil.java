package com.cx.crm.utils;

import java.io.*;

public class ReadUtil {
    public static String baseUrl = "E:\\work\\public_code\\crm\\crm\\src\\main\\java\\com\\cx";

    public static void main(String[] args){
        methodName(baseUrl);
    }

    //读取某个路径下的文件名
    public static void methodName(String filePath){
        //获取文件路径所指向的文件
        File file = new File(filePath);
        System.out.println(filePath);
        //获取文件夹下所有的文件
        File[] files = file.listFiles();
        //遍历获取到的文件，如果是文件夹则继续向下获取
        for (File file1 : files) {
            String url = filePath;
            //如果是文件夹，url往下增加一级
            if (file1.isDirectory()) {
                url += "\\"+file1.getName();
                //继续获取文件
                methodName(url);
            }else {
                String name1 = file1.getName();
                String content = readFileContent(filePath+"\\"+name1);
                System.out.println(name1);
                inputFile(content);
            }

        }
        System.out.println("结束！");
    }


    //处理str字段
    public static String handleStrWins(String str){
        str = str.substring(0, str.indexOf(".")).replace(" ","")
                .replace("、","")
                .replace("/","");
        return str;
    }

    /* @Title: readFileContent
     * @Description: 读取文件内容
     * @param filePath
     * @return
     */
    public static String readFileContent(String filePath) {
        StringBuilder result = new StringBuilder();
        try {
//          BufferedReader bfr = new BufferedReader(new FileReader(new File(filePath)));
            BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath)), "UTF-8"));
            String lineTxt = null;
            while ((lineTxt = bfr.readLine()) != null) {
                if (lineTxt.equals("") || lineTxt.equals(" "))
                    continue;
                if (filePath.contains("html")){
                    lineTxt.replaceAll(" ","");//去除字符串中的空格,回车,换行符,制表符
                    System.out.println(lineTxt);
                }
                result.append(lineTxt).append("\n");
            }
            bfr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    /**
     * 把获取的字符串进行写入
     * @param str
     */
    public static void inputFile(String str){
        FileWriter writer;
        try {
            //写到对应的文件下，这个文件就是取消空格合并代码生成的一个总文件
            try {
                writer = new FileWriter("E:/cx_crm.txt",true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
