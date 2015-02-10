package org.jackey.disruptor;

import com.lmax.disruptor.AlertException;
import com.lmax.disruptor.DataProvider;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.Sequence;
import com.lmax.disruptor.SequenceBarrier;
import com.lmax.disruptor.TimeoutException;

public class PriorityProcessStrategy implements MutiBufferProcessStrategy {

	@Override
	public boolean process(final DataProvider[] providers,
			SequenceBarrier[] barriers, EventHandler handler,
			Sequence[] sequences) throws AlertException, InterruptedException,
			TimeoutException {
		
		return true;
	}

}
