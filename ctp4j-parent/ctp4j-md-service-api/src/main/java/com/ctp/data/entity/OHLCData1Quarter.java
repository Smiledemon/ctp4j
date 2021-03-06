package com.ctp.data.entity;

import com.ctp.util.TimeDateUtils;

public class OHLCData1Quarter extends OHLCDataItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3009409325996162037L;

	@Override
	public long[] timePeriod(long now) {
		long[] tp = new long[2];
		tp[0]=TimeDateUtils.getCurrentQuarterStartTime(now);
		tp[1]=TimeDateUtils.getCurrentQuarterEndTime(now);
		return null;
	}

	@Override
	public <T> Class<? extends OHLCDataItem> getSubClass() {
		return OHLCData1Day.class;
	}

	
}
