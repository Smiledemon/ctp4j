package com.ctp.ta4j.strategy.extra.indicators.candles;

import java.util.Comparator;

import eu.verdelhan.ta4j.Decimal;

public class MapKeyComparator implements Comparator<Decimal>{

	@Override
	public int compare(Decimal decimal1, Decimal decimal2) {
		
		return decimal1.isLessThan(decimal2)?1:0;
	}
}