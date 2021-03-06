package com.foxinmy.weixin4j.pay.payment.coupon;

import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 退款代金券信息
 * 
 * @className RefundCouponInfo
 * @author jinyu(foxinmy@gmail.com)
 * @date 2015年3月24日
 * @since JDK 1.6
 * @see
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RefundCouponInfo implements Serializable {

	private static final long serialVersionUID = -8744999305258786901L;

	/**
	 * 代金券或立减优惠批次ID
	 */
	@XmlElement(name = "coupon_refund_batch_id")
	@JSONField(name = "coupon_refund_batch_id")
	private String couponBatchId;
	/**
	 * 退款代金券ID
	 */
	@XmlElement(name = "coupon_refund_id")
	@JSONField(name = "coupon_refund_id")
	private String couponId;
	/**
	 * 单个代金券或立减优惠支付金额
	 */
	@XmlElement(name = "coupon_refund_fee")
	@JSONField(name = "coupon_refund_fee")
	private Integer couponFee;

	protected RefundCouponInfo() {
		// jaxb requried
	}

	public String getCouponBatchId() {
		return couponBatchId;
	}

	public void setCouponBatchId(String couponBatchId) {
		this.couponBatchId = couponBatchId;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Integer getCouponFee() {
		return couponFee;
	}

	public void setCouponFee(Integer couponFee) {
		this.couponFee = couponFee;
	}

	/**
	 * <font color="red">调用接口获取单位为分,get方法转换为元方便使用</font>
	 * 
	 * @return 元单位
	 */
	@JSONField(serialize = false)
	public double getFormatCouponFee() {
		return couponFee != null ? couponFee.doubleValue() / 100d : 0d;
	}

	@Override
	public String toString() {
		return "couponBatchId=" + couponBatchId + ", couponId=" + couponId
				+ ", couponFee=" + couponFee;
	}
}
