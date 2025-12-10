/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gv.mathutil.test.core;

import com.gv.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author DELL
 */
public class MathUtilTest {
    
    // đây là class sẽ dử dụng các hàm cử thư viện/frame work JUnit để ktra code chình hamd tính giai thừa
    //viết code để test code
    //viết code để test code chính bên kia !!!

//có nhiều quy tắc dặt tên hàm kiểm thử
//nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
//tình huống xài hàm theo kiểu thành công và thất bại !!!

//hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
//ta sẽ xài hàm kiểu well - đưa 5!, 6!, hok chơi đưa -5!, 30!
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
//@Test phía hậu trường chính là public static void main ()
//Có nhiều @Test ứng với nhiều case khác nhau dể kiểm thử hàm tính giai thừa
@Test
  
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n=0;
        long expected =1; // kỳ vọng 0!=1
        long actual = MathUtil.getFactorial(n);
        //so sánh expected vs. actual
        Assert.assertEquals(expected, actual);
        // hàm giúp so sánh 2 giá trị nào đó có giônga nhau hay không?
        //nếu giống nhau--> thảy màu xanh, 
        // nếu ko giống nhau --> màu đỏ
        // gộp thêm vài case thành công
        Assert.assertEquals(1, MathUtil.getFactorial(1));// muốn 1!==1
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));    
        
    }
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data đunga [0..20]ư--> tính đúng n1- done
    //2 đưa data sai, âm, >20; thiết kế hàm ném ra ngoại lệ
    // kì vọng ngoại lệ xuất hiện khi n<0|| n>20
    // nếu hàm nhận vào n<0 hoặc n>20 và hàm ném ngoại lệ
    //hàm chạy đúng như thiết kế --> xanh xuất hiện
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm éo ném ra ngoại lệ
//sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ

//Test case:
//input: -5
//expected: IllegalArgumentException xuất hiện
//tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
//là những thứ ko thể do lường so sánh theo kiểu value
//mà chỉ có thể đo lường - cách chúng có xuất hiện hay ko I
//assertEquals () ko dùng để so sánh 2 ngoại lệ
    //equals() là bằng nhau trên 2 value
    // màu đỏ, do hàm đúng là có ném ngoại lệ nhưng không phải ngoại lệ như kì vọng
//    @Test(expected=NumberFormatException.class)
  
 //   public void testGetFactorialGivenWrongArgumentThrowException(){
   //     MathUtil.getFactorial(-5);// hàm @Test chạy, hay getF() chạy sẽ nem ngoại lệ 
  //                                  //NumberFormatException
  
    @Test(expected=IllegalArgumentException.class)
  
 public void testGetFactorialGivenWrongArgumentThrowException(){
  MathUtil.getFactorial(-5);// hàm @Test chạy, hay hàm getF()chạy
          
    }
    // cách khác bắt ngoại lệ xuất hiện
 
 @Test
  
 public void testGetFactorialGivenWrongArgumentThrowException_TryCatch(){
     try {
         MathUtil.getFactorial(-5);
         
     } catch (Exception e) {
       // bắt Try- catch là Junit sẽ ra xanh do chủ động kiểm soát ngoại lệ
       // nhưng ko có chắc ngoại lệ miình cần có xuất hiện hay ko?
       // có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
       Assert.assertEquals("Invalid argument. n must be between 0 and 20.", e.getMessage());
        
     }
     }
 
  
}
