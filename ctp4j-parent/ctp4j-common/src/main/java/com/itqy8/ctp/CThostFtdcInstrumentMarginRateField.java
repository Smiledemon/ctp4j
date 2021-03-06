/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcInstrumentMarginRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInstrumentMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentMarginRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcInstrumentMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    ctpJNI.CThostFtdcInstrumentMarginRateField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return ctpJNI.CThostFtdcInstrumentMarginRateField_IsRelative_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentMarginRateField() {
    this(ctpJNI.new_CThostFtdcInstrumentMarginRateField(), true);
  }

}
