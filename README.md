<h1>Bootcamp Banco Pan</h1>
<h3>Desafio: Abstraindo Um Bootcamp Usando O OO Em Java</h3>
<p>
    Para resolver o desafio proposto, utilizei a linguagem Java, 
    conforme requisitado, e me baseei nos principais pilares da programação orientada a objetos, 
    que são: abstração, encapsulamento, herança e polimorfismo.
</p>
<p>
    Para gerenciar as dependências do projeto e executar o processo de construção, 
    optei por utilizar a ferramenta Maven, que simplifica e automatiza essas tarefas.
</p>


O domínio da aplicação é constituído por um conjunto de classes que representam 
as entidades e conceitos relevantes para o problema em questão.

<b>As principais classes presentes no domínio da aplicação são:</b>

- <b>Classe Bootcamp</b>: modela os bootcamps que serão cadastrados na aplicação.
- <b>Classe Course:</b> representa um curso que será disponível no bootcamp.
- <b>Classe LiveCourse:</b> classe filha da classe "Course" representa um curso que será realizado ao vivo.
- <b>Classe RecordedCourse:</b> classe filha da classe "Course" representa um curso gravado do bootcamp.
- <b>Classe Student:</b> representa os alunos que irão se matricular num bootcamp.
- <b>Classe Teacher:</b> representa os professores que irão ministrar os cursos(aulas).

Na Classe Student, foram implementados os seguintes métodos para que um aluno possa se matricular, 
assistir a um curso e progredir:

- <b>enrollBootcamp(@NotNull Bootcamp bootcamp):</b>
O método recebe um objeto Bootcamp "not null" como parâmetro. 
Ele adiciona o nome do bootcamp ao conjunto dos bootcamps do aluno 
e o matricula no bootcamp especificado. </br></br>
  <img src=".\snapshot/code-snapshot-enroll.png" title="método EnrollBootcamp - code snapshot"/></br></br>

- <b>makeCourse(@NotNull Course course):</b>
O método recebe um objeto Course "not null" como parâmetro. 
Ele verifica se o status é igual a "unseen", se for ele seta o status como "seen".  </br>
  <img src=".\snapshot/code-snapshot-makecourse.png" title="método makeCourse - code snapshot"/></br></br>

- <b>progress(@NotNull Bootcamp bootcamp):</b>
O método recebe um objeto Bootcamp "not null" como parâmetro. 
Ele cria uma lista com o status dos cursos, depois verifica se a lista só contém a palavra "seen", se for, ele
adicina o nome do bootcamp ao conjunto dos bootcamps concluídos.
</br>
</br>
  <img src=".\snapshot/code-snapshot-progress.png" title="método EnrollBootcamp - code snapshot"/>



Além desses métodos, também podem existir outros métodos relevantes para o domínio da aplicação, 
como "cancelEnrollment", "getAllTeacher", "getAllCourse", entre outros. 
Tudo depende do escopo e das funcionalidades da aplicação.
