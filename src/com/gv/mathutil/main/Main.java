/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gv.mathutil.main;

import com.gv.mathutil.core.MathUtil;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
      
    //thử nghiệm hàm tính giai thừa coi chạy dúng như thiết kế hay ko
    //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
    //ví dụ: -5 coi tính đc hok
    //0 coi tính mấy
    //20 coi tính mấy
    //21 coi tính ra mấy !!!
    //TEST CASE: 1 tình huống hàm/app/màn hình/ tính năng dc đưa vào sử dụng, giả lập hành vi xài của ai đó
   //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP HAY XÀI HÀM MÀ NO BAO GỒM:
//INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
//OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, DI NHIÊN DÙNG ĐẦU
//VÀO ĐE XỬ LÍ
                //KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
//SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KO

long expected = 120; //tao kì vọng hàm 6i về 120 nếu tính 5!
int n = 5;
long actual = MathUtil.getFactorial(n);
System. out.println ("5! = " + expected + " expected") ;
System. out.println ("5! = " + actual + " actual");

    }
}
