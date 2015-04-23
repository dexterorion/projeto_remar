<ul>
  <g:each var="i" in="${jogos}">
    <li><g:link action="iniciar_desenvolvimento" id="${i[0]}">${i[1]}</g:link></li>
  </g:each>
</ul>