package com.state.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class Test {
    public static void main(String[] args) {
        TCPEstablished tcpEstablished = new TCPEstablished();
        TCPConnection tcpConnection = new TCPConnection(tcpEstablished);
        tcpConnection.open();
        tcpConnection.close();
        tcpConnection.acknowledge();
        TCPListen tcpListen = new TCPListen();
        tcpConnection.setTcpState(tcpListen);
        tcpConnection.open();
        tcpConnection.close();
        tcpConnection.acknowledge();
    }
}
