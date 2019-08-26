package blood99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Final {
 // �@�|�ض®�A���ߡA����A����P�U13�i
 static String Player[][] = new String[13][4];
 // �����@52�i�P
 String Card[] = new String[52];
 String Player1[] = new String[5];
 static ArrayList list=new ArrayList();
 
 /////////
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Final pk = new Final();
  pk.createCard();
  for (int i = 0; i < 13; i++) {
   for (int j = 0; j < 4; j++) {
    pk.createdetail(i, j);
   }
  }
  pk.printdetail();
  System.out.println(pk.cardList());
 }

 ////// ���ͥd���G�®�A���ߡA����A����
 void createCard() {
  for (int j = 0; j < 52; j++) {
   switch (j % 4) {
   case 1:
    Card[j] = "�®�" + (j % 13 + 1);
    break;
   case 2:
    Card[j] = "����" + (j % 13 + 1);
    break;
   case 3:
    Card[j] = "���" + (j % 13 + 1);
    break;
   case 0:
    Card[j] = "����" + (j % 13 + 1);
    break;
   }
  }
 }
 
 
 

 ///// ���ͼƦr
 void createdetail(int i, int j) {
  int x = 0;
  do {
   x = (int) (Math.random() * 52);
  } while (chk(x));

  savedetail(x, i, j);
 }

 ///// �P�_�O�_����
 boolean chk(int x) {
  for (int i = 0; i < 13; i++) {
   for (int j = 0; j < 4; j++) {
    if (Card[x] == Player[i][j]) {
     return true;
    }
   }
  }
  return false;
 }

 ///// �N�ȶ�J
 void savedetail(int x, int i, int j) {
  Player[i][j] = Card[x];
 }

 ///// �C�L���G
 void printdetail() {
  for (int j = 0; j < 4; j++) {
   for (int i = 0; i < 13; i++) {
    System.out.print(Player[i][j] + "\t");
   }
   System.out.println();
  }
 }

 ///// ��~�n���P ��iarraylist
 public static  ArrayList cardList() {
//  ArrayList list = new ArrayList();
  for (int j = 0; j < 4; j++) {
   for (int i = 0; i < 13; i++) {
    list.add(Player[i][j]);
   }
  }
  return list;
//  for(int k=0;k<5;k++) {
//   Player1[k]=(String) list.get(0);
//   //list.remove(0);
//   
//  }
//
//
//  System.out.println(Arrays.toString(Player1));

 }

}