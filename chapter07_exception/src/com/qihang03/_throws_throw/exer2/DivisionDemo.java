package com.qihang03._throws_throw.exer2;

/**
 * ClassName: DivisionDemo
 * Package: com.qihang03._throws_throw.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/26 17:23
 * @Version 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int result = divide(m, n);
            System.out.println("结果为: " + result);
        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除0了");
        }
    }

    public static int divide(int m, int n) throws BelowZeroException {
        if (m < 0 || n < 0){
            throw new BelowZeroException("输入的有负数");
        }
        return m / n;
    }
}
