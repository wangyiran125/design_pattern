package com.state.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class TCPConnection {
    private TCPState tcpState;
    public void open(){
        tcpState.open();
    }
    public void close(){
        tcpState.close();
    }
    public void acknowledge(){
        tcpState.acknowledge();
    }

    public TCPConnection(TCPState tcpState) {
        this.tcpState = tcpState;
    }

    public void setTcpState(TCPState tcpState) {
        this.tcpState = tcpState;
    }
}
