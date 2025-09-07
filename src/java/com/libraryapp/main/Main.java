package java.com.libraryapp.main;

import com.sun.net.httpserver.HttpServer;
import java.com.libraryapp.handler.LivroHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/livros", new LivroHandler());

        server.setExecutor(null);
        server.start();
        System.out.println("Servidor rodando em http://localhost:8000/livros");
    }
}

