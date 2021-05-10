package com.example.demo;

import model.Card;
import model.CardManager;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "getCardsServlet", value = "/get-cards")
public class GetCards extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.getServletContext().setAttribute("cards", CardManager.getInstance().getCards());
        List<Card> a = CardManager.getInstance().getCards();
        this.getServletContext().getRequestDispatcher( "/cards.jsp" ).forward( request, response );
    }

    public void destroy() {
    }
}