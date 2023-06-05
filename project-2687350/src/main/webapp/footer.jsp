<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<footer>
    <div class="footer-text text-center">
      <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados MI-APP &copy;<%=displayDate()%></p>
    </div>
  </footer>



  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

  <%!
    public String displayDate() {
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
      Date date = Calendar.getInstance().getTime();
      return dateFormat.format(date);
    }
  %>
  </body>
</html>
