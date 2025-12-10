/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gv.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtil {
    // trong class này cung cấp nhiều hàm xử lý toán học
    // clone Math của JDK
    // hàm thư viện xài chung, ko cần lưu lại trạng thái/giá trị
    // chọn thiết kế hàm static
    // hàm tính giai thừa!!
    //n!=1.2.3.4....n
    // ko coa giai thừa số âm
    //0!=1!=1 quy ước
    // giai thừa hàm đoò thị dôc đứng, tăng nhanh
    // 20! có 18 số 0 vừa đủ kiểu long
    //21! tràn kiểu long
    // bài này quy ước tính n! trong khoảng 0-20
    public static  long getFactorial(int n){
        
        if(n<0|| n>20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20.");
        if (n==0||n==1)
            return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *=i;
        return product;
            
        }
    }
    
    
    
