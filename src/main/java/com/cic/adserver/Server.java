package com.cic.adserver;

/**
 * Created by liuyq on 2015/5/17.
 */
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TBinaryProtocol.Factory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.server.TThreadPoolServer.Args;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
public class Server {

    public void startServer() {
        try {
            System.out.println("thrift server open port 1267");
            TServerSocket serverTransport = new TServerSocket(1267);
            AdServerService.Processor process = new Processor(new AdServerHandler());
            Factory portFactory = new TBinaryProtocol.Factory(true, true);
            Args args = new Args(serverTransport);
            args.processor(process);
            args.protocolFactory(portFactory);
            TServer server = new TThreadPoolServer(args);
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("thrift server init");
        Server server = new Server();
        System.out.println("thrift server start");
        server.startServer();
        System.out.println("thrift server end");
    }


}
