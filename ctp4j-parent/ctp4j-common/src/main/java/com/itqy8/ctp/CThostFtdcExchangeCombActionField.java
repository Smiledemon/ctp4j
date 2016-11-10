/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcExchangeCombActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcExchangeCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDirection(char value) {
    ctpJNI.CThostFtdcExchangeCombActionField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpJNI.CThostFtdcExchangeCombActionField_Direction_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CThostFtdcExchangeCombActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CThostFtdcExchangeCombActionField_Volume_get(swigCPtr, this);
  }

  public void setCombDirection(char value) {
    ctpJNI.CThostFtdcExchangeCombActionField_CombDirection_set(swigCPtr, this, value);
  }

  public char getCombDirection() {
    return ctpJNI.CThostFtdcExchangeCombActionField_CombDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CThostFtdcExchangeCombActionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CThostFtdcExchangeCombActionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpJNI.CThostFtdcExchangeCombActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpJNI.CThostFtdcExchangeCombActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcExchangeCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcExchangeCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcExchangeCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcExchangeCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcExchangeCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcExchangeCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CThostFtdcExchangeCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CThostFtdcExchangeCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcExchangeCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcExchangeCombActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcExchangeCombActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcExchangeCombActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionStatus(char value) {
    ctpJNI.CThostFtdcExchangeCombActionField_ActionStatus_set(swigCPtr, this, value);
  }

  public char getActionStatus() {
    return ctpJNI.CThostFtdcExchangeCombActionField_ActionStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpJNI.CThostFtdcExchangeCombActionField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpJNI.CThostFtdcExchangeCombActionField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcExchangeCombActionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcExchangeCombActionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CThostFtdcExchangeCombActionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CThostFtdcExchangeCombActionField_SettlementID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CThostFtdcExchangeCombActionField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CThostFtdcExchangeCombActionField_SequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcExchangeCombActionField() {
    this(ctpJNI.new_CThostFtdcExchangeCombActionField(), true);
  }

}