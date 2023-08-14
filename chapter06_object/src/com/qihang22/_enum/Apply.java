package com.qihang22._enum;

/**
 * ClassName: Apply
 * Package: com.qihang22._enum
 * Description:
 *      枚举类型本质上也是一种类，只不过是这个类的对象是有限的、固定的几个，不能让用户随意创建。
 *
 * 枚举类的例子举不胜举：
 *      星期：Monday(星期一)......Sunday(星期天)
 *      性别：Man(男)、Woman(女)
 *      月份：January(1月)......December(12月)
 *      季节：Spring(春节)......Winter(冬天)
 *      三原色：red(红色)、green(绿色)、blue(蓝色)
 *      支付方式：Cash（现金）、WeChatPay（微信）、Alipay(支付宝)、BankCard(银行卡)、CreditCard(信用卡)
 *      就职状态：Busy(忙碌)、Free(空闲)、Vocation(休假)、Dimission(离职)
 *      订单状态：Nonpayment（未付款）、Paid（已付款）、Fulfilled（已配货）、Delivered（已发货）、Checked（已确认收货）、Return（退货）、Exchange（换货）、Cancel（取消）
 *      线程状态：创建、就绪、运行、阻塞、死亡
 *      若枚举只有一个对象, 则可以作为一种单例模式的实现方式。
 *
 * 枚举类的实现：
 *      在JDK5.0 之前，需要程序员自定义枚举类型。
 *      在JDK5.0 之后，Java支持enum关键字来快速定义枚举类型。
 *
 * 3．开发中的建议:
 * >开发中，如果针对于某个类，其实例是确定个数的。则推荐将此类声明为枚举类。
 * >如果枚举类的实例只有一个，则可以看做是单例的实现方式。
 *
 *
 * @Author 刘起航
 * @Create 2023/7/24 9:25
 * @Version 1.0
 */
public class Apply {
}
