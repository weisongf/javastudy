package net;

import java.net.URL;

public class ParseUrl {
   public static void main(String[] args) 
   throws Exception {
      URL url = new URL("https://api.openstack.mediafirst.inspur.com/dashboard");
      System.out.println("URL �� " + url.toString());
      System.out.println("Э���� " + url.getProtocol());
      System.out.println("�ļ����� " + url.getFile());
      System.out.println("������ " + url.getHost());
      System.out.println("·���� " + url.getPath());
      System.out.println("�˿ں��� " + url.getPort());
      System.out.println("Ĭ�϶˿ں��� " 
      + url.getDefaultPort());
   }
}
