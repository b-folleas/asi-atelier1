package com.example.demo;

import model.Card;
import model.CardManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "createCard", value = "/create-card")
public class CreateCard extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");

        CardManager.getInstance().addCard(new Card(Integer.parseInt(id), name, description));

        this.getServletContext().getRequestDispatcher( "/cards.jsp" ).forward( request, response );
    }

    public void destroy() {
    }
}