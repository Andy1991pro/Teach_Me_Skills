package homework.by.TeachMeSkillsHomeWorkFive;

import java.util.Arrays;

public class HomeWokFive {
    public static void main(String[] args) {
        char [][] arr = new char[8][8];
        //вводим переменную для счетчтка
        for(int i=0;i<arr.length;i++){
            for(int j=0;j < arr[i].length;j++){
                if((i+j)%2==1){ arr[i][j]='w';}
                else arr[i][j]='b';}
            System.out.println(Arrays.toString(arr[i]));}}}