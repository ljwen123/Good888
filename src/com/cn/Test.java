package com.cn;

public class Test {
    public static void main(String[] args) {
        Test aa=new Test();
        aa.test();
      String [] arr=new String[]{"limei","lily","lady"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public void test(){
        String a="晚上好!!";
        System.out.println(a);
    }
}
