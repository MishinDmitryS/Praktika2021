package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GetIndexPageServlet extends HttpServlet {

    private final static String index = "/WEB-INF/view/index.jsp";

    private List<String> FileLine;

    @Override
    public void init() throws ServletException {
        FileLine = new CopyOnWriteArrayList<>();
        FileLine.add(new String("Файл первый"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("FileLine", FileLine);
        req.getRequestDispatcher(index).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");

        File file = new File("C:\\Users\\Dmitry\\Desktop\\text.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while (((line = reader.readLine()) != null) && (i < 2) ) {
                FileLine.add(line);
                i++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        doGet(req, resp);
    }
}
