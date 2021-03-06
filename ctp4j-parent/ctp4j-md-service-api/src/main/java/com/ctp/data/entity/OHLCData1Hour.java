package com.ctp.data.entity;

import com.ctp.util.TimeDateUtils;

public class OHLCData1Hour extends OHLCDataItem{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5775776620634892318L;

	@Override
	public long[] timePeriod(long now) {
		return TimeDateUtils.timePeriod(now, 3600000);
	}

	@Override
	public <T> Class<? extends OHLCDataItem> getSubClass() {
		return OHLCData30Minute.class;
	}


}
