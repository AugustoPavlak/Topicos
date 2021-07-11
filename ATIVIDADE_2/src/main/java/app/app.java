package app;

import database.ConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Produto;

@WebServlet("")
public class app extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ConnectionFactory connFactory = new ConnectionFactory();
		Connection conn = connFactory.getConnection();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tb_product");
			
			ResultSet result = stmt.executeQuery();
			
			List<Produto> produtos = new ArrayList<Produto>();
			while(result.next()) {
				Produto produto = new Produto(result.getLong("id"),result.getString("name"), result.getString("image_url"),result.getDouble("price"), result.getString("description"));
				produtos.add(produto);
			}
			
			req.setAttribute("produtos",produtos);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			
			dispatcher.forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
