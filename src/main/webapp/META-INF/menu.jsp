<%
    String opcion = request.getParameter("opcion");
%>

<ul class="nav nav-tabs">
    <li class="nav-item">
        <a class="nav-link <%=  (opcion.equals("seminarios")) ? "active" : "" %>" href="SeminariosControlador">Seminarios</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <%=  (opcion.equals("participantes")) ? "active" : "" %>" href="ParticipantesControlador">Participantes</a>
    </li>
   
</ul>
