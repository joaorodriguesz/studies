# Java-SERVLET

> Java Servlet é uma tecnologia utilizada para criar aplicações web em Java. Ele fornece uma maneira de estender a funcionalidade de servidores web, permitindo que você processe solicitações HTTP, gere respostas e interaja com o cliente. Os Servlets são geralmente parte integrante de aplicações web Java e funcionam como controladores que manipulam solicitações e respostas entre o cliente (navegador) e o servidor web.

---

## Servlet

> ```java
> import java.io.IOException;
> import javax.servlet.ServletException;
> import javax.servlet.annotation.WebServlet;
> import javax.servlet.http.HttpServlet;
> import javax.servlet.http.HttpServletRequest;
> import javax.servlet.http.HttpServletResponse;
> 
> @WebServlet("/hello")
> public class HelloWorldServlet extends HttpServlet {
>     protected void doGet(HttpServletRequest request, HttpServletResponse response)
>             throws ServletException, IOException {
>         response.setContentType("text/html");
>         response.getWriter().println("<html><body><h1>Hello, World! (GET)</h1></body></html>");
>     }
> 
>     protected void doPost(HttpServletRequest request, HttpServletResponse response)
>             throws ServletException, IOException {
>         response.setContentType("text/html");
>         response.getWriter().println("<html><body><h1>Hello, World! (POST)</h1></body></html>");
>     }
> 
>     protected void doPut(HttpServletRequest request, HttpServletResponse response)
>             throws ServletException, IOException {
>         response.setContentType("text/html");
>         response.getWriter().println("<html><body><h1>Hello, World! (PUT)</h1></body></html>");
>     }
> }
> 
> ```
>
> 
