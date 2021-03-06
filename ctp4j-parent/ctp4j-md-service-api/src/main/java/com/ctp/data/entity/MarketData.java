package com.ctp.data.entity;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class MarketData extends AbstractDocument{

	private static final long serialVersionUID = 710870747596637383L;

	/**时间*/
	private String dateTimeStr;
		
	/**交易日*/
	private String tradingDay;
		
	/**合约代码*/
	private String instrumentID;
		
	/**交易所代码*/
	private String exchangeID;
		
	/**合约在交易所的代码*/
	private String exchangeInstID;
		
	/**最新价*/
	private Double lastPrice;
		
	/**上次结算价L*/
	private Double preSettlementPrice;
		
	/**昨收盘*/
	private Double preClosePrice;
		
	/**昨持仓量*/
	private Double preOpenInterest;
		
	/**今开盘*/
	private Double openPrice;
		
	/**最高价*/
	private Double highestPrice;
		
	/**最低价*/
	private Double lowestPrice;
		
	/**数量*/
	private Integer volume;
		
	/**成交金额*/
	private Double turnover;
		
	/**持仓量*/
	private Double openInterest;
		
	/**今收盘*/
	private Double closePrice;
		
	/**本次结算价*/
	private Double settlementPrice;
		
	/**涨停板价*/
	private Double upperLimitPrice;
		
	/**跌停板价*/
	private Double lowerLimitPrice;
		
	/**昨虚实度*/
	private Double preDelta;
		
	/**今虚实度*/
	private Double currDelta;
		
	/**最后修改时间*/
	private String updateTime;
		
	/**最后修改毫秒*/
	private Integer updateMillisec;
		
	/**申买价一*/
	private Double BidPrice1;
		
	/**申买量一*/
	private Integer bidVolume1;
		
	/**申卖价一*/
	private Double askPrice1;
		
	/**申卖量一*/
	private Integer askVolume1;
		
	/**申买价二*/
	private Double bidPrice2;
		
	/**申买量二*/
	private Integer bidVolume2;
		
	/**申卖价二*/
	private Double askPrice2;
		
	/**申卖量二*/
	private Integer askVolume2;
		
	/**申买价三*/
	private Double bidPrice3;
		
	/**申买量三*/
	private Integer bidVolume3;
		
	/**申卖价三*/
	private Double askPrice3;
		
	/**申卖量三*/
	private Integer askVolume3;
		
	/**申买价四*/
	private Double bidPrice4;
		
	/**申买量四*/
	private Integer bidVolume4;
		
	/**申卖价四*/
	private Double askPrice4;
		
	/**申卖量四*/
	private Integer askVolume4;
		
	/**申买价五*/
	private Double bidPrice5;
		
	/**申买量五*/
	private Integer bidVolume5;
		
	/**申卖价五*/
	private Double askPrice5;
		
	/**申卖量五*/
	private Integer askVolume5;
		
	/**当日均价*/
	private Double averagePrice;
		
	/**业务日期*/
	private String actionDay;
	
	//~~===========one to one properties
		
	//~~===========many to one properties
		
	//~===========one to many properties
			
		
	// constructors
	public MarketData() {
		initialize();
	}
	
	protected void initialize () {}
	
			
//	/**
//	 * Return the value associated with the column: ${property.columnName}
//	 */
//	public Long getTradingDateTime() {
//		return tradingDateTime;
//	}
//	/**
//	 * Set the value related to the column: ${property.columnName}
//	 * @param tradingDateTime the ${property.columnName} value
//	 */
//	public void setTradingDateTime(Long tradingDateTime) {
//		this.tradingDateTime = tradingDateTime;
//	}
//	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public String getTradingDay() {
		return tradingDay;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param tradingDay the ${property.columnName} value
	 */
	public void setTradingDay(String tradingDay) {
		this.tradingDay = tradingDay;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public String getInstrumentID() {
		return instrumentID;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param instrumentID the ${property.columnName} value
	 */
	public void setInstrumentID(String instrumentID) {
		this.instrumentID = instrumentID;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public String getExchangeID() {
		return exchangeID;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param exchangeID the ${property.columnName} value
	 */
	public void setExchangeID(String exchangeID) {
		this.exchangeID = exchangeID;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public String getExchangeInstID() {
		return exchangeInstID;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param exchangeInstID the ${property.columnName} value
	 */
	public void setExchangeInstID(String exchangeInstID) {
		this.exchangeInstID = exchangeInstID;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getLastPrice() {
		return lastPrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param lastPrice the ${property.columnName} value
	 */
	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getPreSettlementPrice() {
		return preSettlementPrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param preSettlementPrice the ${property.columnName} value
	 */
	public void setPreSettlementPrice(Double preSettlementPrice) {
		this.preSettlementPrice = preSettlementPrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getPreClosePrice() {
		return preClosePrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param preClosePrice the ${property.columnName} value
	 */
	public void setPreClosePrice(Double preClosePrice) {
		this.preClosePrice = preClosePrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getPreOpenInterest() {
		return preOpenInterest;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param preOpenInterest the ${property.columnName} value
	 */
	public void setPreOpenInterest(Double preOpenInterest) {
		this.preOpenInterest = preOpenInterest;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getOpenPrice() {
		return openPrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param openPrice the ${property.columnName} value
	 */
	public void setOpenPrice(Double openPrice) {
		this.openPrice = openPrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getHighestPrice() {
		return highestPrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param highestPrice the ${property.columnName} value
	 */
	public void setHighestPrice(Double highestPrice) {
		this.highestPrice = highestPrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getLowestPrice() {
		return lowestPrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param lowestPrice the ${property.columnName} value
	 */
	public void setLowestPrice(Double lowestPrice) {
		this.lowestPrice = lowestPrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getVolume() {
		return volume;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param volume the ${property.columnName} value
	 */
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getTurnover() {
		return turnover;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param turnover the ${property.columnName} value
	 */
	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getOpenInterest() {
		return openInterest;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param openInterest the ${property.columnName} value
	 */
	public void setOpenInterest(Double openInterest) {
		this.openInterest = openInterest;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getClosePrice() {
		return closePrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param closePrice the ${property.columnName} value
	 */
	public void setClosePrice(Double closePrice) {
		this.closePrice = closePrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getSettlementPrice() {
		return settlementPrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param settlementPrice the ${property.columnName} value
	 */
	public void setSettlementPrice(Double settlementPrice) {
		this.settlementPrice = settlementPrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getUpperLimitPrice() {
		return upperLimitPrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param upperLimitPrice the ${property.columnName} value
	 */
	public void setUpperLimitPrice(Double upperLimitPrice) {
		this.upperLimitPrice = upperLimitPrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getLowerLimitPrice() {
		return lowerLimitPrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param lowerLimitPrice the ${property.columnName} value
	 */
	public void setLowerLimitPrice(Double lowerLimitPrice) {
		this.lowerLimitPrice = lowerLimitPrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getPreDelta() {
		return preDelta;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param preDelta the ${property.columnName} value
	 */
	public void setPreDelta(Double preDelta) {
		this.preDelta = preDelta;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getCurrDelta() {
		return currDelta;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param currDelta the ${property.columnName} value
	 */
	public void setCurrDelta(Double currDelta) {
		this.currDelta = currDelta;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param updateTime the ${property.columnName} value
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getUpdateMillisec() {
		return updateMillisec;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param updateMillisec the ${property.columnName} value
	 */
	public void setUpdateMillisec(Integer updateMillisec) {
		this.updateMillisec = updateMillisec;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getBidPrice1() {
		return BidPrice1;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param BidPrice1 the ${property.columnName} value
	 */
	public void setBidPrice1(Double BidPrice1) {
		this.BidPrice1 = BidPrice1;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getBidVolume1() {
		return bidVolume1;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidVolume1 the ${property.columnName} value
	 */
	public void setBidVolume1(Integer bidVolume1) {
		this.bidVolume1 = bidVolume1;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getAskPrice1() {
		return askPrice1;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askPrice1 the ${property.columnName} value
	 */
	public void setAskPrice1(Double askPrice1) {
		this.askPrice1 = askPrice1;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getAskVolume1() {
		return askVolume1;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askVolume1 the ${property.columnName} value
	 */
	public void setAskVolume1(Integer askVolume1) {
		this.askVolume1 = askVolume1;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getBidPrice2() {
		return bidPrice2;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidPrice2 the ${property.columnName} value
	 */
	public void setBidPrice2(Double bidPrice2) {
		this.bidPrice2 = bidPrice2;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getBidVolume2() {
		return bidVolume2;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidVolume2 the ${property.columnName} value
	 */
	public void setBidVolume2(Integer bidVolume2) {
		this.bidVolume2 = bidVolume2;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getAskPrice2() {
		return askPrice2;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askPrice2 the ${property.columnName} value
	 */
	public void setAskPrice2(Double askPrice2) {
		this.askPrice2 = askPrice2;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getAskVolume2() {
		return askVolume2;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askVolume2 the ${property.columnName} value
	 */
	public void setAskVolume2(Integer askVolume2) {
		this.askVolume2 = askVolume2;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getBidPrice3() {
		return bidPrice3;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidPrice3 the ${property.columnName} value
	 */
	public void setBidPrice3(Double bidPrice3) {
		this.bidPrice3 = bidPrice3;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getBidVolume3() {
		return bidVolume3;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidVolume3 the ${property.columnName} value
	 */
	public void setBidVolume3(Integer bidVolume3) {
		this.bidVolume3 = bidVolume3;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getAskPrice3() {
		return askPrice3;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askPrice3 the ${property.columnName} value
	 */
	public void setAskPrice3(Double askPrice3) {
		this.askPrice3 = askPrice3;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getAskVolume3() {
		return askVolume3;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askVolume3 the ${property.columnName} value
	 */
	public void setAskVolume3(Integer askVolume3) {
		this.askVolume3 = askVolume3;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getBidPrice4() {
		return bidPrice4;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidPrice4 the ${property.columnName} value
	 */
	public void setBidPrice4(Double bidPrice4) {
		this.bidPrice4 = bidPrice4;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getBidVolume4() {
		return bidVolume4;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidVolume4 the ${property.columnName} value
	 */
	public void setBidVolume4(Integer bidVolume4) {
		this.bidVolume4 = bidVolume4;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getAskPrice4() {
		return askPrice4;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askPrice4 the ${property.columnName} value
	 */
	public void setAskPrice4(Double askPrice4) {
		this.askPrice4 = askPrice4;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getAskVolume4() {
		return askVolume4;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askVolume4 the ${property.columnName} value
	 */
	public void setAskVolume4(Integer askVolume4) {
		this.askVolume4 = askVolume4;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getBidPrice5() {
		return bidPrice5;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidPrice5 the ${property.columnName} value
	 */
	public void setBidPrice5(Double bidPrice5) {
		this.bidPrice5 = bidPrice5;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getBidVolume5() {
		return bidVolume5;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param bidVolume5 the ${property.columnName} value
	 */
	public void setBidVolume5(Integer bidVolume5) {
		this.bidVolume5 = bidVolume5;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getAskPrice5() {
		return askPrice5;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askPrice5 the ${property.columnName} value
	 */
	public void setAskPrice5(Double askPrice5) {
		this.askPrice5 = askPrice5;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Integer getAskVolume5() {
		return askVolume5;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param askVolume5 the ${property.columnName} value
	 */
	public void setAskVolume5(Integer askVolume5) {
		this.askVolume5 = askVolume5;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public Double getAveragePrice() {
		return averagePrice;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param averagePrice the ${property.columnName} value
	 */
	public void setAveragePrice(Double averagePrice) {
		this.averagePrice = averagePrice;
	}
	
		
	/**
	 * Return the value associated with the column: ${property.columnName}
	 */
	public String getActionDay() {
		return actionDay;
	}
	/**
	 * Set the value related to the column: ${property.columnName}
	 * @param actionDay the ${property.columnName} value
	 */
	public void setActionDay(String actionDay) {
		this.actionDay = actionDay;
	}

	public String getDateTimeStr() {
		return dateTimeStr;
	}

	public void setDateTimeStr(String dateTimeStr) {
		this.dateTimeStr = dateTimeStr;
	}

}
