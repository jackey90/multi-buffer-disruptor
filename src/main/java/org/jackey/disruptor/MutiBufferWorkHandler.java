package org.jackey.disruptor;


import com.lmax.disruptor.EventHandler;

public class MutiBufferWorkHandler<T> implements EventHandler<T>{

	@Override
	public void onEvent(T event, long sequence, boolean endOfBatch)
			throws Exception {
		
	}

}
